import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin {
    public static void roundRobin(int[] processes, int burstTime[], int timeQuantum) {
        Queue<Integer> queue = new LinkedList<>();
        int n = processes.length;
        int[] remainingBurstTime = new int[n];
        System.arraycopy(burstTime, 0, remainingBurstTime, 0, n);

        queue.add(0); // إضافة أول عملية
        int time = 0;

        while (!queue.isEmpty()) {
            int processIndex = queue.poll();
            if (remainingBurstTime[processIndex] > timeQuantum) {
                time += timeQuantum;
                remainingBurstTime[processIndex] -= timeQuantum;
                queue.add(processIndex); // إعادة إضافة العملية إلى الطابور
            } else {
                time += remainingBurstTime[processIndex];
                remainingBurstTime[processIndex] = 0;
                System.out.println("Process " + processes[processIndex] + " finished at time " + time);
            }
            // إضافة العمليات الجديدة إلى الطابور
            for (int i = 0; i < n; i++) {
                if (remainingBurstTime[i] > 0 && !queue.contains(i)) {
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] processes = {0, 1, 2, 3};
        int[] burstTime = {10, 5, 8, 6};
        int timeQuantum = 4;
        roundRobin(processes, burstTime, timeQuantum);
    }
}