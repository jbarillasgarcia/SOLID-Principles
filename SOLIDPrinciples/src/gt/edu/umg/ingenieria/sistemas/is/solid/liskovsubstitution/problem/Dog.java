package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.problem;

public class Dog extends Animal {
    
    @Override
    public void walkForward() {
        System.out.println("I am a dog and I am walking forward with my four feet!!!");
    }
    
    @Override
    public void walkBackward() {
        System.out.println("I am a dog and I am walking backward with my four feet!!!");
    }
    
}
