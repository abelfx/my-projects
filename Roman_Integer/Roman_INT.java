package Roman_Integer;

import java.util.HashMap;
import java.util.Scanner;

public class Roman_INT {
	
	public static int romanToInt(String s) {
	        
	        HashMap<Character, Integer> mapper = new HashMap<>();
	        
	        mapper.put('I', 1);
	        mapper.put('V', 5);
	        mapper.put('X', 10);
	        mapper.put('L', 50);
	        mapper.put('C', 100);
	        mapper.put('D', 500);
	        mapper.put('M', 1000);
	        
	        int result = 0;
	        
	        for(int i = 0; i < s.length(); i++){
	            if(i + 1 <s.length() && mapper.get(s.charAt(i)) < mapper.get(s.charAt(i+1))){
	                result -= mapper.get(s.charAt(i)) ;
	            }
	                  
	            else {
	                result +=mapper.get(s.charAt(i)) ;
	                
	             }
	        }
	        
	        return result;
	}
	
	 public static String intToRoman(int num) {
	        int intValue[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        String code[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<intValue.length;i++) {
	            while(num>=intValue[i]) {
	                sb.append(code[i]);
	                num=num-intValue[i];
	            }
	        }
	        return sb.toString();
	    }
}
