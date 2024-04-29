
    class Board{
        private String title;
        private String content;
        private int hit;

        Board(String title, String content, int hit){
            this.title = title;
            this.content = content;
            this.hit = hit;
        }

        public String getTitleAndContent(){ return this.title + ": " + this.content; }
        public int getHit(){ return this.hit; }
    }

