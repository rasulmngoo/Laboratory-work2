public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < B.length; i++) {
            B[i] = (int)(Math.random() * 100);
            System.out.print(B[i] + " ");
        }

        for (int i = 0; i < B.length - 1; i++) {
            for (int j = 0; j < B.length - i - 1; j++) {
                if (B[j] > B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }

        System.out.println("\nОтсортированный массив:");
        for (int x : B) {
            System.out.print(x + " ");
        }
    }
}