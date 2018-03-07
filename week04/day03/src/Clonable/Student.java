package Clonable;

public class Student extends Person implements Cloneable{
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
    public void skipDays(int daysSkipped){
        skippedDays += daysSkipped;
    }

    public String getPreviusOrganization() {
        return previusOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Student John = new Student("John",20, "male", "none");

        try {
            Student john2 = (Student) John.clone();
            John.clone();
            John.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(John.toString());
    }


}
