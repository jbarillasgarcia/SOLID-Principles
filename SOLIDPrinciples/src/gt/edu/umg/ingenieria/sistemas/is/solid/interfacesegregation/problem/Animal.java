package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class Animal implements AnimalActions {

    @Override
    public void breathe() {
        System.out.println("I am breathing!!!");
    }   
    
    @Override
    public void walk() throws Exception {
        System.out.println("I am walking!!!");
    }

    @Override
    public void swim() throws Exception {
        System.out.println("I am swimming!!!");
    }

    @Override
    public void fly() throws Exception {
        System.out.println("I am flying!!!");
    }
    
}
