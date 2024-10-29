public abstract class Creature {
    protected String name;
    public Cloathes head = null;
    public Cloathes torso = null;
    public Cloathes feet = null;
    private static int totalCreatures = 0;

    public Creature() {
        ++totalCreatures;
    }

    public static int getTotalCreatures() {
        return totalCreatures;
    }

    abstract String makeSound();
    abstract void putOn(Cloathes cloathes);

    public abstract String getName();
    public abstract void setName(String name);

    public String checkHead() {
        if(head != null) {
            return name + " wears a " + head.getName() + " on the head\n";
        } else {
            return name + " doesnt wear anything on the head\n";
        }
    }

    public String checkTorso() {
        if(torso != null) {
            return name + " wears a " + torso.getName() + " on the torso\n";
        } else {
            return name + " doesnt wear anything on the torso\n";
        }
    }

    public String checkFeet() {
        if(feet != null) {
            return name + " wears a " + feet.getName() + " on the feet\n";
        } else {
            return name + " doesnt wear anything on the feet\n";
        }
    }

    public String cloathesCheck() {
        return name + " is wearing:\n" + checkHead() + checkTorso() + checkFeet();
    }


}
