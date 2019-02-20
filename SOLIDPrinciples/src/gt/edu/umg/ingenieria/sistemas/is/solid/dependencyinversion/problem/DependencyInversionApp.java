package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.problem;

public class DependencyInversionApp {
    
    public static void main(String[] args) {
        
        ZooKeeper zooKeeper = new ZooKeeper();
        
        zooKeeper.moveAnimals();
    }
    
}
