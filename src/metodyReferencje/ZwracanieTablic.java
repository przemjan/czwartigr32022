package metodyReferencje;

import java.util.Random;
import java.util.Scanner;

public class ZwracanieTablic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy: ");
        int size = scanner.nextInt();

        int[] wartosci = createArray(size);

        fillArray(wartosci);

        printArray(wartosci);


    }
    public static int[] createArray(int rozmiar){

        int[] liczby = new int[rozmiar];
        return liczby;
    }
    public static void fillArray(int[] liczby){
        Random random = new Random();
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt();
        }

    }
    public static void printArray(int[] liczby){
        for (int i : liczby){
            System.out.print(i+", ");
        }
    }

}
