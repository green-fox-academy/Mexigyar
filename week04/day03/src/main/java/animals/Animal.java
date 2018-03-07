package main.java.animals;

public abstract class Animal {
    private String name;
    private String gender;
    private  int age;
    private  int maxMassInKg;
    private  int massInKg;


    public abstract String breed();

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMaxMassInKg(int maxMassInKg) {
        this.maxMassInKg = maxMassInKg;
    }

    public void setMassInKg(int massInKg) {
        this.massInKg = massInKg;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getMaxMassInKg() {
        return maxMassInKg;
    }

    public int getMassInKg() {
        return massInKg;
    }
}
