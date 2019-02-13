package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class Fish extends AnimalWithoutFeet {
    
    @Override
    public void moveForward() {
        System.out.print("I am a fish. ");
        super.moveForward();
    }
    
    @Override
    public void moveBackward() {
        System.out.print("I am a fish. ");
        super.moveBackward();
    }
    
}
