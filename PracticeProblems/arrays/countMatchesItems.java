import java.util.*;

public class countMatchesItems{
public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int key=0;
       int count =0;
       switch(ruleKey){
        case "type": key =0;break;
        case "color": key =1; break;
        case "name": key=2;break;
       }
       return count(items,key,ruleValue,count,0); 
    }
    public static int count(List<List<String>> items, int key, String val,int c,int i){
        if (i== items.size())
         return c;
        List<String> item = items.get(i);
        if(item.get(key).equals(val))
         c++;
        return count(items,key,val,c,++i) ; 
    }
    public static void main(String[] args) {
          List<List<String>> items = Arrays.asList(
              Arrays.asList("phone", "blue", "pixel"),
              Arrays.asList("computer", "silver", "lenovo"),
              Arrays.asList("phone", "gold", "iphone")
          );
          
          String ruleKey = "color";
          String ruleValue = "blue";
          
          int result = countMatches(items, ruleKey, ruleValue);
          System.out.println("Number of matching items: " + result);
      }
}
