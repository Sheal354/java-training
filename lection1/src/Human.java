public class Human extends Creature{
    Human(String name) {
        setName(name);
    }

    @Override
    String makeSound() {
        return "Hello, my name is " + this.getName() + "\n";
    }

    public void putOn(Cloathes cloathes) {
        switch (cloathes.getSlot()) {
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
