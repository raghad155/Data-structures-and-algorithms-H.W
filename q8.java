import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
    public static int josephus(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll()); // نقل العنصر إلى النهاية
            }
            queue.poll(); // إزالة العنصر
        }
        return queue.poll(); // إرجاع الناجي
    }

    public static void main(String[] args) {
        int n = 7; // عدد الأشخاص
        int k = 3; // كل k-th شخص
        System.out.println("The survivor is: " + josephus(n, k));
    }
}