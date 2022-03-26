import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int no = random.nextInt(10);
		
		System.out.println("Please enter the guessed number : ");
		int guess = sc.nextInt();
		
		if(guess == no) {
			System.out.println("You are correct. No is : " + no + "\n Thank You");
		} else {
			System.out.println("You are wrong. No is : " + no + "\n Thank You");
		}
		
		sc.close();
	}

}
