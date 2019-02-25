import java.util.Arrays;
import java.util.List;

public class Fase_2 {
   
    
    public static void main(String[] args) {
  
    	List<Character> Nombre=Arrays.asList ('M','A','R','I','O');
    	List<Character> Vocales=Arrays.asList ('a','e','i','o','u','A','E','I','O','U');
    	List<Character> Numeros=Arrays.asList ('0','1','2','3','4','5','6','7','8','9');
    	
    	if(Numeros.contains(Nombre.get(0))) {
    		
			System.out.println("Els noms de persones no contenen números!");
    		}    	
    	
    		else if(Vocales.contains(Nombre.get(0))) {
    				System.out.println("VOCALS");
    			}
    				else{
    					System.out.println("CONSONANT");
    	}
     }
}
   
	
