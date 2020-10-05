package OOP;

public class Child extends Parent {
    public String value = "Child";
    int g = 5;

    @Override
    public String getValue() {
        return value;
    }
}
