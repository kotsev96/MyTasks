package JavaRush10;

class Test {
    public static void main(String[] args) {
        float f = 10000;
        long l = (long) (f * f);
        float f2 = l;
        long l2 = (long) f2;
        System.out.println(f2);
    }
}
