public class Task8 {
    public static void main(String[] args) {
        int[][] A = new int[12][6];

        for (int j = 0; j < 6; j++) {
            int product = 1;
            boolean hasNegative = false;

            for (int i = 0; i < 12; i++) {
                A[i][j] = (int)(Math.random() * 20 - 10);
                if (A[i][j] < 0) {
                    product *= A[i][j];
                    hasNegative = true;
                }
            }

            if (hasNegative)
                System.out.println("Столбец " + j + ": " + product);
            else
                System.out.println("Столбец " + j + ": нет отрицательных");
        }
    }
}