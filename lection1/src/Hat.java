public class Hat extends Cloathes{
    Hat() {
        this.name = "Hat";
        this.slot = "head";
    }
    @Override
    void newUser(Creature user2) {
        if(user != null) {
            user.head = null;
        }
        this.user = user2;
    }
}
