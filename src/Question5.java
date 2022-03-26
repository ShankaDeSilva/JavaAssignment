import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int ans;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you ready for a quiz? ");
		char answer = scanner.next().charAt(0);
		
		if(answer == 'Y' || answer == 'y') {
			System.out.println("Okay here it comes!! \n");
			
			System.out.println("Q1. What is the capital of Alaska");
			System.out.println("\t 1) Melbourne \n\t 2) Anchorage \n\t 3) Juneau \n");
			
			ans = scanner.nextInt();
			switch(ans) {
			case 1:
				System.out.println("Sorry Answer is incorrect. Answer is 3.");
				break;
			case 2:
				System.out.println("Sorry Answer is incorrect. Answer is 3.");
				break;
			case 3:
				System.out.println("That's right!!! Well done.");
				break;
			default:
				System.out.println("Please enter correct number");
			}
			
			System.out.println("Q2. Can you store the value 'Dog' in a variable of type int?");
			System.out.println("\t 1. Yes. \n\t 2. No \n");
			
			ans = scanner.nextInt();
			switch(ans) {
			case 1:
				System.out.println("Sorry Answer is incorrect. Answer is 2.");
				break;
			case 2:
				System.out.println("That's right!!! Well done.");
				break;
			default:
				System.out.println("Please enter correct number");
			}
		}
		scanner.close();
	}

}
