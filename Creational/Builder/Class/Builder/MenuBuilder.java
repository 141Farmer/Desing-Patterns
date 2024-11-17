import java.util.Scanner;

public class MenuBuilder implements Builder{
    private Sandwitch sandwitch=new Sandwitch();
    Menu menu=new Menu();
    Scanner sc=new Scanner(System.in);

    @Override
    public void buildBread(){
        menu.addBread("Regular Bread");
        menu.addBread("Toasted bread");
        menu.showBread();
        String bread=sc.nextLine();
        sandwitch.setBread(bread);
    }

    @Override
    public void buildFilling(){
        menu.addFilling("Chicken");
        menu.addFilling("Egg");
        menu.showFilling();
        String filling=sc.nextLine();
        sandwitch.setFilling(filling);
    }

    @Override
    public void buildAccompaniment(){
        menu.addAccompaniment("Cheese");
        menu.addAccompaniment("Sauce");
        menu.showAccompaniment();
        String accompaniment=sc.nextLine();
        sandwitch.setAccompaniment(accompaniment);
    }

    @Override
    public Sandwitch getSandwitch(){
        return sandwitch;
    }
    
}


