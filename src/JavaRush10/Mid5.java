package JavaRush10;

class Mid5 {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String n = "Петя";
        private String j = "Программист";
        private boolean s = true;
        private int i = 23;
        private int w = 77;
        private int h = 181;

        public Human(String n) {
            this.n = n;
        }
        public Human(String n, String j) {
            this.n = n;
            this.j = j;
        }
        public Human(String n, String j, boolean s) {
            this.n = n;
            this.j = j;
            this.s = s;
        }
        public Human(String n, String j, boolean s, int i) {
            this.n = n;
            this.j = j;
            this.s = s;
            this.i = i;
        }
        public Human(String n, String j, boolean s, int i, int w) {
            this.n = n;
            this.j = j;
            this.s = s;
            this.i = i;
            this.w = w;
        }
        public Human(String n, String j, boolean s, int i, int w, int h) {
            this.n = n;
            this.j = j;
            this.s = s;
            this.i = i;
            this.w = w;
            this.h = h;
        }
        public Human(String n, boolean s, int i, int w, int h) {
            this.n = n;
            this.s = s;
            this.i = i;
            this.w = w;
            this.h = h;
        }
        public Human(String n, String j, int i, int w, int h) {
            this.n = n;
            this.j = j;
            this.i = i;
            this.w = w;
            this.h = h;
        }
        public Human(int h) {
            this.h = h;
        }
        public Human(int w, int h) {
            this.w = w;
            this.h = h;
        }
        public Human(int i, int w, int h) {
            this.i = i;
            this.w = w;
            this.h = h;
        }
    }
}
