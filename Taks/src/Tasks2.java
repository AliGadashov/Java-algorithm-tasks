import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 8/16/2024
 * Time: 12:34 PM
 */

public class Tasks2 {

    public static Scanner scanner(){
        return new Scanner(System.in);
    }


//        task 4 5 9 -10- 11 16 19 20

    public static void task1(){

        System.out.println("1-dən 10-a qədər olan ədədlərin cəmi");

        int cavab = 0;

        for (int i = 1; i <= 10; i++) {
            cavab+=i;
        }

        System.out.println(cavab);
    }
    public static void task2(){

        System.out.println("Bir ədədin faktorialını hesablayan bir while dövrü");

        int cavab = 1;

        Scanner scanner = scanner();
        System.out.println("Faktoryalini oyrenmek istediyiniz ededi daxil edin: ");
        int eded = scanner.nextInt();
        int firstNum = eded;

        while(eded>1){
            cavab = cavab * eded;
            eded--;
        }

        System.out.println(firstNum + " ededinin faktoryali: " + cavab);
    }
    public static void task3(){

        System.out.println("1-dən 20-yə qədər olan ədədləri dövr istifadə edərək ekrana yazdırın. Ekranda cüt ədədlər və tək ədədlər ayrı-ayrı göstərilsin.\n");

        for (int i = 1; i <= 20 ; i++) {
            if (i%2==0){
                System.out.println(i + " Cut eded");
            }
        }
        System.out.println("----------------------");
        for (int i = 1; i <= 20 ; i++) {
            if (i%2>0){
                System.out.println(i + " Tek eded");
            }
        }

    }
    public static void task4(){

        System.out.println("Bir sıra ədədin içində ən böyük ədədi tapan bir proqram yazın. ");

        int[] ededler = {4, 7, 1, 3, 9};
        int eded = 0;

        System.out.println("Var olan ededler toplusu: " + Arrays.toString(ededler));

        for (int i = 0; i < ededler.length; i++) {
            if (ededler[i] > eded){
                eded = ededler[i];
            }
        }

        System.out.println("Bu ededler toplusunda olan en boyuk eded: " + eded);

    }
    public static void task5(){
        System.out.println(" Bir sıra içindəki elementləri tərsinə çevirən bir for dövrü yazın.");

        int[] ededler = {4, 7, 1, 3, 9};
        int[] temp = new int[5];

        System.out.println("Var olan ededler toplusu: " + Arrays.toString(ededler));

        for (int i = ededler.length-1; i >=0 ; i--) {
            temp[temp.length - i - 1] = ededler[i];
        }

        System.out.println("Tersine cevrilmis ededler toplusu: " + Arrays.toString(temp));

    }
    public static void task6(){
        System.out.println("İlk 10 Fibonacci ədədini hesablayan bir do-while dövrü. ");

        int n1 = 0, n2 = 1, count = 1;

        System.out.print("İlk 10 Fibonacci ededi: " + n1 + ", " + n2);

        do {
            int n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
            count++;
        } while (count < 9);

    }
    public static void task7(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("---------------------");
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " +  j + " = " + (i * j));
            }
            System.out.println("---------------------");
        }
    }
    public static void task8(){
        System.out.println("1-dən 100-ə qədər olan tam kvadrat ədədləri tapan bir for dövrü");

        for (int i = 1; i <=10 ; i++) {
            if(i*i<=100){
                System.out.println(i + " -> " + (i*i));
            }
        }

    }
    public static void task9(){

        System.out.println(" Bir ədədin rəqəmlərini toplamaq üçün bir while dövrü yazın. Məsələn, 123 ədədi üçün rəqəm cəmi 1+2+3=6 olmalıdır.\n");

        Scanner scanner = scanner();
        int eded = scanner.nextInt();
        int temp =  eded;
        int reqem;
        int cem = 0;

        while (temp > 0 ){
            reqem = temp%10;
            temp = temp/10;
            cem +=reqem;
        }

        System.out.println("Daxil olunan ededin reqemleri cemi: " + cem);

    }
