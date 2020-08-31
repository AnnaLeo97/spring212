public class POJOCat {
    public String name;
    public String breed;
    public int age;

    public POJOCat (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String specification() {
        return this.breed + " " + this.name;
    }
}
