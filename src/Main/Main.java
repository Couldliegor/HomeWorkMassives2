package Main;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("TASK1");
        System.out.println();
        int[] arr = generateRandomArray();
        int valueOfPaymentsOff = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (i < 30) {
                valueOfPaymentsOff = valueOfPaymentsOff + arr[i];
            }
        }
        System.out.println("The spending per month is: " + valueOfPaymentsOff + " Rubles");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println();
        System.out.println("TASK2");
        System.out.println();
        int minValue = 200000;
        int maxValue = 0;
        int daysPerMonth = arr.length;
        //TASK2
        for (int j : arr) {
            if (minValue > j) {
                minValue = j;
            }
        }
        for (int J : arr) {
            if(maxValue < J){
                maxValue = J;
        }
            }
        maxValue = maxValue / daysPerMonth;
        minValue = minValue / daysPerMonth;
        System.out.println("The max payment per day is : " + maxValue + " in rubles");
        System.out.println("The min payment per day is : " + minValue + " in rubles");
    }
}