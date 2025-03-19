import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        int[][] finalmtx = new int[collen][rowlen];
        for(int row=0; row<rowlen; row++){
            for(int column=0; column<collen; column++){
                finalmtx[column][row] = matrix[row][column];
            }
        }
        return finalmtx;
    }
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] results = transpose(matrix);
        for(int i=0; i<results.length; i++){
            System.out.println(Arrays.toString(results[i]));
        }
    }
}
