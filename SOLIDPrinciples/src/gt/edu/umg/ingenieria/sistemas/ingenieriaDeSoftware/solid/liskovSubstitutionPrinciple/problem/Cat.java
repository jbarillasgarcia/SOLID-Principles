package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.liskovSubstitutionPrinciple.problem;

public class Cat extends Animal {
    
    @Override
    public void walkForward() {
        System.out.println("I am a cat and I am walking forward with my four feet!!!");
    }
    
    @Override
    public void walkBackward() {
        System.out.println("I am a cat and I am walking backward with my four feet!!!");
    }
    
}
