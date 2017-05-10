package com.pedroborgesalves.hackerrank.arrayleftrotation;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * @author pedroborgesalves
 */
public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
      
        int[] result = new int[a.length];
        
        if(k == 0){
            return a;
        }
        for(int i = 0; i < a.length; i++){
            int newLocation = (i + (a.length - k)) % a.length;
            result[newLocation] = a[i];
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }

}
