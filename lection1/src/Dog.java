public class Dog extends Creature implements Tamable{
    Dog() {
        this.name = "Dog";
    }

    public void giveName(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return "Bark!";
    }

    @Override
    void putOn(Cloathes cloathes) {
        if (cloathes.slot.equals("head")) {
            this.head = cloathes;
            cloathes.newUser(this);
        } else {
            System.out.println(name + " cant wear " + cloathes.name + "\n");
        }

    }

    @Override
    public void tame() {
        this.name = "Domestic" + name;
    }
}
