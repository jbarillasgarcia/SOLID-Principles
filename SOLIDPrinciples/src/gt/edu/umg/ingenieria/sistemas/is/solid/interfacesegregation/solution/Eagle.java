package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution;

public class Eagle extends Animal implements FlyAction, WalkAction {
    
    @Override
    public void fly() {
        System.out.println("I am an eagle and I am flying!!!");        
    }

    @Override
    public void walk() {
        System.out.println("I am an eagle and I am walking!!!");
    }
    
}
