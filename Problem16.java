import java.util.*;
import java.math.*;
public class Problem16{
	public static void main(String[] args) {
		BigInteger number = new BigInteger("0");
		BigInteger base = new BigInteger("2");
		int exponente = 1000;
		String add = "+";
		String equal = "=";
		int result = 0;
		number = number.add(base.pow(exponente));
		String numberStr = number.toString();
		System.out.println( "Length: "+ numberStr.length() ); 
		System.out.println( numberStr );
		System.out.println( "---------------------" );
		for (int i = 0; i < numberStr.length(); i++ ) {
			result = result + numberStr.charAt(i)-'0';
			if ( i < numberStr.length() - 1) {
				System.out.print(numberStr.charAt(i) + add);	
			}else{
				System.out.println(numberStr.charAt(i) + equal + result);
			}
		}
	}
}