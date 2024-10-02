public class Boots extends Cloathes{
    Boots() {
        this.name = "Boots";
        this.slot = "feet";
    }

    @Override
    void newUser(Creature user2) {
        if(user != null) {
            user.feet = null;
        }
        this.user = user2;
    }
}
