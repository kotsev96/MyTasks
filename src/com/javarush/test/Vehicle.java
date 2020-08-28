package com.javarush.test;

public class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Определить дальность поездки транспортного средства
    int range() {
        return  mpg * fuelcap;
    }

    //Рассчитать объем топлива, необходимого ТС для преодоления заданного расстояния
    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;

        // Присвоить значения полям в объекте minivan
        /*minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в объекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;*/

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " +
                gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль спорткару требуется " +
                gallons + " галлонов топлива");
    }
}
