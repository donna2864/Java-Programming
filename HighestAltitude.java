public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        int highest = 0;
        for(int i=0; i<altitudes.length; i++){
            if(i==0){
                altitudes[i] = i;
                highest = altitudes[i];
            }else{
                altitudes[i] = altitudes[i-1]+gain[i-1];
                if(altitudes[i]>highest){
                    highest = altitudes[i];
                }
            }
        }
        return highest;
    }
    public static void main(String[] args) {
        int[] gain = {-5,1,0,5,2};
        System.out.println(largestAltitude(gain));
    }
}