package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution;

public class Dog extends Animal implements WalkAction {
        
    @Override
    public void walk() {
        System.out.println("I am a dog and I am walking!!!");        
    }
    
}
