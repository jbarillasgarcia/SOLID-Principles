package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.problem;

public class ZooKeeper {
    
    public static void makeAnimalWalkForward(Animal animal) throws Exception {
        animal.walkForward();
    }
    
    public static void makeAnimalWalkBackward(Animal animal) throws Exception {
        animal.walkBackward();
    }
    
}
