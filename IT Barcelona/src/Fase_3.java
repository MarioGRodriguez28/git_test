import java.util.*;
 
	public class Fase_3 {
		public static void main(String[] args)
		{
	
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		String Nombre= ("Mario"); 
		
		for ( int i = 0; i < Nombre.length(); i++ ) {
			if ( map.containsKey ( Nombre.charAt ( i ) ) ) {
				map.put ( Nombre.charAt ( i ), (int)map.get ( Nombre.charAt ( i ) ) + 1 );
			} else {
				map.put ( Nombre.charAt ( i ), 1 );
			}
		}
 
		Set<Map.Entry<Character, Integer>> freq = map.entrySet();
 
		Iterator<Map.Entry<Character, Integer>> it = freq.iterator();
 
			while ( it.hasNext() ) {
			Map.Entry<Character, Integer> letra = it.next();
			System.out.println ( letra.getKey() + ": " + letra.getValue() );
		}
	}
}