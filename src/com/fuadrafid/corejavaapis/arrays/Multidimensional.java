package com.fuadrafid.corejavaapis.arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array

        String [][] rectangle = new String[3][2];// specify size

        int[][] differentSize = {{1, 4}, {3}, {9,8,7}}; // different sizes of sub-arrays

        //different sized sub-arrays can be initiated also
        int [][] variableSize = new int[4][];
        variableSize[0] = new int[5];
        variableSize[1] = new int[3];

        for (int[] inner : differentSize) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
