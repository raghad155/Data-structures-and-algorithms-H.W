import java.util.Arrays;
import java.util.Random;

public static void removeRandomEntries(int[] array) {
    Random random = new Random();
    while (array.length > 0) {
        int index = random.nextInt(array.length);
        // إزالة العنصر
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
    }
}