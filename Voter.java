import java.util.ArrayList;

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
}
