package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class Dog extends Animal {
    
    @Override
    public void walk() {
        System.out.println("I am a dog and I am walking.");        
    }
    
    @Override
    public void swim() throws Exception {
        throw new Exception("I am a dog and I cannot swim!!!");
    }
    
    @Override
    public void fly() throws Exception {
        throw new Exception("I am a dog and I cannot fly!!!");
    }
    
}
