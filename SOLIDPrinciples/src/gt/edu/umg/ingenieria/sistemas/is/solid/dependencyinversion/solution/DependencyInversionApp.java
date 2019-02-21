package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversionApp {
    
    public static void main(String[] args) {
        List<Move> animals = new ArrayList<>();
        
        // The dogs
        Dog fido = new Dog("Fido");
        Dog firulais = new Dog("Firulais");
        Dog toto = new Dog("Toto");
        
        // The rabbits
        Rabbit bugsBunny = new Rabbit("Bugs Bunny");
        Rabbit rogerRabbit = new Rabbit("Roger Rabbit");
        
        // Adding the dogs to my list
        animals.add(fido);
        animals.add(firulais);
        animals.add(toto);
        
        // Adding the rabbits to my list
        animals.add(bugsBunny);
        animals.add(rogerRabbit);
        
        // Giving the list to my zookeeper
        ZooKeeper zooKeeper = new ZooKeeper(animals);
        
        // Asking the zookeeper to make the animals move
        zooKeeper.moveAnimals();
    }
    
}
