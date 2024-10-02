public class Shirt extends Cloathes implements Ironing{
    Shirt() {
        this.name = "Shirt";
        this.slot = "torso";
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
        this.name = "Ironed shirt";
    }
}
