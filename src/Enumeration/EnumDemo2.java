package Enumeration;

// Использование встроенных методов перечислений.
// Перечисление, представляющее разновидности транспортных средств
enum Transport1 {CAR, TRUCK, AIRPLANE, TRAIN, ВОАТ}

    public class EnumDemo2 {
        public static void main(String[] args) {
           Transport1 tp1;

            System.out.println("Koнcтaнты Transport:");

            // Применение метода values()
            Transport1 allTransports[] = Transport1.values();
            for(Transport1 t : allTransports)
                System.out.println(t);

            System.out.println();

            // Применение метода valueOf()
            tp1 = Transport1.valueOf ("AIRPLANE");
            System.out.println("tp содержит "+ tp1);
        }
}
