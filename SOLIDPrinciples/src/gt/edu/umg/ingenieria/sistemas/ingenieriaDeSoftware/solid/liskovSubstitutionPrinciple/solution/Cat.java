package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.liskovSubstitutionPrinciple.solution;

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
