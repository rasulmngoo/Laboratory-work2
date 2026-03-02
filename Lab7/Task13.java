public class Task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        double sum = 0;

        for (int i = 0; i < C.length; i++) {
            C[i] = (int)(Math.random() * 50);
            System.out.print(C[i] + " ");
            sum += C[i];
        }

        System.out.println("\nСреднее значение: " + (sum / C.length));
    }
}