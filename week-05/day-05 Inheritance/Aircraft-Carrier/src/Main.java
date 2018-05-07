public class Main {
    public static void main(String[] args) {
        F16 wowWhatAWonderfulWeapon = new F16();
        F35 ohThisIsMuchBetter = new F35();

        wowWhatAWonderfulWeapon.refill(10);
        System.out.println(wowWhatAWonderfulWeapon.getStatus());
        System.out.println(wowWhatAWonderfulWeapon.fight());
        System.out.println(ohThisIsMuchBetter.getType());
        System.out.println(ohThisIsMuchBetter.isPriority());

    }
}
