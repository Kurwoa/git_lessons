public class Arrays {


    public static int[] createArray(int len, int initialValue) {

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
