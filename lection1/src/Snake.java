public class Snake extends Creature{

    Snake() {
        setName("Snake");
    }

    @Override
    String makeSound() {
        return "Shhhh!";
    }

    @Override
    void putOn(Cloathes cloathes) {
        System.out.println("Snake cant wear anything!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
