package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.problem;

public class Dog extends Animal {
    
    @Override
    public void walk() {
        System.out.print("I am a dog. ");
        super.walk();
    }
    
    @Override
    public void swim() {
        System.out.println("I am a dog and I cannot swim!!!");
    }
    
    @Override
    public void fly() {
        System.out.println("I am a dog and I cannot fly!!!");
    }
    
}
