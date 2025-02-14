/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author admin1
 */
class GameEntry {
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
