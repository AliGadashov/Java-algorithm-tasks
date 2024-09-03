import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Ilk ededi daxil edin: ");
        int a = scan.nextInt();
        System.out.print("Ikinci ededi daxil edin: ");
        int b = scan.nextInt();

        int c = b + a;

        System.out.println("Ilke son ededin cemi: " + c);


    }
}