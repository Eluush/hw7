public class Main {
    public static void main(String[] args) {

        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 10 / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + sum + " рублей");
        }

        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number + " ");
        }
        for (; number >= 1; number--) {
            System.out.println(number + " ");
        }

        int population = 12_000_000;
        int fertilityPerThousent = 17;
        int mortalityPerThousent = 8;
        int correntYears = 2024;
        for (int years = correntYears; years < correntYears + 10; years++) {
            population += population * fertilityPerThousent / 1000 - population * mortalityPerThousent / 1000;
            System.out.println("Год " + years + " , численность населения составляет " + population);
        }

        percent = 70 / 100;
        desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + sum + " рублей");
        }


    }
}