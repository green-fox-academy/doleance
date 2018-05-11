import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;
    private List<Pirate> crew;
    private Pirate captain;

    Ship() {
        crew = new ArrayList();
        fillShip();
    }

    Ship(String name) {
        this();
        this.name = name;
    }

    public void fillShip() {
        captain = new Pirate();
        for (int i = 0; i < (int)(Math.random() * 10) + 1; i++) {
            Pirate newbie = new Pirate();
            crew.add(newbie);
        }
    }

    public void fillShip(String name, Pirate captain, List<Pirate> crew) {
        this.name = name;
        this.captain = captain;
        this.crew = crew;
    }

    public String whatsWithThisShip() {
        StringBuilder stringBuilder = new StringBuilder("Ahoy, it's the ");
        stringBuilder.append(name + ". ");
        stringBuilder.append("It's captain is ");
        stringBuilder.append(captain.name);
        stringBuilder.append(", and (s)he's drunk like ");
        stringBuilder.append(captain.rumLoad);
        stringBuilder.append(" out of 5. (S)He's ");
        stringBuilder.append(captain.state);
        stringBuilder.append(".\nI'm checking the living souls in this shithole. Hm, it's ");

        int[] crewState = crewState();

        stringBuilder.append(crewState[0]);
        stringBuilder.append(". But some of'em are drunk as hell. We can use ");
        stringBuilder.append(crewState[1] + ".\n");

        return stringBuilder.toString();
    }

    private int[] crewState() {
        int livingRats = 0;
        int useFools = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).state != "dead") {
                livingRats++;
                if (crew.get(i).state == "awake") {
                    useFools++;
                }
            }
        }
        int[] whazzap = {livingRats, useFools};
        return whazzap;
    }

    public boolean battleShip(Ship enemy) {
        int miScore = this.crewState()[0] - this.captain.rumLoad;
        int dogsScore = (enemy.crewState()[0] - enemy.captain.rumLoad);
        if (miScore > dogsScore) {
            enemy.someDead();
            this.someParty();
            return true;
        } else {
            this.someDead();
            enemy.someParty();
            return false;
        }
    }

    public void someDead() {
        int toKill = (int)(Math.random() * crewState()[1]);
        int i = 0;
        while (toKill > 0) {
            if (crew.get(i).state != "dead") {
                crew.get(i).state = "dead";
                toKill--;
            }
            i++;
        }
    }

    public void someParty() {
        int roundPaid = (int)(Math.random() * 6);
        for ( Pirate pirate : crew) {
            pirate.drinkSomeRum();
        }
        captain.drinkSomeRum();
    }

}
