package JavaRush11_12_13_14;

class Easy5 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    public static class Screen implements  Selectable, Updatable{
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
