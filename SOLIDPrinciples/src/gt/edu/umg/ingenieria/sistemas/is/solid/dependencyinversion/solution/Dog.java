package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

public class Dog implements Move {

    @Override
    public void move() {
        this.walk();
    }
    
    private void walk() {
        System.out.println("I am a dog and I am walking.");
    }
    
}
