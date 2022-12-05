package podstawy;

public class StringiDemo {
    public static void main(String[] args) {
        String name = "Franciszek";

        int dlugosc = name.length();

        char inicjal = name.charAt(0);

        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name +", " + male + ", " );
    }
}
