package com.java.test2;

import com.javarush.test.Vehicle;

 class Vehicle1 {
    private int passengers; //количество пассажиров
    private int fuelcap; //емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон

    public Vehicle1(int p, int f, int m) {
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

     public int getPassengers() {
         return passengers;
     }

     public void setPassengers(int p) {
         passengers = p;
     }

     public int getFuelcap() {
         return fuelcap;
     }

     public void setFuelcap(int f) {
         fuelcap = f;
     }

     public int getMpg() {
         return mpg;
     }

     public void setMpg(int m) {
         mpg = m;
     }
 }



class Truck extends Vehicle1 {
    private int cargocap;// грузоподъемность в фунтах

    public Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }
    // Методы доступа к переменной cargocap
    int getCargo() {return cargocap;}
    void putCargo(int c) {cargocap = c;}
}


public class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд объектов
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевести " + semi.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикап может перевести " + pickup.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.\n");
    }
}
