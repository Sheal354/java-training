public class Hat extends Cloathes{
    Hat() {
        setName("Hat");
        setSlot("head");
    }
    @Override
    void newUser(Creature user2) {
        if(user != null) {
            user.head = null;
        }
        this.user = user2;
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
}
