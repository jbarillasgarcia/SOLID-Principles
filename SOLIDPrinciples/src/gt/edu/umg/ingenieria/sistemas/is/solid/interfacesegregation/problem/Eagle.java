package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class Eagle extends Animal {
    
    @Override
    public void walk() throws Exception {
        throw new Exception("I am an eagle and I cannot walk!!!");
    }
    
    @Override
    public void swim() throws Exception {
        throw new Exception("I am an eagle and I cannot swim!!!");
    }
    
    @Override
    public void fly() {
        System.out.println("I am an eagle and I am flying.");        
    }
    
}
