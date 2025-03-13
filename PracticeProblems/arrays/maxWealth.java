public class maxWealth {
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i=0; i<accounts.length;i++){
            int amount = 0;
            for(int j=0; j<accounts[i].length; j++){
                amount += accounts[i][j]; 
            }
            if(wealth<amount){
                wealth = amount;
            }
        }
        return wealth;
    }
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
