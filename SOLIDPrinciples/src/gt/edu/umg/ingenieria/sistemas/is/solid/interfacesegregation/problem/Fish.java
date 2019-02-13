package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class Fish extends Animal {
    
    @Override
    public void walk() {
        System.out.println("I am a fish and I cannot walk!!!");
    }
    
    @Override
    public void swim() {
        System.out.print("I am a fish. ");
        super.swim();
    }
    
    @Override
    public void fly() {
        System.out.println("I am a fish and I cannot fly!!!");
    }
    
}