//        ========================

    public static void task10(){
        System.out.println("Bir sıra içində təkrarlanan ədədləri tapan bir proqram yazın." +
                " Məsələn, int[] ededler = {2, 4, 6, 2, 8, 4}; sırasındakı təkrarlanan ədədlər 2 və 4-dür.\n");

        int[] ededler = {2, 4, 6, 2, 8, 4};
        int[] tekrarlar;
        System.out.println("Təkrarlanan ədədlər: ");



    }

    public static void task11(){
        System.out.println("Verilən bir sırada minimum və maksimum ədədləri tapan bir proqram yazın.\n");

        int[] ededler = {4, 7, 1, 3, 9};
        int min = ededler[0];
        int max = ededler[0];

        System.out.println("Var olan ededler toplusu: " + Arrays.toString(ededler));

        for (int i = 0; i < ededler.length; i++) {
            if (ededler[i] > max){
                max = ededler[i];
            }
            if (ededler[i] < min){
                 min = ededler[i];
            }
        }

        System.out.println("Bu ededler toplusunda olan en boyuk eded: " + max);
        System.out.println("Bu ededler toplusunda olan en Kicik eded: " + min);

    }
    public static void task12(){
        Scanner scanner = scanner();
        System.out.println("Nece ededin ededi ortasini hesablamaq isteyirsiz: ");
        int say = scanner.nextInt();
        int temp = 0;
        for (int i = 1; i <= say; i++) {
            System.out.println(i + " ededi daxil edin: ");
            say = scanner.nextInt();
            temp += say;
        }

        System.out.println("Daxil etdiyiniz ededlerin ededi ortasi: " + (temp / say));
    }
    public static void task13(){
        System.out.println(" 1-dən 50-yə qədər olan sadə ədədləri tapan bir proqram.");

        for (int i = 4; i <=50; i++) {
            int count = 0;
            for (int j = 1; j <=i; j++) {
                if (i%j == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i + " sade ededdir");
            }
            else {
                System.out.println(i + " sade eded deyil");
            }
        }

    }
    public static void task14(){

        System.out.println("Verilən bir ədədin rəqəmlərinin tərsini tapan bir while dövrü.");

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");

        int eded = scanner.nextInt();
        int temp = eded;
        int newEded = 0;
        int reqem;
        int count=0;

        while (eded%10>=1){
            eded /=10;
            count++;
        }

        eded = temp;

        for (int i = 1; i <=count ; i++) {
            reqem = eded % 10;
            eded /=10;
            newEded = newEded * 10 + reqem;
        }

        System.out.println("Ededin tersine cevrilmis hali: " + newEded);

    }
    public static void task15(){

        Scanner scanner = scanner();

        System.out.println("Ilk ededi daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int b = scanner.nextInt();
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Ilk: " + a + " Ikinci: " + b);

    }
    public static void task15v2(){

        Scanner scanner = scanner();
        System.out.println("Ilk ededi daxil edin: ");
        int a = scanner().nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int b = scanner().nextInt();

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("Ilk: " + a + " Ikinci: " + b);

    }
    public static void task16(){
        System.out.println("Verilən bir rəqəmin istənilən digər rəqəmin çoxluğu olub-olmadığını yoxlayan bir proqram yazın.\n");

        int[] ededler = {4, 7, 1, 3, 9};

        Scanner scanner = scanner();
        System.out.println("1 ile 10 arasinda bir eded daxil edin: ");
        int daxilOlunanEded = scanner().nextInt();
        boolean sert = false;

        for (int i = 0; i < ededler.length; i++) {
            if (daxilOlunanEded==ededler[i]){
                sert = true;
            }
        }

        if(sert){
            System.out.println("Daxil olunan eded verilen ededler toplusunda movcuddur.");
        }else {
            System.out.println("Daxil olunan eded verilen ededler toplusunda movcud deyil.");
        }
        System.out.println(Arrays.toString(ededler));

    }
    public static void task17(){

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int daxilOlunanEded = scanner().nextInt();
        int eded= 1;

        boolean condition = true;

        while(condition){
            int count = 0;
            for (int i = 1; i <=10 ; i++) {
                if (eded%i == 0){
                    count++;
                }
            }
            if (count == 10){
                condition = false;
                break;
            }
            eded++;
        }


        if(daxilOlunanEded % eded == 0){
            System.out.println("Bu eded 1-den 10-a kimi butun ededlere tam bolunur ");
        }else {
            System.out.println("Tam bolunmur");
        }
    }
    public static void task18(){
        System.out.println("Verilən bir ədədin güzgülü olub-olmadığını yoxlayan bir proqram yazın");

        Scanner scanner = scanner();
        System.out.println("Yoxlamaq istediyiniz ededi daxil edin: ");
        int originalEded = scanner.nextInt();
        int daxilOlunanEded = originalEded;

        int tersineCevrilmisEded = 0;

        while (daxilOlunanEded != 0) {
            int digit = daxilOlunanEded % 10;
            tersineCevrilmisEded = tersineCevrilmisEded * 10 + digit;
            daxilOlunanEded /= 10;
        }

        if (originalEded == tersineCevrilmisEded) {
            System.out.println(originalEded + " guzgulu bir ededdir.");
        } else {
            System.out.println(originalEded + " guzgulu bir eded deyil.");
        }
    }
    public static void task19(){
        System.out.println("Verilən bir sıradakı bütün ədədlərin toplanmasını hesablamaq üçün bir for dövrü yazın.\n");

        int[] ededler = {4, 7, 1, 3, 9};
        int cem = 0;

        for (int i = 0; i < ededler.length; i++) {
            cem += ededler[i];
        }

        System.out.println("Verilenler toplusunda olan ededlerin toplami: " + cem);

    }
    public static void task20(){
        System.out.println("Verilən bir sıra içində ortada yerləşən ədədlərin cəmini tapan bir proqram yazın.");

        int[] ededler = {4, 7, 1, 3, 9, 6, 9, 7, 0, 4, 5, 8};
        int cem = 0;

        System.out.println("Verilen ededler toplusu: " + Arrays.toString(ededler));
        Scanner scanner = scanner();
        System.out.println("Verilenler toplusunun cemini hesablamaq ucun bir sira verin: ");
        int start = scanner().nextInt();
        System.out.println("Verilenler toplusunun cemini hara kimi hesablamaq isteyirsiniz: ");
        int end = scanner().nextInt();

        for (int i = start; i < ededler.length - (ededler.length - end); i++) {
            cem += ededler[i];
        }

        System.out.println("Verilenler toplusunda secdiyiniz sira arasindaki ededlerin toplami: " + cem);


    }


}
