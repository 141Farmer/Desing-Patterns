
public class Main
{
    public static void main (String[] args)
    {
        HotelKeeper keeper=new HotelKeeperImplementation();

        VegMenu vegMenu=keeper.getVegMenu();
        vegMenu.printMenu();

        NonVegMenu nonVegMenu=keeper.getNonVegMenu();
        nonVegMenu.printMenu();
    }
}