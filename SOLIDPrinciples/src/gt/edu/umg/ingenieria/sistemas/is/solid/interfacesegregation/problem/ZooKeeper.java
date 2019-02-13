package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class ZooKeeper {
    
    public static void makeAnimalWalk(Animal animal) {
        animal.walk();
    }
    
    public static void makeAnimalSwim(Animal animal) {
        animal.swim();
    }
    
    public static void makeAnimalFly(Animal animal) {
        animal.fly();
    }
    
}
