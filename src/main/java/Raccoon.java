public class Raccoon {
    Raccoon(String nameFromConstructor) {
        this.name = nameFromConstructor;
    }

    Raccoon(int age) {
        System.out.println("The age is to be set to" + age);
        this.age = age;
        System.out.println("The age is set to" + age);
    }

    Raccoon(String raccoonName, int raccoonAge, double raccoonWeight) {
        this.name = raccoonName;
        if (raccoonAge < 0) {
            throw new IllegalStateException("wrong age");
        } else {
            this.age = raccoonAge;
        }
        this.weight = raccoonWeight;
    }

    Raccoon() {
    }

    private String name;
    private int age;
    private double weight;
    public String heirColor;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
