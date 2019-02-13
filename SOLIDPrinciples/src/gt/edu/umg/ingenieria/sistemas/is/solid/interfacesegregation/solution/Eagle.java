package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution;

public class Eagle extends Animal implements FlyAction {
    
    @Override
    public void fly() {
        System.out.println("I am an eagle and I am flying!!!");        
    }
    
}
