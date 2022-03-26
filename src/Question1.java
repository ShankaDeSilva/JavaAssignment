import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Age : ");
		int age = sc.nextInt();
		
		if(age < 25) {
			System.out.println("You cannot rent a house");
			if(age < 18) {
				System.out.println("You cannot vote");
				if(age < 16) {
					System.out.println("you cannot drive");
				}
			}
		} else {
			System.out.println("You can do anything that is legal");
		}
		sc.close();
	}
}
