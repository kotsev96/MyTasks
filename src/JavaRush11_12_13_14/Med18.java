package JavaRush11_12_13_14;



interface CompItem{
    String getName();
}

public class Med18 {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
class Keyboard implements CompItem{
    @Override
    public String getName() {
        return "Keyboard";
    }
}

class Mouse implements CompItem{
    @Override
    public String getName() {
        return "Mouse";
    }
}

class Monitor implements CompItem{
    @Override
    public String getName() {
        return "Monitor";
    }
}

class Computer{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}