public class Snake extends Creature{

    Snake() {
        this.name = "Snake";
    }

    @Override
    String makeSound() {
        return "Shhhh!";
    }

    @Override
    void putOn(Cloathes cloathes) {
        System.out.println("Snake cant wear anything!");
    }
}
