/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLTB_sachin.Class;

/**
 *
 * @author sachin kumara
 */
public class Shuffle {

    public int[] shuffleint(int[] a) {

        int n = a.length;
        int suffnum[] = new int[n];
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [i, n-1]
            int r = i + (int) (Math.random() * (n - i));
            int swap = a[r];
            a[r] = a[i];
            suffnum[i] = swap;
        }

        for (int i = 0; i < n; i++) {
            // choose index uniformly in [i, n-1]
            int r = i + (int) (Math.random() * (n - i));
            int swap = suffnum[r];
            suffnum[r] = suffnum[i];
            suffnum[i] = swap;
        }
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [i, n-1]
            int r = i + (int) (Math.random() * (n - i));
            int swap = suffnum[r];
            suffnum[r] = suffnum[i];
            suffnum[i] = swap;
        }

        return suffnum;
    }
}
