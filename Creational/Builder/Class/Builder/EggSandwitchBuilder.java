public class EggSandwitchBuilder implements Builder{
    private Sandwitch sandwitch=new Sandwitch();

    @Override
    public void buildBread(){
        sandwitch.setBread("Toasted Bread");
    }

    @Override
    public void buildFilling(){
        sandwitch.setFilling("Fried Egg");
    }

    @Override
    public void buildAccompaniment(){
        sandwitch.setAccompaniment("Sauce");
    }

    @Override
    public Sandwitch getSandwitch(){
        return sandwitch;
    }
    
}


