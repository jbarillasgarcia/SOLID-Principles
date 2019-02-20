package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

import java.util.List;

public class ZooKeeper {

    private List<Move> animals;

    public ZooKeeper(List<Move> animals) {
        this.animals = animals;
    }
    
    public void moveAnimals() {
        for (Move animal : this.animals) {
            animal.move();
        }
    }
    
}
