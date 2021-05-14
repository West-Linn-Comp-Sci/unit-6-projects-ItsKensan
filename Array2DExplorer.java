package com.company;

public class Array2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };

        Array2DExplorer exp = new Array2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: 1 \n Actual: ");

        System.out.println(exp.minRow(array, 0));

        System.out.println(exp.allRowSums(array));


    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int[] [] mat, int row){

        int target = mat[row].length;
        int counter = 0;

        for (int i = 0; i < mat[row].length; i++){

            if (mat[row][i] % 2 == 0){
                counter++;
            }
        }

        if (target == counter){
            return true;
        }
            return false;


    }

    public boolean oddColSum(int[] [] mat, int row){

        int counter2 = 0;

        for (int i = 0; i < mat[row].length; i++){

            if (mat[row][i] % 2 == 0){
                counter2++;
            }
        }

        if (0 == counter2){
            return true;
        }
            return false;

    }


    public int minRow(int [][] mat, int row){
        int min = mat[row][0];

        for (int i = 1; i < mat[row].length; i++){
            if (mat[row][i] < min){
                min = mat[row][i];
            }

        }
        return min;
    }

    public int colMaxs(int[][] matrix){

        int max = 100;
        for (int i = 0; i < 4; i++){

            for (int col = 0; col < 3; col++){

                if (max > matrix[i][col]){
                    max = matrix[i][col];
                }

            }

        }
            return max;
    }

    public int allRowSums(int[][] data){

        int sum = 0;
        for (int row= 0; row < data.length; row++)
        {
            for (int col= 0; col < data[row].length; col++)
            {
                sum = sum + data [row][col];
            }
        }

        return sum;
    }

    public int smallEven(int[][] matrix){
        int smallEven = 100;

        for (int row= 0; row < matrix.length; row++) {

            for (int col= 0; col < matrix[row].length; col++)
            {
               if (smallEven < matrix[row][col]){
                   smallEven = matrix[row][col];
               }
            }
        }
        return smallEven;
    }

    public static int biggestRow(int[][] nums){
        int max = 100;
        for (int i = 0; i < 4; i++){

            for (int col = 0; col < 3; col++){

                if (max > nums[i][col]){
                    max = nums[i][col];
                }

            }

        }
        return max;
    }
}
