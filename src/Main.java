public class Main {
    public static void main(String[] args) {
    homeWork1();
    homeWork2();
    homeWork3();
    homeWork4();
    homeWork5();
    homeWork6();
    homeWork7();
    homeWork8();
    homeWork9();
    }
    public static void homeWork1(){
        System.out.println("Задача №1");
    int money = 500_000;
    int i = 0;
    double bank = 0;
    double percent = 0.01;
        while ( bank < 2_459_000 ){
            bank = (bank + money) * (1 + percent);
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }

        System.out.println();
    }
    public static void homeWork2(){
        System.out.println("Задача №2");
        int numbers = 0;
        while ( numbers < 10){
            numbers = numbers + 1;
            System.out.print(numbers + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }

        System.out.println();
    }
    public static void homeWork3(){
        System.out.println();
        System.out.println("Задача №3");
        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deadRate =(double) 8 / 1000;
        int year = 0;
       while (year < 10){

           population = (int) (population + (population * deadRate) - (population * birthRate));
        year ++;


           System.out.println("Год " + year + " ,численность населения составляет " + population);
       }

        System.out.println();
    }
    public static void homeWork4(){
        System.out.println("Задача №4");
        int money = 15000;
        double percent = 0.07;
        int month = 0;
        double bank = 0;

        while (money <= 12_000_000){

            bank = (bank + money) * percent;
            money = money + (int) bank;
            month++;
            System.out.println("месяц " + month + " Сумма накоплений Валсилия = " + money);
        }
        System.out.println();
    }
    public static void homeWork5(){
        System.out.println("Задача №5");
        int money = 15000;
        double percent = 0.07;
        int month = 0;
        double bank = 0;

        while (money < 12_000_000){
            bank = (bank + money) * percent;
            money = money + (int) bank;
            month++;
            if (month % 6 ==0){
                System.out.println("месяц " + month + " Сумма накоплений Валсилия = " + money);
            }

        }
        System.out.println();
    }
    public static void homeWork6() {
        System.out.println("Задача №6");
        int money = 15000;
        double percent = 0.07;
        int month = 0;
        double bank = 0;
        while (month < 108) {
            bank = (bank + money) * percent;
            money = money + (int) bank;
            month++;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " Сумма накоплений Валсилия = " + money);
            }
        }
        System.out.println();
    }
    public static void homeWork7(){
        System.out.println("Задача №7");
        int oneFriday = 2;
        int friday = oneFriday;
        while (oneFriday < 31){
           if (oneFriday % 7 == friday){
                System.out.println("Сегодня пятница, "+ oneFriday +" -е число. Необходимо подготовить отчет.");
                oneFriday = oneFriday + 7;
            }
        }
        System.out.println();

    }
    public static void homeWork8() {
        System.out.println("Задача №8");
        int year = 0;
        int comet = 79;
        int yearOne = 1822;
        int yearTwo = 2122;
      /*
        while (year < 3000){
            year = year + comet;
            if ((year > yearOne) && (year < yearTwo)) {
                System.out.println(year);

            }
    }
        */
      do {
            year = year + comet;
          if ((year > yearOne) && (year < yearTwo)) {
              System.out.println(year);

          }

        } while (year < yearTwo);

        System.out.println();

    }
    public static void homeWork9(){
        System.out.println("Задача №9");
         int number = 2;
         for (int i =1; i <= 10; i++){
              int number1  =  i * number;
              System.out.println(  number + " * " + i + " = " + number1);
        }
        System.out.println();
    }



}