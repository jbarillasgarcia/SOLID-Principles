package gt.edu.umg.ingenieria.sistemas.ingenieriaDeSoftware.solid.interfaceSegregationPrinciple.solution;

public class ZooKeeper {
    
    public static void makeAnimalWalk(WalkAction animal) {
        animal.walk();
    }
    
    public static void makeAnimalSwim(SwimAction animal) {
        animal.swim();
    }
    
    public static void makeAnimalFly(FlyAction animal) {
        animal.fly();
    }
    
}
