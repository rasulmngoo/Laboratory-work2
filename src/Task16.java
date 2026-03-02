public class Task16 {
    public static void main(String[] args) {
        System.out.println("Максимальный элемент: " + maxX());
    }

    public static short maxX() {
        short[] array = new short[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (short)(Math.random() * 50);
            System.out.print(array[i] + " ");
        }

        short max = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}