import java.util.*;
public class Problem4{
	public static void main(String[] args) {
		int numberInitial = 100;
		int numberFinal = 1000;
		int producto = 0;
		String productoStr = "";
		List<String> list = new ArrayList<String>();
		for (int factorOne = numberInitial; factorOne < numberFinal; factorOne++) {
			for (int factorTwo = numberInitial; factorTwo < numberFinal; factorTwo++) {
				producto = factorOne * factorTwo;
				productoStr = String.valueOf(producto);
				if(productoStr.length() == 6){
					if ( isCapicuo6(productoStr) ) {
						list.add(productoStr);
					}
				}
				System.out.println(factorOne + " X " + factorTwo + " = " + producto);
			}
		}
		for(int i = 0;i<list.size();i++){
            System.out.println("Capicua " + i +" is: " + list.get(i));
		}
		
	}

	public static boolean isCapicuo5( String numberStr ){
		int longitud = numberStr.length();
		char [] item = new char[longitud]; 
		boolean comparation = false;

		for (int i = 0; i < numberStr.length(); i++) {
			item[i] = numberStr.charAt(i);			
		}
		if((item[0] == item[4]) && (item[1] == item[3])){
			comparation = true;	
		}
		
		return comparation;
	}

	public static boolean isCapicuo6( String numberStr ){
		int longitud = numberStr.length();
		char [] item = new char[longitud]; 
	
		for (int i = 0; i < numberStr.length(); i++) {
			item[i] = numberStr.charAt(i);			
		}

		if (item[0] == item[5] && item[1] == item[4] && item[2] == item[3]) {
			return true;
		}else{
			return false;
		}
	}
}