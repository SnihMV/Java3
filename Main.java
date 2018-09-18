import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Character[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        printArray(chars);
        printArray(swapTwoItems(chars, 1, 6));
        System.out.println(convertToArrayList(chars));


    }

    public static <T> T[] swapTwoItems(T[] arr, int x, int y) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr.length || x == y) {
            System.out.println("Введены некорректные параметры!");
            return arr;
        }
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }

    public static <T> ArrayList<T> convertToArrayList(T[] arr) {
        ArrayList<T> aL = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            aL.add(arr[i]);
        }
        return aL;
    }

    private static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
