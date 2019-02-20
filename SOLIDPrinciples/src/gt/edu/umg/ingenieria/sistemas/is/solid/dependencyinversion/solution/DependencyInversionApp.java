package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversionApp {
    
    public static void main(String[] args) {
        List<Move> animals = new ArrayList<>();
        
        animals.add(new Dog());
        animals.add(new Rabbit());
        
        ZooKeeper zooKeeper = new ZooKeeper(animals);
        
        zooKeeper.moveAnimals();
    }
    
}
