public class Main {
    public static void main(String[] args) {
        // Задание 1
        int month = 0;
        int contribution = 15000;
        int sum = 0;
        while (sum < 2_459_000){
            contribution = contribution + contribution/100; //если % начисляется со следующего месяца, то строчка под System.out.println
            sum = sum + contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        // Задание 2
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println();

        // Задание 3
        int total = 12_000_000;
        int fertility = 17 * (total/1000);
        int mortality = 8 * (total/1000);
        for (int g = 1; g <= 10; g++) {
            total = total + (fertility - mortality);
            System.out.println("Год " + g + ", численность населения составляет " + total);
        }

        // Задание 4
        int accumulation = 15000;
        int monthV = 0;
        while (accumulation < 12_000_000) {
            accumulation = accumulation + accumulation/100*7;
            monthV++;
                System.out.println("За " + monthV + " месяц Василий накопит " + accumulation + " рублей");
        }
        System.out.println("Чтобы накопить 12 миллионов необходимо " + monthV + " месяцев");

        // Задание 5
        int accumulationVasily = 15000;
        int monthVasily = 0;
        while (accumulationVasily < 12_000_000) {
            accumulationVasily = accumulationVasily + accumulationVasily/100*7;
            monthVasily++;
            if (monthVasily % 6 == 0) {
                System.out.println("За " + monthVasily + " месяц Василий накопит " + accumulationVasily + " рублей");
            }
        }
        System.out.println("Чтобы накопить 12 миллионов необходимо " + monthVasily + " месяцев");

        // Задание 6
        int saving = 15000;
        int mont = 1;
        while (mont < (9*12)) {
            saving = saving + saving/100*7;
            mont++;
            if (mont % 6 == 0) {
                System.out.println("За " + mont + " месяц Василий накопит " + saving + " рублей");
            }
        }
        System.out.println("За 9 лет Василий накопит " + saving + " рублей");

        // Задание 7
        int friday = 5;
        for (; friday < 31; friday = friday + 7) {
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 8
        int year = 2022;
        int yearAfter = year + 100;
        for (int yearBefore = year - 200; yearBefore < yearAfter ; yearBefore++) {
            if (yearBefore % 79 == 0) {
                System.out.println(yearBefore);
            }
        }

        // Задание 9
        int x = 2;
        for (int f = 1; f <= 10; f++) {
            System.out.println(x + " * " + f + " = " + (x * f));
        }
    }
}