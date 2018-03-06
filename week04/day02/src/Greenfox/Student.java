package Greenfox;

public class Student extends Person{
    private String previusOrganization;
    private  int skippedDays;

    public Student(String name, int age, String gender, String previusOrganization) {
        super(name, age, gender);
        this.previusOrganization = previusOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.previusOrganization = "The school of life";
        this.skippedDays = 0;
    }

    public void  getGoal(){
        System.out.println("Be a junior Software Developer");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "year old " + getGender() + "from " + previusOrganization + "who skipped " + skippedDays + "days from the course already.");
    }

    public String getPreviusOrganization() {
        return previusOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }
}
