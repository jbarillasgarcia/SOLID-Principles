package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.solution;

public class Animal implements BreatheAction {

    @Override
    public void breathe() {    
        System.out.println("I am breathing!!!");
    }
    
}
