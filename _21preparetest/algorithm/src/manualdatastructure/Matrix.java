package manualdatastructure;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 2},
                {1, 3, 6},
                {1, 3, 2},
        };

        for(int[] row : matrix){
            for(int col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
