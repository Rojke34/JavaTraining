import java.util.*;
public class QuickSort{ 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers[];
		numbers = new int[9];
		numbers[0] = 3;
		numbers[1] = 7;
		numbers[2] = 8;
		numbers[3] = 5;
 		numbers[4] = 2;
 		numbers[5] = 1;
 		numbers[6] = 9;
 		numbers[7] = 5;
 		numbers[8] = 4;

 		int[] auxVector = {8,7,3,1,2,5,4,5,9};

 		int[] myArray;

		System.out.println("Type length of th Vector");
		int lengthArray = Integer.parseInt(scanner.nextLine());
		myArray = new int[ lengthArray ];

		System.out.println("length of vector is: "+myArray.length);
		System.out.println("Fill vector item");

		for ( int i = 0; i < myArray.length ; i++ ) {
			System.out.println("Value " + i + " is: " );
			myArray[i] = Integer.parseInt(scanner.nextLine());
		}

		System.out.println("Do you want reorder the vector? (Y/N)");
		String answer = scanner.nextLine();

		if (answer.equalsIgnoreCase("Y")) {
			firstReorde(myArray);
		}else{
			System.out.println("Bye!");
		}


		for ( int item : myArray) {
			System.out.println("Item: "+ item);
		}

 		for ( int i = 0; i < numbers.length ; i++ ) {
 			System.out.println("Vector numerbers position " + i + " value " + numbers[i]);	
 		}
 		
 		for ( int i = 0; i < auxVector.length ; i++ ) {
 			System.out.println("Vector auxVector position " + i + " value " + auxVector[i]);	
 		}
	}
	public static int firstReorde( int[] array){
		int aux = 0;
		if (array.length <= 1) {
			System.out.println("vector is ok");
		}else{
			System.out.println("Working... ");
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));
		}
		return 0;
	}
}