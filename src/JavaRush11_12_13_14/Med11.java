package JavaRush11_12_13_14;

class Med11 {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    static class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }

}
