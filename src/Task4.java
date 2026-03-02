public class Task4 {
    public static void main(String[] args) {
        int[] C = new int[25];
        long product = 1;

        for (int i = 0; i < C.length; i++) {
            C[i] = (int)(Math.random() * 20 - 10);
            System.out.print(C[i] + " ");
            if (C[i] > 0) product *= C[i];
        }

        System.out.println("\nПроизведение положительных: " + product);
    }
}