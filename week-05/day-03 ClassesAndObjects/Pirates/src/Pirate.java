public class Pirate {

    String name;
    int rumLoad;
    String state;  //awake, dozedoff, dead

    Pirate() {
        state = "awake";
    }

    Pirate(String name) {
        this();
        this.name = name;
    }

    public void drinkSomeRum() {
        if (state == "dead") {
            dead();
        } else if (state == "dozedoff") {
            dozedoff();
        } else if (rumLoad < 5) {
            rumLoad++;
        } else {
            rumLoad = 0;
            dozedoff();
        }
    }

    public void howsItGoingMate () {
        if (state == "dead") {
            dead();
        } else if (state == "dozedoff") {
            dozedoff();
        } else {
            if (rumLoad < 5) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
            drinkSomeRum();
        }
    }

    public void wakey() {
        state = "awake";
        System.out.println("I cut you in half, Im up!");
    }

    public void die() {
        state = "dead";
    }

    public void dead() {
        System.out.println("He's dead.");
    }

    public void dozedoff() {
        System.out.println("Lemme...grmmhh...zZzZzzZz...");
    }

    public String brawl (Pirate mate) {
        int whoDies = (int)(Math.random() * 3);
        switch (whoDies) {
            case 0 : this.die(); return "Mi ded.";
            case 1 : mate.die(); return "He ded.";
            case 2 : this.state = "dozedoff"; mate.state = "dozedoff"; return "*%!$#zzZzzZzZzZ";
        }
        return null;
    }

}
