package JavaRush11_12_13_14;

interface Bridge{
    int getCarsCount();
}

public class Med16 {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}
class WaterBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 33;
    }
}

class SuspensionBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 12;
    }
}
