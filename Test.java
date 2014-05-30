import java.util.*;

public class Test{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepAdding = true;
		ArrayList<Question> questions = new ArrayList<Question>();		

		do{
			System.out.println("Titulo de la pregunta");
			String title = scanner.nextLine();
			
			Question question =  new Question();
			question.setQuestion(title) ;
			questions.add(question);

			System.out.println("Deseas continuar (Y/N)");
			String answer = scanner.nextLine();

			keepAdding = (answer.equalsIgnoreCase("Y"));
		} while(keepAdding); 

		for( Question question: questions ){
			System.out.println("Pregunta : "+question.getQuestion() );	
		}
	}
}