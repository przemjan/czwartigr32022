package tablice;

public class TabliceDemo3 {
    public static void main(String[] args) {

        int size;
        size = 13;
        int[] liczby = new int[size];

        //automatyczne uzupełnienie tablicy
        for(int i = 0; i < liczby.length; i++){
            liczby[i] = i+10;
        }


        for (int i : liczby){
            System.out.println(i);
        }

    }
}
