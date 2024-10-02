public class Dog extends Creature implements Tamable{
    Dog() {
        setName("Dog");
    }

    @Override
    String makeSound() {
        return "Bark!";
    }

    @Override
    void putOn(Cloathes cloathes) {
        if (cloathes.getSlot().equals("head")) {
            this.head = cloathes;
            cloathes.newUser(this);
        } else {
            System.out.println(this.getName() + " cant wear " + cloathes.getName() + "\n");
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

    @Override
    public void tame() {
        this.setName("Domestic" + this.getName());
    }
}
