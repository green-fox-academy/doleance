public class MainAaarrr {
    public static void main(String[] args) {

        Pirate glassEyeJohnny = new Pirate("Glass Eyed Johnny");
        Pirate hook = new Pirate("Captain Hook");

        for (int i = 0; i < 6; i++) {
            hook.howsItGoingMate();
        }
        hook.drinkSomeRum();
        hook.wakey();
        hook.brawl(glassEyeJohnny);
        hook.howsItGoingMate();
        glassEyeJohnny.howsItGoingMate();

    }
}
