public class checkIfPangrams {
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(int i='a'; i<='z';i++){
            if(sentence.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
