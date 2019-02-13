package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class AnimalWithFeet extends Animal {
    
    public void moveForward() {
        System.out.println("I am moving forward using my feet!!!");
    }
    
    public void moveBackward() {
        System.out.println("I am moving backward using my feet!!!");
    }
    
}
