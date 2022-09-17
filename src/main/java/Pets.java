public class Pets {
    private String name;
    private int age;
    private String color;

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Pets(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

