package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.liskovSubstitutionPrinciple.solution;

public class ZooKeeper {
    
    public static void makeAnimalMoveForward(Animal animal) throws Exception {
        animal.moveForward();
    }
    
    public static void makeAnimalMoveBackward(Animal animal) throws Exception {
        animal.moveBackward();
    }
    
}
