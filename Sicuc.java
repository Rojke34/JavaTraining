import java.util.*;
public class Sicuc{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepAdding = true;
		ArrayList<Student> students = new ArrayList<Student>();	
		scanner.useDelimiter("\n");

		do{	
			Student student = new Student();
			System.out.println("Type in name of the studen");			
			student.setName(scanner.nextLine());

			System.out.println("What is his first qulification?");			
			student.setScoreOne(Double.parseDouble(scanner.nextLine()));

			System.out.println("What is his second qulification?");
			student.setScoreTwo(Double.parseDouble(scanner.nextLine()));

			System.out.println("What is his third qulification?");			
			student.setScoreThree(Double.parseDouble(scanner.nextLine()));
						
			students.add(student);

			System.out.println("Do you wish add a new student? (Y/N)");
			String answer = scanner.nextLine();
			keepAdding = answer.equalsIgnoreCase("Y")	;
		}while(keepAdding);

		for( Student student: students ){
			System.out.println("Student : "+ student.getName() + "'s qulification average is: " + student.getAverage() );	
		}
	}
}