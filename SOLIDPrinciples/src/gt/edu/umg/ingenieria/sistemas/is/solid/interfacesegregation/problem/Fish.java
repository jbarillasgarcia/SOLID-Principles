package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class Fish extends Animal {
    
    @Override
    public void walk() throws Exception {
        throw new Exception("I am a fish and I cannot walk!!!");
    }
    
    @Override
    public void swim() {
        System.out.println("I am a fish and I am swimming.");
        
    }
    
    @Override
    public void fly() throws Exception {
        throw new Exception("I am a fish and I cannot fly!!!");
    }
    
}
