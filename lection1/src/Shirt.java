public class Shirt extends Cloathes implements Ironing{
    Shirt() {
        setName("Shirt");
        setSlot("torso");
    }

    @Override
    void newUser(Creature user2) {
        if(user != null) {
            user.torso = null;
        }
        this.user = user2;
    }

    @Override
    public void ironing() {
        this.setName("IronedShirt");
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
