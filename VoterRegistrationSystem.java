import java.util.ArrayList;
import java.util.Scanner;

public class VoterRegistrationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline

        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();  

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Date of Birth (dd-mm-yyyy): ");
            String dob = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();  

            persons.add(new Person(id, name, gender, dob, age));
        }

        
        ArrayList<Voter> voters = new ArrayList<>();

        
        ArrayList<Person> invalidVoters = new ArrayList<>();
        for (Person person : persons) {
            try {
                Voter.registerVoter(person, voters);
            } catch (InvalidVoterException e) {
                System.out.println(e.getMessage());
                invalidVoters.add(person);
            }
        }

        
        System.out.println("\nList of Registered Voters:");
        if (voters.isEmpty()) {
            System.out.println("No valid voters registered.");
        } else {
            for (Voter voter : voters) {
                voter.displayVoterInfo();
            }
        }

        
        System.out.println("\nList of Invalid Voters:");
        if (invalidVoters.isEmpty()) {
            System.out.println("No invalid voters.");
        } else {
            for (Person invalidVoter : invalidVoters) {
                invalidVoter.displayPersonInfo();
            }
        }

        sc.close();
    }
}
