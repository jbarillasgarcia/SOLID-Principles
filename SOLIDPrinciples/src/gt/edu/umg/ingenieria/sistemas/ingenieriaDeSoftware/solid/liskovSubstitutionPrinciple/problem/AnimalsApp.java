package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.liskovSubstitutionPrinciple.problem;

public class AnimalsApp {

    public static void main(String[] args) throws Exception {
        ZooKeeper.makeAnimalWalkForward(new Dog());        
        ZooKeeper.makeAnimalWalkBackward(new Cat());        
        ZooKeeper.makeAnimalWalkForward(new Snake());        
        ZooKeeper.makeAnimalWalkBackward(new Fish());
    }
    
}
