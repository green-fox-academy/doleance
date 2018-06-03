public abstract class Animal {
    private String name;
    private int age;
    private enum gender {
        FEMALE,
        MALE;
    }
    private int numberOfLegs;
    private boolean isItDead = false;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public boolean isItDead() {
        return isItDead;
    }
    public void setItDead(boolean itDead) {
        isItDead = itDead;
    }

    public abstract void breed();
}
