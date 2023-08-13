public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int savings = 15_000;
        int totalSavings = 0;
        int i = 0;
        while (totalSavings < 2_459_000) {
            i = i + 1;
            totalSavings = totalSavings + savings;
            System.out.println("Month " + i + " the total savings are " + totalSavings + " rubles");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        do {
            System.out.print(i + " ");
            i = i + 1;
        }
        while (i <= 10);
        System.out.println();
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int i = 1; i <= 10; i++) {
            population = (population + (birthRate * population / 1000) - (deathRate * population / 1000));
            System.out.println("Year " + i + " the population is " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double savings = 15_000;
        int month = 0;
        double interestRate = 0.07;
        while (savings <= 12_000_000) {
            month = month + 1;
            savings = savings + savings * interestRate;
            int roundedSavings = (int) Math.round(savings);
            System.out.println("Month " + month + " the amount of savings is " + roundedSavings);
        }
        System.out.println("It will take " + month + " months to reach the goal of 12M total savings");
    }

    public static void task5() {
        System.out.println("Задача 5");
        double savings = 15_000;
        int i = 0;
        while (savings <= 12_000_000) {
            i = i + 1;
            savings = savings + savings * 7 / 100;
            int roundedSavings = (int) Math.round(savings);
            if (i % 6 == 0) {
                System.out.println("Month " + i + " the amount of savings is " + roundedSavings);
            }
        }
        System.out.println("It will take " + i + " months to reach the goal of 12M total savings");
    }

    public static void task6() {
        System.out.println("Задача 6");
        double savings = 15_000;
        int i = 1;
        while (i <= 9 * 12) {
            savings = savings + savings * 7 / 100;
            i = i + 1;
            int roundedSavings = (int) Math.round(savings);
            if (i % 6 == 0) {
                System.out.println("Month " + i + " the amount of savings is " + roundedSavings);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayNumberInitialFriday = 4;
        for (; dayNumberInitialFriday <= 31; dayNumberInitialFriday = dayNumberInitialFriday + 7) {
            System.out.println("Today is friday, the " + dayNumberInitialFriday + "th of august . You have to prepare the report.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int cometAppearenceYear = 0;
        int cometPeriod = 79;
        int twoCenturiesAgo = currentYear - 200;
        int aCenturyAfter = currentYear + 100;
        for (; cometAppearenceYear <= aCenturyAfter; cometAppearenceYear = cometAppearenceYear + cometPeriod) {
            if (cometAppearenceYear >= twoCenturiesAgo) {
                System.out.println(cometAppearenceYear);
            }
        }
    }
}