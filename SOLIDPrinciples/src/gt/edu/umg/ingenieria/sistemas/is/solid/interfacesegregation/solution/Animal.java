package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution;

public class Animal implements BreatheAction {

    @Override
    public void breathe() {    
        System.out.println("I am breathing!!!");
    }
    
}
