package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.liskovSubstitutionPrinciple.solution;

public class Dog extends AnimalWithFeet {
    
    @Override
    public void moveForward() {
        System.out.print("I am a dog. ");
        super.moveForward();
    }
    
    @Override
    public void moveBackward() {
        System.out.print("I am a dog. ");
        super.moveBackward();
    }
    
}
