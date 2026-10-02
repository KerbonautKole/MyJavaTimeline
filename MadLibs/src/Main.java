import java.util.Scanner;
public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Give me a noun: ");
        String noun = scanner.nextLine();
        System.out.print("Give me a past tense verb: ");
        String verb = scanner.nextLine();
        System.out.print("Give me a place: ");
        String place = scanner.nextLine();
        System.out.print("Give me a past tense verb: ");
        String verb2 = scanner.nextLine();
        System.out.println("The " + noun + " " + verb + " in " + place + " and " + verb2 + ".");
    }
}