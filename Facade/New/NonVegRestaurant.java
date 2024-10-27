

public class NonVegRestaurant implements Hotel {

        public Menu getMenu(){
            return new NonVegMenu();
        }
}