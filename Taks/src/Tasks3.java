import java.util.Random;
import java.util.Scanner;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 8/16/2024
 * Time: 12:35 PM
 */

public class Tasks3 {

    public static Scanner scanner(){
        return new Scanner(System.in);
    }

    public static void task1(){

        System.out.println("Iki ededin cemini hesablayin");
        int ilkEded = 5;
        int ikinciEded = 10;
        System.out.println("Daxil etdiyiniz ededlerin cemi: " + ilkEded + " + " + ikinciEded + " = " + (ilkEded + ikinciEded));


    }
    public static void task2(){
        System.out.println("Daxil olunan iki ededin cemini hesablayin");
        System.out.println("Ilk ededi daxil edin: ");
        int ilkEded = scanner().nextInt();
        System.out.println("Ikinci ededi daxil edin: ");
        int ikinciEded = scanner().nextInt();
        System.out.println("Daxil etdiyiniz ededlerin cemi: " + ilkEded + " + " + ikinciEded + " = " + (ilkEded + ikinciEded));

    }
    public static void task3(){
        System.out.print("1 den 10 a kimi olan ededlerin kublari cemi: ");

        int cem = 0;

        for (int i = 1; i <=10; i++) {
            cem += i*i*i;
        }
        System.out.print(cem);
    }
    public static void task4(){
        System.out.println("Tevelludunu daxil ederek yasini hesabla: ");

        int now = 2024;

        Scanner scanner = scanner();

        System.out.println("Tevelludunu daxil et: ");
        int year = scanner.nextInt();

        System.out.println("Sizin " + (now - year) + " yasiniz var");

    }
    public static void task5(){
        System.out.println("Daxil olunan ededin faktoryalini hesbalayin.");
        System.out.println("Eded daxil edin: ");
        int eded = scanner().nextInt();

        int fact = 1;

        for (int i = 2; i <=eded; i++) {
            fact *= i;
        }

        System.out.println("Daxil etdiyiniz " + eded + " ededinin factoryali " + fact + " a beraberdir.");

    }
    public static void task6(){
        System.out.println("Vurma emelini toplama usulu ile hesablamaq.");

        System.out.println("Ilk ededi daxil edin: ");
        int ilkEded = scanner().nextInt();

        System.out.println("Ikinci ededi daxil edin: ");
        int ikinciEded = scanner().nextInt();

        int hasil = 0;

        for (int i = 1; i <=ikinciEded ; i++) {
            hasil += ilkEded;
        }

        System.out.println("Hasil: " + hasil);

    }
//    ------------------------------------
    public static void task7(){
//        System.out.println("Bolme emelini cixma usulu ile hesablamaq.");
//
//        System.out.println("Ilk ededi daxil edin: ");
//        int ilkEded = scanner().nextInt();
//
//        System.out.println("Ikinci ededi daxil edin: ");
//        int ikinciEded = scanner().nextInt();
//
//        int cavab = 0;
//
//        for (int i = 1; i <=ikinciEded ; i++) {
//
//            cavab += x ;
//
//        }
//
//        cavab = ilkEded;
//
//        ilkEded - ( x * ikinciEded) = cavab; +
//
//        System.out.println("Cavab: " + cavab);
    }
    public static void task8(){
        System.out.println("Daxil olunan iki ededin bolunmesinden alinan qaliqi hesablamaq.");

        Scanner scanner = scanner();

        System.out.println("Bir eded daxil edin: ");
        int eded1 = scanner.nextInt();


        System.out.println("Novbeti ededi daxil edin: ");
        int eded2 = scanner.nextInt();

        int cavab = eded1 % eded2;

        System.out.println("Qaliq: " + eded1 + " / " + eded2 + " = " + cavab);
    }
    public static void task9(){
        System.out.println("Daxil olunan ededin nece reqemden ibaret olduqunu deyen proqram.");

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded = scanner.nextInt();
        int count = 0;

        while (eded > 0){
            eded/=10;
            count++;
        }

        System.out.println("Daxil olunan eded " + count + " reqemden ibarettir.");

    }
    public static void task10(){
        System.out.println("Daxil ounan 3 reqemli ededin reqemlerinin kublari ceminin ozune beraber olub olmadiqini yoxlayin.");

        Scanner scanner = scanner();

        System.out.println("3 reqemli bir eded daxil edin: ");
        int eded = scanner.nextInt();
        int temp = eded;
        int temp2 = eded;
        int count = 0;
        int reqem;
        int kubCemi = 0;

        while (temp > 0){
            temp/=10;
            count++;
        }

        if (count < 3){
            System.out.println("Daxil etdiyiniz eded 3 reqemli olmalidir daha az yox.");
        }else if(count > 3){
            System.out.println("Daxil etdiyiniz eded 3 reqemli olmalidir daha cox yox.");
        }else {

            while (temp2 > 0){
                reqem = temp2 % 10;
                kubCemi += reqem * reqem * reqem;
                temp2/=10;
            }

            if (kubCemi == eded){
                System.out.println("Daxil olunan ededin reqemlerinin kublari cemi ededin ozune beraberdir");
            }else {
                System.out.println("Daxil olunan ededin reqemlerinin kublari cemi ededin ozune beraber deyil");
            }

        }


    }
    public static void task11(){
        System.out.println("Daxil olunan 20 ededin cut ededlerinin ceminin tek ededlerin cemine olan nisbetini hesabla.");

        int cutlerinCemi = 0;
        int teklerinCemi = 0;
        int nisbet;

        Scanner scanner = scanner();

        for (int i = 1; i <=20; i++) {
            System.out.println(i + ". ededi daxil edin:");
            int eded = scanner.nextInt();
            if (eded%2 == 0){
                cutlerinCemi += eded;
            }else {
                teklerinCemi += eded;
            }
        }

        nisbet = cutlerinCemi / teklerinCemi;

        System.out.println("Daxil olunan ededlerin arasinda cut ededlerin ceminin tek ededlerin cemine olan nisbeti: " + nisbet);

    }
    public static void task12(){
        System.out.println("10 ile 1000 arasinda olan tam kvadrat saylari ekrana yazdirin.");

        for (int i = 4; i <=50; i++) {
            if(i*i<=1000){
                System.out.println(i + " * " + i + " = " + i*i);
            }
        }

    }
    public static void task13(){
        System.out.println("Daxil olunan 25 ededin icerisinde menfi ededlerin cemini, cut ededlerin cemini, 7 e beraber olanlarin sayini tapib ekrana yazdiran proqram.");

        int menfi= 0, cut = 1, eded;
        int yeddi = 0;

        Scanner scanner = scanner();
        for (int i = 1; i <=25; i++) {
            System.out.println(i + ". ededi daxil edin:");
            eded = scanner.nextInt();
            if (eded%2 == 0){
                cut*=eded;
            }
            if (eded<0){
                menfi+=eded;
            }
            if (eded==7){
                yeddi++;
            }
        }
        System.out.println("Menfi ededlerin cemleri: " + menfi);
        System.out.println("Cut ededlerin cemi: " + cut);
        System.out.println("7 e beraber olan eded sayi: " + yeddi);

    }
    public static void task14(){
        System.out.println("Vurma cedveli.");

        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i + " * " + j + " = " + i * j );
            }
            System.out.println("-----------------");
        }

    }
    public static void task15(){
        System.out.println("Daxil olunan ededin 5 e tam bolunub bolunmediyini yoxlayin.");

        Scanner scanner = scanner();
        System.out.println("Eded daxil edin:");
        int eded = scanner.nextInt();

        if (eded%5 == 0){
            System.out.println(eded + " ededi 5 e tam bolunur");
        }else {
            System.out.println(eded + " / " +  "5 " + "= " + (eded/5) + " (qaliq " + (eded%5) + ")" );
        }

    }
    public static void task16(){
        System.out.println("Fibanoccinin ilk 10 ededini ekrana yazdirin.");

        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print("Fibanocci sirasi: " + n1 + " " + n2 + " ");

        for (int i = 3; i <=10; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }

    }
    public static void task17(){
        System.out.println("Daxil olunan ededin musbet menfi yoxsa 0 a beraber olduqunu tapin.");

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded = scanner.nextInt();

        if (eded > 0){
            System.out.println("Daxil olunan eded musbet ededdir.");
        }else if(eded < 0){
            System.out.println("Daxil olunan eded menfi ededdir.");
        }else {
            System.out.println("Daxil olunan eded 0 a beraberdir.");
        }
    }
    public static void task18(){
        System.out.println("Daxil olunan ededin mukemmel eded olub olmadiqini yoxlayin");
        System.out.println("Mukemmel eded ozunun butun bolenlerinin (ozunden basqa) cemine beraber olan ededidir.");

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded = scanner.nextInt();
        int tamBolunen;
        int tamBolunenCemi = 0;

        System.out.print("Daxil olunan ededin tam bolenleri (ozu nezere alinmadan): ");
        for (int i = 1; i <eded; i++) {
            if (eded%i == 0) {
                tamBolunen = i;
                System.out.print(i + " ");
                tamBolunenCemi += tamBolunen;
            }
        }
        System.out.println();
        System.out.println("Daxil olunan ededin tam bolenleri cemi: " + tamBolunenCemi);

        if (tamBolunenCemi == eded){
            System.out.println("Daxil olunan " + eded + " ededi mukemmel ededdir");
        }else {
            System.out.println("Daxil olunan " + eded + " ededi mukemmel eded deyil");
        }

    }
    public static void task19(){
        System.out.println("1 ile 100 arasinda cut ededlerin ceminin mukemmel eded olub olmadiqini yoxlayin.");

        int cutCem = 0;
        int cutCemBolenleriCemi = 0;

        for (int i = 2; i <=100; i++) {
            if (i%2 == 0){
                cutCem += i;
            }
        }

        System.out.print("Cut ededlerin ceminin tam bolenleri: ");
        for (int i = 1; i < cutCem; i++) {
            if (cutCem%i == 0){
                System.out.print(i + " ");
                cutCemBolenleriCemi+=i;
            }
        }

        System.out.println();
        System.out.println("1 ile 100 arasindaki cut ededlerin cemi: " + cutCem);


        if (cutCemBolenleriCemi == cutCem){
            System.out.println("1 ile 100 arasindaki cut ededlerin cemleri mukemmel ededdir");
        }else {
            System.out.println("1 ile 100 arasindaki cut ededlerin cemleri mukemmel eded deyil");
        }
    }
    public static void task20(){
        System.out.println("Her hansisa bir ededin her hansisa bir quvvetini hesablayin.");

        Scanner scanner = scanner();
        System.out.println("Quvvetini hesablamaq istediyiniz ededi daxil edin: ");
        int eded = scanner.nextInt();
        System.out.println("Quvveti daxil edin: ");
        int quvvet = scanner.nextInt();
        int cavab = 1;

        if (eded == 0){
            System.out.println("0 daxn basqa istenilen ededin quvveti 0 olduqda 1 e beraberdir");
        } else if (eded<0) {
            System.out.println("Zehmet olamasa musbet quvvet daxil edin hal hazirda sadece musbet ededlerin quvveti nezere alinir.");
        }else {
            for (int i = 1; i <=quvvet; i++) {
                cavab *= eded;
            }
            System.out.println("Daxil olunan ededin (" + eded + ") daxil olunan quvveti (" + quvvet + ") " + ": " + cavab);

        }

      }
    public static void task21(){
        System.out.println("Daxil olunan ededin guclu(abundant) ve ya zeif(deficient) eded olduqunu yoxlayin.");
        System.out.println("Ededin tam bolenlerinin ceminin hemin ededin ozunden kicin olarsa zeif boyuk olarsa guclu beraber olarsa mukemmel eded olaraq adlandirilir");
        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded = scanner.nextInt();

        int tamBolenlerCemi = 0;
        System.out.print("Daxil olunan ededin tam bolenleri: ");
        for (int i = 1; i < eded; i++) {
            if (eded%i == 0){
                System.out.print(i + " ");
                tamBolenlerCemi+=i;
            }
        }

        System.out.println();
        System.out.println("Ededin bolenleri cemi: " +tamBolenlerCemi);

        if (tamBolenlerCemi > eded){
            System.out.println("Eded guclu ededdir");
        }else if (tamBolenlerCemi < eded){
            System.out.println("Eded zeif ededdir");
        }else {
            System.out.println("Eded mukemmel ededdir");
        }


    }
    public static void task22(){
        System.out.println("1 den 500 e kimi olan edelerin cemi.");
        int cem = 0;

        for (int i = 1; i <=500; i++) {
            cem+=i;
        }

        System.out.println("Cavab: " + cem);

    }
    public static void task23(){
        System.out.println("Daxil olunan a ve b ededini 50 den boyu olarsa c = a+b seklinde yazan boyuk deyilse uygun deyil seklinde yazin.");
        int c;
        Scanner scanner = scanner();
        System.out.println("A ededini daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("B ededini daxil edin: ");
        int b = scanner.nextInt();

        if (a>50 && b>50){
            c = a + b;
            System.out.println("a + b = " + c);
        }else {
            System.out.println("Bu reqemler serti qarsilamir.");
        }

    }
    public static void task24(){
        System.out.println("1 den 63 e kimi olan ededler arsasinda istenilen ededi maksimum 6 defede tapan proqram.");

        int min = 1;
        int max = 63;
        int texmin;
        int count = 0;
        Scanner scanner = scanner();
        System.out.println("Eded daxil edin: ");
        int eded = scanner.nextInt();

        if (eded > 63 || eded < 1){
            System.out.println("Daxil olunan eded 1 ile 63 arasinda olmalidir.");
        }else {

            System.out.print("Texminler: ");
            do {
                texmin = (min + max)/2;
                System.out.print(texmin + " ");
                count++;
                if (texmin == eded){
                    System.out.println("Edediniz: " + eded + ", texmin sayi: " +  count);
                    break;
                }
                else if (texmin > eded) {
                    max=texmin;
                }
                else{
                    min = texmin;
                }

            }while (texmin != eded);
        }


    }
//    ----------------------------------
    public static void task25(){
        System.out.println("");

    }
//    ------------------------------------
    public static void task26(){
        System.out.println("");

    }
    public static void task27(){
        System.out.println("Daxil olunan ilin elave il olduqunu (fevral 29) yxolayan proqram.");

        Scanner scanner = scanner();

        System.out.println("Ili daxil edin: ");
        int il = scanner.nextInt();
        if (il%4==0){
            System.out.println("Daxil olunan il " + il + " elave ildir");
        }else {
            System.out.println("Daxil olunan il " + il + " elave il deyil");
        }

    }
    public static void task28(){
        System.out.println("Boyu ve kilosu daxil olunan adamin ariqmi sismanmi yoxsa idealmi oldunu hesablayin.");

        Scanner scanner = scanner();
        System.out.println("Kilonuzu daxil edin: ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu daxil edin: ");
        int boy = scanner.nextInt();

        boy %=100;
        if (boy - kilo > 11){
            System.out.println("Kilo alman lazimdi.");
        }else if(boy- kilo == 11){
            System.out.println("Ideal ceki.");
        }else{
            System.out.println("Kilo vermen lazimdi.");
        }
    }
    public static void task29(){
        System.out.println("DAirenin sahesini ve cevresini hesblayin.");
        double pi = 3.14;
        double sahe;
        double cevre;

        Scanner scanner = scanner();
        System.out.println("Radiusu daxil edin: ");
        int radius = scanner.nextInt();

        sahe = pi * radius * radius;
        cevre = 2 * pi * radius;

        System.out.println("Cevre: " + cevre);
        System.out.println("Sahe: " + sahe);

    }
    public static void task30(){
        System.out.println("10 ile 50 arasindaki sade ededleri tapin");

        System.out.print("10 ile 50 arasindaki sade ededler: ");

        for (int i = 10; i <=50; i++) {
            int count = 0;

            for (int j = 1; j <=i; j++) {

                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+ " ");
            }
        }

    }
    public static void task31(){
        System.out.println("1 ile 100 arasinda nece sade eded var tapin.");

        int countSade = 0;

        for (int i = 1; i <=100; i++) {
            int count = 0;

            for (int j = 1; j <=i; j++) {

                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                countSade++;
            }
        }

        System.out.println("Sade ededlerin sayi: " + countSade);
    }
