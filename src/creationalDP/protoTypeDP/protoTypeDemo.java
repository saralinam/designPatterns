package creationalDP.protoTypeDP;

public class protoTypeDemo {
    public static void main(String[] args) {

        //created soldier which is ready for fight
        Soldier availableSoldier = new Soldier(100, 45, 20,
                50, 60, 5, "Sward", true);
        availableSoldier.showSoldierInfo();

        Soldier notAvailableSoldier = new Soldier(100, 45, 20,
                50, 60, 5, "Sward", false);
        notAvailableSoldier.showSoldierInfo();

        //to clone the prototype class
        Soldier notAvailableSoldier2 =  availableSoldier.clone();
        notAvailableSoldier2.setAvailableToFight(false);
        notAvailableSoldier2.setWeapon("Gun");
        notAvailableSoldier2.showSoldierInfo();

    }
}