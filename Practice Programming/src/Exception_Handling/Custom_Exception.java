package Exception_Handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

class Custom_Exception {

	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not valid");
		} else {
			System.out.println("You are eligible to vote !");

		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		try {
			int n = sc.nextInt();
			validateAge(n);
			while (true) {
				
				System.out.println("Want to check more Y/N :");
				char yes_no = sc.next().charAt(0);
				
				if (yes_no == 'y')
				{
					System.out.println("Enter Age : ");
					int  a= sc.nextInt();
					validateAge(a);
				} 
				else {
					System.out.println("Thank You !");
					break;
				}
			}
		} 
		catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

	}
}
