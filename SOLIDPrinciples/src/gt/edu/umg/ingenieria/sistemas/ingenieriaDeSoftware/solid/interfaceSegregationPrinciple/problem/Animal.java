package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.problem;

public class Animal implements AnimalActions {

    @Override
    public void breathe() {
        System.out.println("I am breathing!!!");
    }   
    
    @Override
    public void walk() {
        System.out.println("I am walking!!!");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming!!!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!!!");
    }
    
}
