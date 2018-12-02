package clinic.programming.training ;
import java.util.ArrayList ;
import java.util.List ;

public class Application{
	
	public int countWords(String words) {
			if(words == null) {
				return 0 ;
			} else if (words == "") {
				return 0 ;
			} else {
				String[] separateWords = words.split(" ") ;
				return separateWords.length ;
			}
	}
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String greeting : greetings) {
			System.out.println("Greeting : " + greeting) ;
		}
	
	}
	
	public Application(){
		System.out.println("Initializing application");
	}
	
	public static void main(String[] args){
		System.out.println("Starting application");
		Application app = new Application();
		app.greet();
		
		int count = app.countWords("I have four words") ;
		System.out.println("Word count : " + count) ;
	}

}