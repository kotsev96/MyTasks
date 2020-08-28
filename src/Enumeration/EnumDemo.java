package Enumeration;

enum Transport{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT;
}

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp; // Объявление ссылки на перечисление Transport
        tp = Transport.AIRPLANE; // Присваивание переменной tp значениА в виде константы AIRPLANE

        // Отобразить перечисляемое значение
        System.out.println("Значение tp:" + tp);
        System.out.println();

        tp = Transport.TRAIN; // Проверка равенства двух объектов типа Transport
        // Сравнить два перечисляемых значения
        if (tp == Transport.TRAIN)
            System.out.println("tp содержит TRAIN\n");

        // Использовать перечисление для управления оператором switch
        switch(tp){
            case CAR:
                System.out.println("Aвтoмoбиль перевозит людей");
                break;
            case TRUCK:
                System.out.println("Гpyзoвик перевозит груз");
                break;
            case AIRPLANE:
                System.out.println("Caмoлeт летит");
                break;
            case TRAIN:
                System.out.println("Пoeзд движется по рельсам");
                break;
            case BOAT:
                System.out.println("Лoдкa плывет по воде");
                break;
        }
    }
}
