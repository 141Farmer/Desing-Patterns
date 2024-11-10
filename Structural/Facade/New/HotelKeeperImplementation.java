

public class HotelKeeperImplementation implements HotelKeeper {

          public VegMenu getVegMenu()
          {
              VegRestaurant vegRestaurant=new VegRestaurant();
              VegMenu vegMenu=(VegMenu)vegRestaurant.getMenu();
              return vegMenu;
          }
      
          public NonVegMenu getNonVegMenu()
          {
              NonVegRestaurant nonVegRestaurant=new NonVegRestaurant();
              NonVegMenu NonvegMenu=(NonVegMenu)nonVegRestaurant.getMenu();
              return NonvegMenu;
          }     
}
