
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        String s = "aakkaskhkhk";
        System.out.println(maxFrequency(s));
    }
    
    public static char maxFrequency(String s){
        int count = 0;
        char ans = 0;
        Map<Character, Integer> mp = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
            
            if(count<mp.get(s.charAt(i))){
                count=mp.get(s.charAt(i));
                ans = s.charAt(i);
            }
        }
        return ans;
    }
}