//  ------------------------------
    public static void task32(){
        System.out.println("ax^2 + bx + c = 0  X-i tapin.");

        Scanner scanner = scanner();
        System.out.println("a-ni daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin: ");
        int b = scanner.nextInt();
        System.out.println("c-ni daxil edin: ");
        int c = scanner.nextInt();



    }
//    --------------------------------------
    public static void task33(){
        System.out.println("");

    }
    public static void task34(){
        System.out.println("1 ile 10 arasindaki tam ededlerin kvadratlari cemini hesabla.");
        int cem = 0;

        for (int i = 1; i <=10; i++) {
            cem += i * i;
        }

        System.out.println("Cem: " + cem);
    }
//    ChatCPT-----------------------
    public static void task35(){
        System.out.println("Daxil olunan ededin texmini kokunu hesblayin.");

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded = scanner.nextInt();




    }
//  ----------------------------------
    public static void task36(){
        System.out.println("");

    }
    public static void task37(){
        System.out.println("Radiusu daxil olunan kurenin sahesini ve hecmini hesablayin.");
        Scanner scanner = scanner();
        System.out.println("Radius daxil edin: ");
        int radius = scanner.nextInt();

        double hecm;
        double sahe;
        double pi = 3.14;

        sahe = 4 * pi * radius * radius;
        hecm = (sahe * radius)/3;

        System.out.println("Kurenin hecmi: " + hecm);
        System.out.println("Kurenin sahesi: " + sahe);


    }
    public static void task38(){
        System.out.println("Daxil olunan ededin xanalarindaki en boyuk ededi tapin.");

        Scanner scanner = scanner();
        System.out.println("Eded daxil edin.");
        int eded = scanner.nextInt();
        int temp = eded;
        int max = 0;

        while (temp > 0){

            int xana = temp % 10;
            temp /= 10;

            if (xana>max){
                max= xana;
            }
        }

        System.out.println("Sonuc: enbuyuk -> " + max);


    }
    public static void task39(){
        System.out.println("");
        int pi = 3;

        Scanner scanner = scanner();
        System.out.println("Derece daxil edin: ");
        int derece = scanner.nextInt();

        int radyan;
        int grad;

        radyan = derece * pi /180;
        grad = derece*200/180;

        System.out.println("Radyan: " + radyan);
        System.out.println("Grad: " + grad);

    }
    public static void task40(){
        System.out.println("Kenarlari verilen duzbucaqli ucbucaqin hipotenusunu hesabla.");
        double c;

        Scanner scanner = scanner();
        System.out.println("Bir terefi daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("Ikinci terefi daxil edin: ");
        int b = scanner.nextInt();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenus: " + c);

    }
    public static void task41(){
        System.out.println("Daxil olunan 3 reqemli ededin reqemlerinin kublarinin ceminin ozune beraber olub olmadiqin yoxlayin.");

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded = scanner.nextInt();
        int temp = eded;
        int count = 0;
        int xana,xanaKubu;
        int kubCemi = 0;

        do {

            xana = temp % 10;
            xanaKubu = xana * xana * xana;
            kubCemi += xanaKubu;
            temp/=10;
            count++;

        }while (temp > 0);

        if (count!= 3){
            System.out.println("Zehmet olmasa 3 reqemli eded daxil edin.");
        }else {

            if(kubCemi == eded){
                System.out.println("Ededin reqemleri kublari cemi " + kubCemi +  " edede " + eded + " beraberdir.");
            }else {
                System.out.printf("Ededin reqemleri kublari cemi %s edede %s beraber deyil", kubCemi, eded);
            }
        }
    }
    public static void task42(){
        System.out.println("Arxa arxaya daxil olunan 10 rastegele ededin ortalamasinin bu ededlerin en kicik ve en boyuyunun ortalamasi ve bu iki ortalamanin ferqini tapin.");
        int cem = 0;
        int max = 0;
        int maxValue = 100;
        int min = maxValue;

        Random random = new Random();

        for (int i = 1; i <= 10; i++) {

            int eded = random.nextInt(maxValue);

            cem += eded;

            if (eded > max){
                max = eded;
            }else if(eded < min){
                min = eded;
            }

        }

        int cemOrta = cem/10;
        int cemOrtaMinMax = (min + max) /2;

        System.out.printf("Cavab %s", cemOrta-cemOrtaMinMax);

    }
    public static void task43(){
        System.out.println("Daxil olunan k ededini tek ededdirse 3 e vurub uzerine 1 elave edin cut ededdirse 2 e bolun bu emeliyati 1 e beraber olana kimi icra edin ve bu prosesin nece prosesde bas verdiyini hesablayin, eyni zamanda hemise ardicil olaraq cut eded olaraq aldiqi max ededi tapin");

        Scanner scanner = scanner();
        System.out.println("Eded daxil edin: ");
        int k = scanner.nextInt();
        int count = 0;
        int maxBolunen = 0;
        int max = 0;

        while (k!=1){

            if(max < k){
                max = k;
            }

            if(k%2==0){
                int temp = k;
                k/=2;

                if (maxBolunen == 0){
                    maxBolunen = temp;
                }
            }else {
                k = k * 3 + 1;
                maxBolunen = 0;
            }
            count++;

        }

        System.out.println("Count: " + count);
        System.out.println("Max: " + max);
        System.out.println("Max Cut Bolunen: " + maxBolunen);


    }
    public static void task44(){
        System.out.println("Daxil oluna eded 5 ile 10 arasindadirsa bu ededin kvadratini, 5 den kicikdirse onun faktoryalini, 10 dan boyukdurse 2 e bolub 1 cix.");


        Scanner scanner = scanner();
        System.out.println("Eded daxil edin:");
        int eded = scanner.nextInt();
        int facktoryal= 1;

        if(eded < 5){
            for (int i = 1; i <= eded; i++) {
                 facktoryal *= i;
            }
            eded = facktoryal;
        }else if(eded > 10){
            eded = eded / 2 - 1;
        }else {
            eded *= eded;
        }

        System.out.println("Cavab: " + eded);



    }
    public static void task45(){
        System.out.println("Duzbucaqli ucbucaqin kenarlarini daxil ederek o ucbucaqin sahesini hesabblayin.");

        Scanner scanner = scanner();
        System.out.println("Ilk terefi daxil edin: ");
        int teref1 = scanner.nextInt();
        System.out.println("Ikinci terefi daxil edin: ");
        int teref2 = scanner.nextInt();

        int sahe = (teref1 * teref2)/2;

        System.out.printf("Sahe: %s", sahe);

    }
    public static void task46(){
        System.out.println("Duzbucaqlinin enini ve uzunluqunu daxil ederek sahesini ve parametrini hesablayin.");

        Scanner scanner = scanner();
        System.out.println("Duzbucaqlinin enini daxil edin: ");
        int en = scanner.nextInt();
        System.out.println("Duzbucaqlinin uzunluqunu daxil edin: ");
        int uzunluq = scanner.nextInt();

        int sahe = en * uzunluq;
        int parametr = ( uzunluq + en ) * 2;

        System.out.println("Duzbucaqlinin parametri: " + parametr);
        System.out.println("Duzbucaqlinin sahesi: " + sahe);

    }
    public static void task47(){
        System.out.println("s = x + y^2");
        Scanner scanner = scanner();
        System.out.println("X -i daxil edin: ");
        int x = scanner.nextInt();
        System.out.println("Y -i daxil edin: ");
        int y = scanner.nextInt();

        int s = x + y * y;

        System.out.println("S = " + s);

    }
    public static void task48(){
        System.out.println("x = 2(a + 3*b) / a * b");

        Scanner scanner = scanner();
        System.out.println("A - ni daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("B - ni daxil edin: ");
        int b = scanner.nextInt();

        int x = 2 * ( a + 3 * b) / a * b;
        System.out.println("X = " + x);
    }
    public static void task49(){
        System.out.println("-1 ededi daxil olunana kimi istenilen ededi daxil etmesine icaze ver.");

        Scanner scanner = scanner();
        int x = 0;

        while (x!=-1){
            System.out.print("Eded daxil edin: ");
            x = scanner.nextInt();
        }

    }
    public static void task50(){
        System.out.println("Menfi eded daxil olunana kimi istenilen ededi daxil etmesine icaze ver ve daxil olunan ededleri topla.");

        Scanner scanner = scanner();
        int x = 1;
        int cem= 0;

        while (x>0){
            System.out.print("Eded daxil edin: ");
            x = scanner.nextInt();
            cem += x;
        }
        cem -= x;

        System.out.println("Cem: " + cem);
    }
    public static void task51(){
        System.out.println("0 daxil olunana kimi istenilen ededi daxil etmesine icaze ver ve daxil olunan ededlerin ortalamasini hesabla.");

        Scanner scanner = scanner();
        int x = 1;
        int cem= 0;
        int count = 0;

        while (x!=0){
            System.out.print("Eded daxil edin: ");
            x = scanner.nextInt();
            cem += x;
            count++;
        }

        int ortalama = cem / count;

        System.out.println("Ortalama: " + ortalama);

    }
    public static void task52(){

        System.out.println("Adinizi ve soyadinizi alt alta yazdirin.");

        Scanner scanner = scanner();
        System.out.println("Adinizi daxil edin: ");
        String ad = scanner.nextLine();

        System.out.println("Soyadinizi daxil edin: ");
        String soyad = scanner.nextLine();

        System.out.println(ad);
        System.out.println(soyad);

    }
    public static void task53(){
        System.out.println("Daxil olunan 20 ededin menfi ve musbet saylarini hesablayib ekrana yazdir");
        int countMusbet = 0;
        int countMenfi = 0;
        Scanner scanner = scanner();

        for (int i = 1; i <=20; i++) {

            System.out.println(i + " ededi daxil edin: ");
            int eded = scanner.nextInt();
            if(eded >=0){
                countMusbet++;
            }else {
                countMenfi++;
            }

        }

        System.out.println(countMenfi + " menfi eded");
        System.out.println(countMusbet + " musbet eded");
    }
    public static void task54(){
        System.out.println("1 ile 100 arasindaki tek ededleri ekrana yazdir.");
        System.out.print("Tek ededler: ");
        for (int i = 1; i <=100; i++) {
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }

    }
    public static void task55(){
        System.out.println("Daxil olunan 20 edin cutlerinin ve teklerinin ortalamasini hesabla.");
        int cutCem = 0;
        int tekCem = 0;
        int cutSay = 0;
        int tekSay = 0;


        Scanner scanner = scanner();
        for (int i = 1; i <=20; i++) {
            System.out.println(i + " ededi daxil edin: ");
            int eded = scanner.nextInt();
            if (eded%2 == 0){
                cutCem += eded;
                cutSay++;
            }else {
                tekCem +=eded;
                tekSay++;
            }
        }

        int tekOrtalama = tekCem / tekSay;
        int cutOrtalama = cutCem / cutSay;

        System.out.println("Teklerin ortalamasi: " + tekOrtalama);
        System.out.println("Cutlerin ortalamasi: " + cutOrtalama);


    }
    public static void task56(){
        System.out.println("0 ile 100 arasinda hasni ededleri 7 e boldukde qaliqda 3 qaldiqinin sayini tapin.");

        int count= 0;

        for (int i = 10; i <=100; i++) {
            if(i%7 == 3){
                count++;
            }
        }

        System.out.println("Cavab: " + count);

    }
    public static void task57(){
        System.out.println("1 ile 1000 arasinda 12 e tam bolunenlerin ortalamasini tapin.");

        int cem = 0;
        int count = 0;

        for (int i = 12; i <=1000; i++) {
            if (i%12 == 0){
                cem+= i;
                count++;
            }
        }

        int ort = cem/count;

        System.out.println("Cavab: " + ort);

    }
    public static void task58(){
        System.out.println("Daxil olunan 20 ededin 15 den boyuk olanlarinin asyini tapin.");
        int count = 0;
        Scanner scanner = scanner();
        for (int i = 1; i <=20; i++) {
            System.out.print(i + " ededi daxil edin: ");
            int eded = scanner.nextInt();
            if (eded > 15) {
                count++;
            }
        }

        System.out.println("Cavab: " + count);
    }
    public static void task59(){
        System.out.println("Daxil olunan 20 ededin 50 den boyuk ve beraber olanlarinin sayini kicik olanlarin sayina nisbetini tapin.");
        int cemBoyuk = 0;
        int cemKicik = 0;
        Scanner scanner = scanner();
        for (int i = 1; i <=20; i++) {
            System.out.print(i + " ededi daxil edin: ");
            int eded = scanner.nextInt();
            if (eded >= 50) {
                cemBoyuk+=eded;
            }else {
                cemKicik+=eded;
            }
        }

        double nisbet = (double) cemBoyuk / cemKicik;

        System.out.println("Cavab: " + nisbet);

    }
    public static void task60(){
        System.out.println("0 daxil olunana kimi daxil olunan ededlerin sayini, cemini ve ortalamasini tapin.");
        int cem = 0;
        int count =0;
        int eded = 1;
        Scanner scanner = scanner();

        while (eded != 0){
            System.out.print("Eded daxil edin: ");
            eded = scanner.nextInt();
            cem += eded;
            count++;
        }

        int ort = cem/count;

        System.out.println("Daxil olunan ededlerin sayi: " + count);
        System.out.println("Daxil olunan ededlerin cemi: " + cem);
        System.out.println("Daxil olunan ededlerin ortalamasi: " + ort);

    }
    public static void task61(){
        System.out.println("0 daxil olunana kimi daxil olunan ededlerin musbet ve menfilerinin cemini tapin.");
        int cemMenfi = 0;
        int cemMusbet = 0;
        int eded = 1;
        Scanner scanner = scanner();

        while (eded != 0) {
            System.out.print("Eded daxil edin: ");
            eded = scanner.nextInt();
            if (eded >= 0) {
                cemMusbet += eded;
            } else {
                cemMenfi += eded;
            }
        }

        System.out.println("Daxil olunan musbet ededlerin cemi: " + cemMusbet);
        System.out.println("Daxil olunan menfi ededlerin cemi: " + cemMenfi);

    }
//    xxxxxxxxxxxxxxxxxxx
    public static void task62(){
        System.out.println("x = -b + kok(b^2 - 4 * a * c) / 2 *a");

        Scanner scanner = scanner();
        System.out.println("A-ni daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("B-ni daxil edin: ");
        int b = scanner.nextInt();
        System.out.println("C-ni daxil edin: ");
        int c = scanner.nextInt();

        double x = ((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

//        a = 8;
//        b = 10;
//        c = 2;

//        int q = b * b;
//        int w = 4 * a * c;
//        int e = q - w;
//        int r = (int) Math.sqrt(e);
//        int t = -b + r;
//        int y = 2 * a;
//        int u = t / y;

//        System.out.printf("q=%s, w=%s, e=%s, r=%s, t=%s, y=%s, u=%s, x=%s",q,w,e,r,t,y,u,x);

        System.out.println("Cavab: " + x);

    }
    public static void task63(){
        System.out.println("Daxil olunan kutel(m) , suret(v) ve yerden hundurluyu(h) nezere alaraq bu maddenin Potensial(Ep) ve Kinetik(Ek) enerjisini hesabla.");
        int g = 10;

        Scanner scanner = scanner();
        System.out.print("Kutle daxil edin: ");
        int m = scanner.nextInt();
        System.out.print("Suret daxil edin: ");
        int v = scanner.nextInt();
        System.out.print("Hundurluk daxil edin: ");
        int h = scanner.nextInt();

        int Ep = m * g * h;
        double Ek = (double) 1 / (2 * m * v * v);

        System.out.println("Potensial enerji: " + Ep);
        System.out.println("Kinetik enerji: " + Ek);

    }
    public static void task64(){
        System.out.println("daxil olunan musbet ededden basayib 1 e kimi ekranda geri qalan ededlerin yazdirin.");
        Scanner scanner = scanner();
        System.out.println("Musbet bir eded daxil edin:");
        int eded = scanner.nextInt();

        while (eded >1 ){
            System.out.println(--eded);
        }
    }
    public static void task65(){
        System.out.println("Iki say daxil edin bu saylar arasinda olan ededleri avtomatik tamamlasin.");

        Scanner scanner = scanner();
        System.out.print("Baslamaq istediyiniz ededi daxil edin: ");
        int eded = scanner.nextInt();
        System.out.print("Novbeti ededi daxil edin: ");
        int end = scanner.nextInt();

        if (eded < end){
            while (eded < end){
                System.out.println(++eded);
            }
        }else {
            while (end < eded){
                System.out.println(--eded);
            }
        }

    }
    public static void task66(){
        System.out.println("Daxil olunan ededlerin cemi 30 dan cox olana kimi eded daxil olunsun ve nece eded daxil olduqunu gosterin.");

        int cem = 0;
        int count = 0;

        Scanner scanner = scanner();
        while (cem <=30){
            System.out.print("Eded daxil edin: ");
            int eded = scanner.nextInt();
            cem += eded;
            count++;
        }
        System.out.println(count +  " qeder eded daxil edildi.");
    }
    public static void task67(){
        System.out.println("Daxil olunan 10 eded icinde en boyuk ededi ve hansi sirada olduqunu tapin.");

        int max = 0;
        int sira = 0;
        Scanner scanner = scanner();

        for (int i = 1; i <=10; i++) {
            System.out.println("Eded daxil edin: ");
            int eded = scanner.nextInt();
            if (max < eded){
                max = eded;
                sira = i;
            }
        }
        System.out.println("En boyuk eded: " + max);
        System.out.println("Sirasi: " + sira);

    }
    public static void task68(){
        System.out.println("Daxil olunan bala gore qarsiliqli notunu verin.");

        Scanner scanner = scanner();
        System.out.println("Balinizi daxil edin: ");
        int bal = scanner.nextInt();
//        if(bal >= 90){
//            System.out.println("Baliniz: A");
//        }else if(bal >= 80){
//            System.out.println("Baliniz: B");
//        }else if(bal >= 70){
//            System.out.println("Baliniz: C");
//        }else if(bal >= 60){
//            System.out.println("Baliniz: D");
//        }else if(bal > 0){
//            System.out.println("Baliniz: F");
//        }


        switch (bal / 10) {
            case 10:
                if (bal == 100) {
                    System.out.println("Baliniz: A");
                } else {
                    System.out.println("Gecersiz bir bal girdiniz.");
                }
                break;
            case 9:
                System.out.println("Baliniz: A");
                break;
            case 8:
                System.out.println("Baliniz: B");
                break;
            case 7:
                System.out.println("Baliniz: C");
                break;
            case 6:
                System.out.println("Baliniz: D");
                break;
            default:
                if (bal >= 0) {
                    System.out.println("Baliniz: F");
                } else {
                    System.out.println("Gecersiz bir bal girdiniz.");
                }
                break;
        }

    }
    public static void task69(){
        System.out.println("Secilen emeliyata gore 4 emeliyat aparan proqram.");

        int cavab;

        Scanner scanner = scanner();
        System.out.println("Bir eded daxil edin: ");
        int eded1 = scanner.nextInt();
        System.out.println("Novbeti ededi daxil edin: ");
        int eded2 = scanner.nextInt();
        System.out.println("Bir emeliyat secin (+,-,*,/) : ");
        String  operator = scanner().nextLine();

        switch (operator){
            case "+":
                cavab = eded1 + eded2;
                System.out.println("Cavab: " + cavab);
                break;
            case "-":
                cavab = eded1 - eded2;
                System.out.println("Cavab: " + cavab);
                break;
            case "*":
                cavab = eded1 * eded2;
                System.out.println("Cavab: " + cavab);
                break;
            case "/":
                cavab = eded1 / eded2;
                System.out.println("Cavab: " + cavab);
                break;
            default:
                System.out.println("Yalnis emeliyat daxil ettiniz.");
                break;
        }

    }
    public static void task70(){
        System.out.println("1-1/3+1/5-1/7+1/9-1/11+...");
        System.out.println("----------------------------");

        int s = 1;
        int n = 1;
        int k = n + 2;

        Scanner scanner = scanner();
        System.out.println("Nece defe davam etmesini isteyirsiz: ");
        int seri = scanner.nextInt();

//        n - s / k + s / (n + 4) - s/ (k + 4) + s/

        System.out.printf("%s - %s / %s + %s",n,s,k,s);
        System.out.println();

        for (int i = 2; i <=seri; i++) {
            n += 4;
            k = n + 2;
            System.out.printf("%s - %s / %s + %s",n,s,k,s);
            System.out.println();
        }

    }
//    --------------------------------
    public static void task71(){
        System.out.println("");

    }
    public static void task72(){
        System.out.println("x + x^n / n!");

        System.out.println("X-i daxil edin: ");
        int x = scanner().nextInt();
        System.out.println("N-i daxil edin: ");
        int n = scanner().nextInt();
        double herDovr;
        double cavab=0;

        for (int i = 1; i <=n; i++) {

            int xk = 1;
            int fak = 1;

            for (int j = 1; j <= i; j++) {
                xk *= x;
            }

            for (int j = 1; j <= i; j++) {
                fak *= j;
            }

            herDovr = (double) xk / fak;
            System.out.println(herDovr);
            cavab += herDovr;
        }



//        15625   21.7013889
        System.out.println("Cavab: " + cavab);

    }
//    ===============================
    public static void task73(){
        System.out.println("cos(x)");

        Scanner scanner = scanner();
        System.out.println("X - i daxil edin: ");
        int x = scanner.nextInt();
        System.out.println("N - i daxil edin: ");
        int n = scanner.nextInt() * 2;


        double d;
        double t = 1;
        boolean cix = true;

        for (int i = 2; i <=n; i+=2) {

            int fak = 1;
            int xk = 1;

            for (int j = 1; j <=i; j++) {
                fak *= j;
            }
            for (int j = 1; j <=i; j++) {
                xk *= x;
            }
            d = (double) xk / fak;
            if (cix){
                t -= d;
                cix = false;
            }else {
                t += d;
                cix = true;
            }
        }

        System.out.println("Cavab: " + t);

    }
    public static void task74(){
        System.out.println("");

    }
    public static void task75(){
        System.out.println("");

    }
    public static void task76(){
        System.out.println("");

    }
    public static void task77(){
        System.out.println("");

    }
    public static void task78(){
        System.out.println("");

    }
    public static void task79(){
        System.out.println("");

    }
    public static void task80(){
        System.out.println("");

    }
    public static void task81(){
        System.out.println("");

    }
    public static void task82(){
        System.out.println("");

    }
    public static void task83(){
        System.out.println("");

    }
    public static void task84(){
        System.out.println("");

    }
    public static void task85(){
        System.out.println("");

    }
    public static void task86(){
        System.out.println("");

    }
    public static void task87(){
        System.out.println("");

    }
    public static void task88(){
        System.out.println("");

    }
    public static void task89(){
        System.out.println("");

    }
    public static void task90(){
        System.out.println("");

    }
    public static void task91(){
        System.out.println("");

    }
    public static void task92(){
        System.out.println("");

    }
    public static void task93(){
        System.out.println("");

    }
    public static void task94(){
        System.out.println("");

    }
    public static void task95(){
        System.out.println("");

    }
    public static void task96(){
        System.out.println("");

    }
    public static void task97(){
        System.out.println("");

    }
    public static void task98(){
        System.out.println("");

    }
    public static void task99(){
        System.out.println("");

    }
    public static void task100(){
        System.out.println("");

    }

}
