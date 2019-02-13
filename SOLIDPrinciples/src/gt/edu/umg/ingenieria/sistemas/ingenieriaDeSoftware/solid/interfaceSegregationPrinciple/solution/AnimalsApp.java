package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.solution;

public class AnimalsApp {
    
    public static void main(String[] args) {
        // Walk
        ZooKeeper.makeAnimalWalk(new Dog());
                
        // Swim        
        ZooKeeper.makeAnimalSwim(new Fish());        
        
        // Fly        
        ZooKeeper.makeAnimalFly(new Eagle());
    }
    
}
