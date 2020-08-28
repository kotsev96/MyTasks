package Enumeration;
// Использование конструктора, переменной экземпляра и
// метода перечисления

enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), ВОАТ(22);// точка запятая!
    private int speed; //Типичная скорость ТС

    // Конструктор
    Transport2(int s) {
        this.speed = s;
    }

    // метод
    int getSpeed() {
        return speed;
    }
}

    public class EnumDemo3 {
        public static void main(String[] args) {
        Transport2 tp2;

        // Отобразить скорость самолета
            System.out.println("Tипичнaя скорость самолета: " +
                    Transport2.AIRPLANE.getSpeed() +
                    " миль в час\n");
        //Отобразить все виды транспорта и скорости их движения
            System.out.println("Tипичныe скорости движения транспортных средств");
            for(Transport2 t : Transport2.values())
                System.out.println(t + ": " +
                        t.getSpeed() +
                        "миль в час");
        }
    }
