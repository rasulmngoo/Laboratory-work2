public class Task10 {
    public static void main(String[] args) {
        int[][] D = new int[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = (int)(Math.random() * 10);
            System.out.print(D[i][i] + " ");
            sum += D[i][i];
        }

        System.out.println("\nСреднее: " + (sum / 7));
    }
}