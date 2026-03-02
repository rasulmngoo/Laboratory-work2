public class Task14 {
    public static void main(String[] args) {
        int[] D = new int[30];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = (int)(Math.random() * 50);
            System.out.print(D[i] + " ");

            if (D[i] % 2 == 0)
                evenSum += D[i];
            else
                oddSum += D[i];
        }

        System.out.println("\nСумма чётных: " + evenSum);
        System.out.println("Сумма нечётных: " + oddSum);
    }
}