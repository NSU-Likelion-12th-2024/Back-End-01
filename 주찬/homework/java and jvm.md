# JVM과 JAVA의 작동원리

---
**목차**

---
**1.JDK,JRE,JVM 설명**

---

**2. JVM(Java Virtual Machine)의 구조와 각 구성요소 기능**

* JVM 특징

* JVM 구조

   - 1.클래스 로더 시스템
     + Bootstrap Class Loader
     + Platform Class Loader
     + System Class Loader

   - 2.실행 엔진
     + interpreter
     + JIT 컴파일러

   - 3.메모리
     + Pc Register
     + Stack
     + Frame
     + Native Method Stack
     + Heap
     + Method
     + Runtime Constant Pool

     
---

**3. 자바 프로그램의 동작 원리**

---

## 1.JDK,JRE,JVM
    JDK- 자바 어플리케이션은 개발하기 위해 필요한 도구로 .jar의 형태로 이루어진 파일이 보통 JDK 파일이고
    jar 말고도 javac(자바 컴파일러),javap(역 어셈블리어).javadoc 등 여러가지 파일의 형태로 존재한다.

    JRE- JDK는 개발 환경을 위한 도구라면 JRE는 실행 환경을 위한 도구라고 생각하면 되고 JVM,자바 클래스 라이브러리, 기타 자바 어플리케이션 실행에 필요한 파일들을 포함한다.

    JVM- Java Virtual Machine 즉, 자바를 실행하기 위한 가상 기계이며 자바 프로그램 실행환경을 만들어 주는 소프트웨어이다.
    자바 코드를 컴파일하여 .class 바이트 코드로 만들면 이 코드가 자바 가상 머신 환경에서 실행되고 JVM은 JRE에 종속이 되어 있어 JRE가 설치되엉 있다면 JVM도 설치가 되어 있는 것이다

![img_2.png](img_2.png)
`<JDK,JRE,JVM의 구조>`

---

## 2. JVM(Java Virtual Machine)의 구조와 각 구성요소 기능

**JVM의 특징**

    1.스택 기반의 가상 머신이다.

    2.참고하는 클래스의 특정 메모리 주소를 참조 관계로 구성하지 않고 이름만 가진다

    3.클래스 인스턴스는 사용자 코드에 의해 명시적으로 생성되고 가비지 컬렌셕에 의해 자동을 파괴된다.

    4.기본 자료형을 명확하게 정의하여 호환성을 유지하고 플랫폼 독립성을 보장한다.


**JVM의 구조**

![img_3.png](img_3.png)

1.클래스 로더 시스템 - 클래스 파일의 바이트 코드를 읽어 런타임 데이터 영억으로 가져오고 부트스트랩,플랫폼,시스템 이렇게 3가지 로더로 구분된다.

    Bootstrap Class Loader:JVM이 시작될 때 실행되며 java.lang package 처럼 JVM 실행에 필요한 클래스들을 로딩한다.

    Platform Class Loader:java.lang.ClassLoader의 인스턴스로 Java SE platform API 등 자바에서 기본적으로 제공해주는 클래스를 로딩할 때 사용된다.

    System Class Loader:java.lang.ClassLoader의 인스턴스로 유저가 작성한 클래스를 로딩할 때 사용된다.

![img_4.png](img_4.png)

`Jvm의 로딩,링크,초기화 과정`


2.실행엔진 = 바이트 코드를 읽는 방식

    Interpreter 방식: 바이트코드를 한 줄씩 해석, 실행하는 방식입니다. 초기 방식으로, 속도가 느리다

    JIT 컴파일 방식:Interpreter 방식의 느린 속도를 보완하여 나온 JIT 컴파일러는 같은 코드를 매번 해석하지 않고, 실행할 때 컴파일을 하면서 해당 코드를 캐싱해버립니다. 
    이후에는 바뀐 부분만 컴파일하고, 나머지는 캐싱된 코드를 사용합니다.

![img_5.png](img_5.png)

3.메모리

    PC Register : 쓰레드가 생성될 때마다 생성되는 영역으로 현재 쓰레드가 실행되는 부분의 주소와 명령을 저장하고 있는 영역이며 이것을 이용해 쓰레드를 돌아가며 수행할 수 있게 한다.

    Stack : 지역 변수,파라미터,리턴 값,연산에 사용되는 임시 값등이 생성되는 영역으로 클래스 수준의 정보를 저장하고 공유자원이다.

    Native Method Stack: 자바 외 언어로 작성된 네이티브 코드를 위한 메모리영역으로 보통 C/C++등의 코드를 수행하기 위한 스택이다.

    heap: new 키워드로 생성된 객체와 배열이 생성되는 영역이며 메소드 영역에 로드된 클래스만 생성이 가능하고 참조되지 않는 메모리를 확인/제거하는 영역이다. 

    Method: 모든 스레드가 공유하는 영역으로 JVM이 시작될 때 생성된다.

    Frame : 반환 값을 저장하는 자료구조이며 프레임은 함수가 호출될 때 생성되고 함수가 종료되면 사라진다.

    Runtime Constant Pool: 런타임 상수 풀은 클래스, 인터페이스 마다 존재하며 클래스 파일의 constant pool 테이블 영역이 저장되는 공간이다.
    각 클래스, 인터페이스의 전역 변수, 함수, 인스턴스 변수, 함수에 대한 심볼릭 링크가 존재하며 클래스가 생성되어 Heap에 할당될 때 만들어지며 클래스가 삭제되면 사라진다.

## 3. 자바 프로그램의 동작 원리

![img_6.png](img_6.png)

우리가 자바로 .java 코드를 작성하고 파워쉘이나 터미널에 있는 자바 컴파일러인 javac에 컴파일 명령을 내리면 .class 파일이 만들어집니다. 이후 이 바이트 코드는 클래스 로더를 통해 JVM Runtime Data Area로 로딩되고 로딩된 .class 바이트 코드를 실행할 컴퓨터에 깔린 JVM에 가져다주면 그 컴퓨터가 이 프로그램을 실행할 때 이 JVM이 그때그때 기계어로 해석합니다. 



