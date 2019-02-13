package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.problem;

public class Eagle extends Animal {
    
    @Override
    public void walk() {
        System.out.println("I am an eagle and I cannot walk!!!");
    }
    
    @Override
    public void swim() {
        System.out.println("I am an eagle and I cannot swim!!!");
    }
    
    @Override
    public void fly() {
        System.out.print("I am an eagle. ");
        super.fly();
    }
    
}
