package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class Cat extends AnimalWithFeet {
    
    @Override
    public void moveForward() {
        System.out.println("I am a cat and I can move forward using my feet.");        
    }
    
    @Override
    public void moveBackward() {
        System.out.println("I am a cat and I can move backward using my feet.");
    }
    
}
