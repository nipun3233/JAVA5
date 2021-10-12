package home;

public class Count_Vowels {
	public static void main(String[] args) {    
        int var = 0, con = 0 ,syb = 0;
        String str = "Hey!this is a really good Question,isn't it:($) ";
        str = str.toLowerCase(); 
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
            	
                var++;    
            }   
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
            
                con++;    
            } 
            else if(str.charAt(i) >= ' ' && str.charAt(i)<= '@') {
            	syb++;
            }
	}
        System.out.println("Number of vowels: " + var);   

        System.out.println("Number of consonants: " + con);    
	
        System.out.println("Number of consonants: " + syb);    
	
	}
}
	
