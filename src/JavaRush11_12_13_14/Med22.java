package JavaRush11_12_13_14;

import java.util.ArrayList;
import java.util.List;

public class Med22 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
        for (Apartment apartment : apartments) {
            if (apartments instanceof OneRoomApt)
                ((OneRoomApt) apartments).clean1Room();
            else if (apartments instanceof TwoRoomApt)
                ((TwoRoomApt) apartments).clean2Rooms();
            else if (apartments instanceof ThreeRoomApt)
                ((ThreeRoomApt) apartments).clean3Rooms();
        }

    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
