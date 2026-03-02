public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int)(Math.random() * 20 - 10);
                System.out.print(A[i][j] + "\t");
                if (A[i][j] < 0) B[i] += A[i][j];
            }
            System.out.println();
        }

        System.out.println("Суммы отрицательных по строкам:");
        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}