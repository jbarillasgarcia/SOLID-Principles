package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class Snake extends AnimalWithoutFeet {
    
    @Override
    public void moveForward() {
        System.out.print("I am a snake. ");
        super.moveForward();
    }
    
    @Override
    public void moveBackward() {
        System.out.print("I am a snake. ");
        super.moveBackward();
    }
    
}
