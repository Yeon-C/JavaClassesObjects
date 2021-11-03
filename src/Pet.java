public class Pet {

    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }




    public static void main(String[] args) {
        Pet Garfield = new Pet("Garfield", 43, "Muncie", "Orange Tabby");
        System.out.println(Garfield.getName());
        System.out.println(Garfield.getAge());
        System.out.println(Garfield.getType());
    }

}
