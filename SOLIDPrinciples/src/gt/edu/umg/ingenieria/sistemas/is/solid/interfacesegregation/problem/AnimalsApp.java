package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class AnimalsApp {
    
    public static void main(String[] args) {
        // Walk
        ZooKeeper.makeAnimalWalk(new Dog());
        ZooKeeper.makeAnimalWalk(new Fish());
        ZooKeeper.makeAnimalWalk(new Eagle());
        
        // Swim
        ZooKeeper.makeAnimalSwim(new Dog());
        ZooKeeper.makeAnimalSwim(new Fish());
        ZooKeeper.makeAnimalSwim(new Eagle());
        
        // Fly
        ZooKeeper.makeAnimalFly(new Dog());
        ZooKeeper.makeAnimalFly(new Fish());
        ZooKeeper.makeAnimalFly(new Eagle());
    }
    
}
