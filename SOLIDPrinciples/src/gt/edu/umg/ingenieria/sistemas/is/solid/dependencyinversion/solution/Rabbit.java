package gt.edu.umg.ingenieria.sistemas.is.solid.dependencyinversion.solution;

public class Rabbit implements Move {

    @Override
    public void move() {
        this.jump();
    }
    
    private void jump() {
        System.out.println("I am a rabbit and I am jumping.");
    }
    
}
