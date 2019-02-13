package gt.edu.umg.ingenieria.sistemas.is.solid.liskovsubstitution.solution;

public class AnimalsApp {

    public static void main(String[] args) throws Exception {
        ZooKeeper.makeAnimalMoveForward(new Dog());
        ZooKeeper.makeAnimalMoveBackward(new Cat());        
        ZooKeeper.makeAnimalMoveForward(new Snake());
        ZooKeeper.makeAnimalMoveBackward(new Fish());
    }
    
}
