public class Person {
    int id;
    String name;
    String gender;
    String dateOfBirth;
    int age;

    
    public Person(int id, String name, String gender, String dateOfBirth, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    
    public void displayPersonInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + gender + ", DOB: " + dateOfBirth + ", Age: " + age);
    }
}
