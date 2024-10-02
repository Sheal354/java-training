public class Human extends Creature{
    Human(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return "Hello, my name is " + name + "\n";
    }

    public void putOn(Cloathes cloathes) {
        switch (cloathes.slot) {
            case "head" -> {
                this.head = cloathes;
                cloathes.newUser(this);
            }
            case "torso" -> {
                this.torso = cloathes;
                cloathes.newUser(this);
            }
            case "feet" -> {
                this.feet = cloathes;
                cloathes.newUser(this);
            }
        }
    }
}
