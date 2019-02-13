package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class Cat extends AnimalWithFeet {
    
    @Override
    public void moveForward() {
        System.out.print("I am a cat. ");
        super.moveForward();
    }
    
    @Override
    public void moveBackward() {
        System.out.print("I am a cat. ");
        super.moveBackward();
    }
    
}
