public class IfRotateMatrix{
  public boolean findRotation(int[][] mat, int[][] target) {
          int n = mat.length;
          boolean rotate90 = true, rotate180 = true, rotate270 = true, rotate360 = true;
          for(int row=0; row<n; row++){
              for(int column=0; column<n; column++){
                  int current =  mat[row][column];
                  rotate90 &= current == target[n-1-column][row];
                  rotate180 &= current == target[n-1-row][n-1-column];
                  rotate270 &= current == target[column][n-1-row];
                  rotate360 &= current == target[row][column];
              }
          }
          return rotate90 || rotate180 || rotate270 || rotate360;
      }
  public static void main(String[] args){
    int[][] mat = {{0,1},{1,0}};
    int[][] target = {{1,0},{0,1}};
    System.out.println(findRotation(mat, target));
}
