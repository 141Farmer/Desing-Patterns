public class ChickenSandwitchBuilder implements Builder{
    private Sandwitch sandwitch=new Sandwitch();

    @Override
    public void buildBread(){
        sandwitch.setBread("Regular Bread");
    }

    @Override
    public void buildFilling(){
        sandwitch.setFilling("Grilled Chicken");
    }

    @Override
    public void buildAccompaniment(){
        sandwitch.setAccompaniment("Cheese");
    }

    @Override
    public Sandwitch getSandwitch(){
        return sandwitch;
    }
    
}
