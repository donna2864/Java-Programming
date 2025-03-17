public class CellswithOddValuesinaMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int oddcounter=0;
        for(int i[]: indices){
            row[i[0]]++;
            col[i[1]]++;
        }
        for(int i=0; i<row.length; i++){
            for(int j=0; j<col.length; j++){
                if((row[i]+col[j])%2!=0){
                    oddcounter++;
                }
            }
        }
        return oddcounter;
    }
    public static void main(String[] args) {
        int m = 2; int n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m, n, indices));
    }
}
