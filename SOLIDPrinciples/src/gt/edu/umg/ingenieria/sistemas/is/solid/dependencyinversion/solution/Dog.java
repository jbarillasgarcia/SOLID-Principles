package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

public class Dog implements Move {
    
    private String name;

    public Dog(String name) {
        this.name = name;
    }    

    @Override
    public void move() {
        this.walk();
    }
    
    private void walk() {
        System.out.println(String.format("I am %s and I am walking.", this.name));
    }
    
}
