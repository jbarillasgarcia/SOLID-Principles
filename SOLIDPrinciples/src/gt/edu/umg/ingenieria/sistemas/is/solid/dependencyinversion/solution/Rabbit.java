package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

public class Rabbit implements Move {
    
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }
    
    @Override
    public void move() {
        this.jump();
    }
    
    private void jump() {
        System.out.println(String.format("I am %s and I am jumping.", this.name));
    }
    
}
