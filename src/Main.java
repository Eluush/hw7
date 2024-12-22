public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача 3 ");
        int population = 12_000_000;
        int fertilityPerThousent = 17;
        int mortalityPerThousent = 8;
        int correntYears = 2024;
        for (int years = correntYears; years < correntYears + 10; years++) {
            population += population * fertilityPerThousent / 1000 - population * mortalityPerThousent / 1000;

            System.out.println("  Год " + years + " , численность населения составляет " + population);
        }

        System.out.println("Задача 4 ");
        percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 5");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ",сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 6");
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ",сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("Задача 7");
        int fridey = 5;
        for (int day = fridey; day <= 31; day += 7) {
            System.out.println("«Сегодня пятница," + day + "е число. Необходимо подготовить отчет».");
        }

        System.out.println("Задача 8 ");
        int period = 79;
        int startSeeting = 0;
        int start = correntYears - 200;
        int end = correntYears + 100;
        for (int year = startSeeting; year < end; year += period) {
            if (year > start) {
                System.out.println(year);

            }
        }


    }
}