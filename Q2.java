
package lab1;

public class Q2 {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }
}

public class ArrayCloning {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 10);
        }

        // Clone array A into array B
        GameEntry[] B = A.clone();

        // Modify the score of the 5th element in A
        A[4].score = 550;

        // Print the score of the 5th element in B
        System.out.println("Score of B[4]: " + B[4].score);
    }
    
}
