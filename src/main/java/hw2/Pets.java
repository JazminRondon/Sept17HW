package hw2;

public class Pets {
    private String name;
    private String noise;

    public Pets(String name, String noise) {
        this.name = name;
        this.noise = noise;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public static void makeNoise(Pets pets) {
        if (pets instanceof Dog) {
            System.out.println(pets.noise);
        } else if (pets instanceof Cat) {
            System.out.println(pets.noise);
        } else if (pets instanceof Frog) {
            System.out.println(pets.noise);
        } else {
            System.out.println("");
        }
    }
}
