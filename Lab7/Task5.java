public class Task5 {
    public static void main(String[] args) {
        int[] D = new int[17];
        double sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = (int)(Math.random() * 20);
            System.out.print(D[i] + " ");
            sum += D[i];
        }

        System.out.println("\nСреднее: " + (sum / D.length));
    }
}