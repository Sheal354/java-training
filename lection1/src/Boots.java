public class Boots extends Cloathes{
    Boots() {
        setName("Boots");
        setSlot("feet");
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
    public String getSlot() {
        return this.slot;
    }
    @Override
    public void setSlot(String slot) {
        this.slot = slot;
    }

    @Override
    void newUser(Creature user2) {
        if(user != null) {
            user.feet = null;
        }
        this.user = user2;
    }
}
