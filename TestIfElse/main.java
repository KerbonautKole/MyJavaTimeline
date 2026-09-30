public class main {
	public static void main(String[] args) {
		System.out.println("If Test");
		System.out.println("If the following statement is 'The letter is A.' then you have selected 1 in the code.");
		System.out.println("If the following statement is 'The number is 1.' then you have selected 2 in the code.");
		int choice = 4;
		if (choice == 1) {
			System.out.print("The letter is A.");
		} else if (choice == 2) {
			System.out.print("The number is 1.");
		} else if (choice != 1 && choice != 2) {
			System.out.print("You didn't choose a valid choice.");
		}
	}
}