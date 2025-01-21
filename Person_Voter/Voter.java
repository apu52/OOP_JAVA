import java.util.ArrayList;
import java.util.Scanner;

public class Voter extends Person {

    public Voter(int id, String name, String gender, String dateOfBirth, int age) {
        super(id, name, gender, dateOfBirth, age);
    }

    public static void registerVoter(Person person, ArrayList<Voter> voters) throws InvalidVoterException {
        if (person.age < 18) {
            throw new InvalidVoterException("Person " + person.name + " is below 18 years old and cannot be registered as a voter.");
        } else {
            Voter voter = new Voter(person.id, person.name, person.gender, person.dateOfBirth, person.age);
            voters.add(voter);
            System.out.println(person.name + " has been registered as a voter.");
        }
    }

    public void displayVoterInfo() {
        displayPersonInfo();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Voter> voters = new ArrayList<>();

        System.out.print("Enter the number of persons to register: ");
        int numPersons = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            Person person = new Person(id, name, gender, dateOfBirth, age);

            try {
                registerVoter(person, voters);
            } catch (InvalidVoterException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nRegistered Voters:");
        for (Voter voter : voters) {
            voter.displayVoterInfo();
            System.out.println();
        }

        scanner.close();
    }
}
