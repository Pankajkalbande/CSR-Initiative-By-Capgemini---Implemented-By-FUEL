/*
5.  Create a class called Person with a member variable first_ name and last_name.
 Save it in a file called Person.java 
Create a class called Teacher who will inherit the Person class. 
The other data members of the Teacher class are annual salary (double),
 the year the teacher started to work, and number of years of experience 
 which is int. Save this in a file called Teacher.java 

NOTE :Your class should have a constructor in base class and derived class. Use getter methods to show values.

 */
class person {
    String first_name;
    String last_name;

    person() {

    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}

class Teacher extends person {

    double annual_salary;
    int working_year;
    int experience;

    public void setAnnual_salary(double annual_salary) {
        this.annual_salary = annual_salary;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public double getAnnual_salary() {
        return annual_salary;
    }
    public int getWorking_year() {
        return working_year;
    }
    public int getExperience() {
        return experience;
    }
    Teacher() {

    }

}

public class Person {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setFirst_name("Pankaj");
        System.out.println(t.getFirst_name());
        

    }

}
