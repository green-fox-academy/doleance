public class Main {
    public static void main(String[] args) {
        F16 wowWhatAWonderfulWeapon = new F16();
        F35 ohThisIsMuchBetter = new F35();

        wowWhatAWonderfulWeapon.refill(10);
        System.out.println(wowWhatAWonderfulWeapon.getStatus());
        System.out.println(wowWhatAWonderfulWeapon.fight());
        System.out.println(ohThisIsMuchBetter.getType());
        System.out.println(ohThisIsMuchBetter.isPriority());

        Carrier bob = new Carrier(600, 0);
        Carrier murial = new Carrier(1000, 100);
        murial.add(wowWhatAWonderfulWeapon);
        murial.add(ohThisIsMuchBetter);
        try {
            murial.fill();
            bob.fill();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(murial.getStatus());
        murial.fight(bob);
        System.out.println(murial.getStatus());
        System.out.println(bob.getStatus());

    }
}
