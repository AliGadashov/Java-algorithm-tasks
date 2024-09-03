import java.util.Scanner;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 8/16/2024
 * Time: 12:34 PM
 */

public class Tasks1 {

    public static Scanner scanner(){
        return new Scanner(System.in);
    }


    public static void taks1(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Musbet, menfi ve ya sifira beraber olduqunu bilmey istediyiniz bir ededn daxil edin: ");

        int value = scan.nextInt();

        if (value > 0){
            System.out.println("Daxil etdiyiniz eded: " + value + " musbet ededdir");
        }
        else if (value < 0){
            System.out.println("Daxil etdiyiniz eded: " + value + " menfi ededdir");
        }
        else {
            System.out.println("Daxil etdiyiniz eded: " + value + " sifira beraberdir");
        }

    }
    public static void task2(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Cut ve ya tek olduqunu bilmey istediyiniz bir ededi daxil edin: ");

        int value = scan.nextInt();

//        if (value%2>0){
//            System.out.println("Daxil etdiyiniz eded: " + value + " tek ededdir.");
//        }else {
//            System.out.println("Daxil etdiyiniz eded: " + value + " cut ededdir.");
//        }

        //  Or

        String response = value%2>0 ? "Daxil etdiyiniz eded: " + value + " tek ededdir." : "Daxil etdiyiniz eded: " + value + " cut ededdir.";

        System.out.println(response);

    }
    public static void task3(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Temperaturu daxil edin: ");

        int temperature = scan.nextInt();


        if(temperature < -300){
            System.out.println("E day ag eleme buz dovrundemi yasayirsan?");
        }
        else if(temperature < 0){
            System.out.println("Hava dondurucudur");
        }
        else if(temperature < 10){
            System.out.println("Hava soyuqdu");
        }
        else if(temperature <= 25){
            System.out.println("Hava iliqdi");
        }else if (temperature <= 60){
            System.out.println("Hava istidi");
        }else {
            System.out.println("Welcome to hell bitch");
        }

    }
    public static void task4(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Yasinizi daxil edin: ");
        int age = scan.nextInt();

        if (age < 0){
            System.out.println("That is not possible dude");
        }else if(age <= 12){
            System.out.println("Usaq");
        }else if(age <= 19){
            System.out.println("Genc");
        }else if(age <= 64){
            System.out.println("Yetiskin");
        }else if(age<=110){
            System.out.println("Qoca");
        }else {
            System.out.println("IMMORTAL");
        }

    }
    public static void task5(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Balinizi daxil edin");
        int score = scan.nextInt();

        if (score <= 100 && score > 90 ) {
            System.out.println("A");
        }else if (score <= 90 && score > 80 ) {
            System.out.println("B");
        }else if (score <= 80 && score > 70 ) {
            System.out.println("C");
        }else if (score <= 70 && score > 60 ) {
            System.out.println("D");
        }else if (score <= 60 && score > 50 ) {
            System.out.println("F");
        }

    }
    public static void task6(){

        System.out.println("Gununu oyrenmek istediyiniz ayi eded olaraq daxil edin: ");
        Scanner scan = new Scanner(System.in);
        byte month = scan.nextByte();

        switch (month){

            case  1 -> System.out.println("Yanvar 31");
            case  2 -> System.out.println("Fevral 28 ve ya 29");
            case  3 -> System.out.println("Mart 31");
            case  4 -> System.out.println("Aprel 30");
            case  5 -> System.out.println("May 31");
            case  6 -> System.out.println("Iyun 30");
            case  7 -> System.out.println("Iyul 31");
            case  8 -> System.out.println("Avqust 31");
            case  9 -> System.out.println("Sentyabr 30");
            case  10 -> System.out.println("Oktyabr 31");
            case  11 -> System.out.println("Noyabr 30");
            case  12 -> System.out.println("Dekabr 31");
            default -> System.out.println("Ag eleme ele ay yoxdu");

        }

    }
    public static void task7(){
        Scanner scan = new Scanner(System.in);

        System.out.println("ucbucaqin ilk bucaqini daxil edin: ");
        int first = scan.nextInt();

        System.out.println("ucbucaqin ikinci bucaqini daxil edin: ");
        int second = scan.nextInt();

        System.out.println("ucbucaqin ucuncu bucaqini daxil edin: ");
        int third = scan.nextInt();

        if(first+second+third!=180){
            System.out.println("Bu ucbucaq dogru deyil");
        }else{
            System.out.println("bu ucbucaqdir");
        }

    }
    public static void task7v2(){
        Scanner scan = new Scanner(System.in);

        System.out.println("ucbucaqin ilk terefi daxil edin: ");
        int first = scan.nextInt();

        System.out.println("ucbucaqin ikinci terefi daxil edin: ");
        int second = scan.nextInt();

        System.out.println("ucbucaqin ucuncu terefi daxil edin: ");
        int third = scan.nextInt();

        if (first == second && second == third){
            System.out.println("Beraber terefli ucbucaqdir");
        }else if(first+second > third){
            System.out.println("Bu ucbucaq dogru ucbucaqdir");
        }else if(third + second > first){
            System.out.println("Bu ucbucaq dogru ucbucaqdir");
        }else if(third + first > second){
            System.out.println("Bu ucbucaq dogru ucbucaqdir");
        }else{
            System.out.println("bu ucbucaq dogru deyil");
        }

    }
    public static void task8(){
        Scanner scan = new Scanner(System.in);

        boolean error = false;

        int cavab = 0;

        System.out.println("Ilk ededi daxil edin: ");
        int firstNumber = scan.nextInt();

        System.out.println("Aparmaq istediyiniz emeliyati daxil edin: ( + - * / ) ");
        char emeliyat = scan.next().charAt(0);

        System.out.println("Ikinci ededi daxil edin: ");
        int secondNumber = scan.nextInt();

        switch (emeliyat){
            case '+' -> cavab = firstNumber + secondNumber;
            case '-' -> cavab = firstNumber - secondNumber;
            case '*' -> cavab = firstNumber * secondNumber;
            case '/' -> cavab = firstNumber / secondNumber;
            default -> error = true;
        }

        if(error){
            System.out.println("Rovsen mellim deyir duz deyil");
        }else {
            System.out.println(firstNumber + " " + emeliyat + " " + secondNumber + " = " + cavab);
        }

    }

}
