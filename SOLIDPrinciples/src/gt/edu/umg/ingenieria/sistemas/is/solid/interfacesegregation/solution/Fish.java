package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution;

public class Fish extends Animal implements SwimAction {
    
    @Override
    public void swim() {
        System.out.println("I am a fish and I am swimming!!!");
    }    
    
}
