package task1;

public class ArrayAnalyzer {

    public static boolean isMountainArray(int[] array) {
        if (array.length < 3) {
            return false;
        }
        int maxIndex = findMaxIndex(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) return false; //check for strong increase
            if (i == maxIndex && array[i] < array[i + 1]) return false;
            if (array[i] > array[i + 1] && i < maxIndex) return false;
            if (array[i] < array[i + 1] && i >= maxIndex) return false;
        }
        return true;
    }

    public static int findMaxIndex(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.printf("%s%n", isMountainArray(new int[]{2, 1}));
        System.out.printf("%s%n", isMountainArray(new int[]{2, 1, 0}));
        System.out.printf("%s%n", isMountainArray(new int[]{0, 3, 2, 1}));
        System.out.printf("%s%n", isMountainArray(new int[]{3,5,5}));
        System.out.printf("%s%n", isMountainArray(new int[]{3,5,6}));

    }
}
