package hw3;
//Make a method that accepts an array of animals and prints out what each animal eats!
public class Animals {
    public String name;
    public String eat;

    Animals(String name,String eat){
        this.name=name;
        this.eat=eat;
    }
    public void sound() {
        System.out.println("The animal eats");
    }
}

//https://www.cs.utexas.edu/~nclement/aces/javaII/10-polymorphism-arraylists.html
//https://www.w3schools.com/java/java_polymorphism.asp