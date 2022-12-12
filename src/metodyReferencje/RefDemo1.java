package metodyReferencje;

import java.util.Random;

public class RefDemo1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] liczby = new int[3][];
        liczby[0] = new int[5];
        liczby[1] = new int [7];
        liczby[2] = new int[3];


        wypelnijTablice(liczby);
        System.out.println("Wynik: " +liczby[2][1]);


        drukujTablice(liczby);

    }
    public static void wypelnijTablice(int[][] ints ){

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = random.nextInt(785028841);
            }
        }

    }
    public static void drukujTablice(int[][] ints){

        for (int[] numery:ints){
            for(int i:numery){
                System.out.printf("%-10d ",i);
            }
            System.out.println();
        }
    }

}
