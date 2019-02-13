package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.solution;

public class InterfaceSegregationApp {
    
    public static void main(String[] args) {
        // Walk
        ZooKeeper.makeAnimalWalk(new Dog());
                
        // Swim        
        ZooKeeper.makeAnimalSwim(new Fish());        
        
        // Fly        
        ZooKeeper.makeAnimalFly(new Eagle());
    }
    
}
