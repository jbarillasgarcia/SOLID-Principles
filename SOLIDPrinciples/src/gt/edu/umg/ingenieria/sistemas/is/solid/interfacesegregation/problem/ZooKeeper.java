package gt.edu.umg.ingenieria.sistemas.is.solid.interfacesegregation.problem;

public class ZooKeeper {
    
    public static void makeAnimalWalk(Animal animal) throws Exception {
        animal.walk();
    }
    
    public static void makeAnimalSwim(Animal animal) throws Exception {
        animal.swim();
    }
    
    public static void makeAnimalFly(Animal animal) throws Exception {
        animal.fly();
    }
    
}
