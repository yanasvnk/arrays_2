public class Main {

    // Домашнее задание 1
    // Задача 1

    public static int [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] costs = new int[30];
        for (int i = 0; i < costs.length; i++) {
            costs[i] = random.nextInt(100_000) + 100_000;
        }
        return costs;
    }
    public static void main(String[] args) {
        int sum = 0;
        int[] costs = generateRandomArray();
        for (int i = 0; i < 30; i++) {
            sum += costs[i];
        }
        System.out.println("Сумма трат за месяц " + sum + " рублей");


        // Задача 2
        int min = costs[0];
        int max = costs[0];
        for (int i = 0; i < 30; i++) {
            if (costs[i] < min) {
                costs[i] = min;
            } else if (costs[i] > max) {
                max = costs[i];
            }
        }
        System.out.println("Минимальные затраты за день " + min + " рублей");
        System.out.println("Максимальные затраты за день " + max + " рублей");

        // Задача 3
        System.out.println("Средняя сумма трат за месяц составила " + (float) sum / 30 + "рублей");

        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int g = reverseFullName.length-1; g >= 0; g--) {
            System.out.print(reverseFullName[g]);
        }


    }


        }













