package com.javarush.test;

class Showbits {
    int numbits;

   public Showbits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;
// Сдвинуть значение 1 влево на нужную позицию
        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>=1){
            if ((val & mask) != 0) System.out.print("l");
            else System.out.print("O");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
                System.out.println();
            }
        }
public class ShowBitsDemo {
    public static void main(String[] args) {
        Showbits x = new Showbits(32);

        System.out.println("dvf");
        x.show(171213);
    }
}


