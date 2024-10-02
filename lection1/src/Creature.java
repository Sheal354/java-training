public abstract class Creature {
    String name;
    Cloathes head = null;
    Cloathes torso = null;
    Cloathes feet = null;
    abstract String makeSound();
    abstract void putOn(Cloathes cloathes);

    public String checkHead() {
        if(head != null) {
            return name + " wears a " + head.name + " on the head\n";
        } else {
            return name + " doesnt wear anything on the head\n";
        }
    }

    public String checkTorso() {
        if(torso != null) {
            return name + " wears a " + torso.name + " on the torso\n";
        } else {
            return name + " doesnt wear anything on the torso\n";
        }
    }

    public String checkFeet() {
        if(feet != null) {
            return name + " wears a " + feet.name + " on the feet\n";
        } else {
            return name + " doesnt wear anything on the feet\n";
        }
    }

    public String cloathesCheck() {
        return name + " is wearing:\n" + checkHead() + checkTorso() + checkFeet();
    }


}
