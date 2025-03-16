import java.util.Arrays;

public class FlipAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            reverse(row);
            inverted(row);
        }
        return image;
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void inverted(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }
}