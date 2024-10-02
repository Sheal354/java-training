public abstract class Cloathes {
    public Creature user = null;
    protected String name;
    protected String slot;
    abstract void newUser(Creature user);

    String getUser() {
        if(user != null) {
            return "This " + name + " is worn by " + user.getName();
        }
        else {
            return "No one wear " + name;
        }
    }

    public abstract String getName();
    public abstract void setName(String name);

    public abstract String getSlot();
    public abstract void setSlot(String slot);

}
