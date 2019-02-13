package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.solution;

public class Eagle extends Animal implements FlyAction {
    
    @Override
    public void fly() {
        System.out.println("I am an eagle and I am flying!!!");        
    }
    
}
