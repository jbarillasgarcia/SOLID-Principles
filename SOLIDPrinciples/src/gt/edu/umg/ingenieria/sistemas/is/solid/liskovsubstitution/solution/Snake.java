package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class Snake extends AnimalWithoutFeet {
    
    @Override
    public void moveForward() {
        System.out.println("I am a snake and I can move forward using my body.");
    }
    
    @Override
    public void moveBackward() {
        System.out.println("I am a snake and I can move backward using my body.");
    }
    
}
