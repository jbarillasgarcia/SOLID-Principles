package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.liskovSubstitutionPrinciple.problem;

public class Snake extends Animal {
    
    @Override
    public void walkForward() throws Exception {
        throw new Exception("I am a snake and I cannot walk since I don't have any feet =(");
    }
    
    @Override
    public void walkBackward() throws Exception {
        throw new Exception("I am a snake and I cannot walk since I don't have any feet =(");
    }
    
}
