

public class VegRestaurant implements Hotel {

        public Menu getMenu(){
            return new VegMenu();
        }
}