public abstract class Cloathes {
    Creature user = null;
    String name;
    String slot;
    abstract void newUser(Creature user);

    String getUser() {
        if(user != null) {
            return "This " + name + " is worn by " + user.name;
        }
        else {
            return "No one wear " + name;
        }
    }
}
