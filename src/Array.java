public class Array {


    public static void invertArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    public static void printArray(int[] array) {

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }


}
