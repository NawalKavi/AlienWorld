public class MyCharacter {
    private int age;
    private int numberOfLegs;
    private int numberOfEyes;

    public MyCharacter(int age, int numberOfEyes, int numberOfLegs) {
        this.age = age;
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }
}
