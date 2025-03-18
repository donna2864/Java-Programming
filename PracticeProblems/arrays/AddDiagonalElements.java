public class AddDiagonalElements {
    public static int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            sum+=mat[i][i];
            if(i!=n-1-i){
                sum+=mat[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
