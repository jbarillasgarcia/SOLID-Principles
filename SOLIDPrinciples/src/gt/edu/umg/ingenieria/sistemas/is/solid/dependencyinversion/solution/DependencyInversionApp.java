package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversionApp {
    
    public static void main(String[] args) {
        List<Move> animals = new ArrayList<>();
        
        Dog fido = new Dog("Fido");
        Dog firulais = new Dog("Firulais");
        Dog toto = new Dog("Toto");
        Rabbit bugsBunny = new Rabbit("Bugs Bunny");
        
        animals.add(fido);
        animals.add(firulais);
        animals.add(toto);
        animals.add(bugsBunny);
        
        ZooKeeper zooKeeper = new ZooKeeper(animals);
        
        zooKeeper.moveAnimals();
    }
    
}
