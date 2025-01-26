public class EggSandwitchBuilder implements Builder{

          private Sandwitch sandwitch=new Sandwitch();
          @Override
          public void buildBread(){
                    sandwitch.setBread("toasted bread");

          }
          @Override
          public void buildFilling(){
                    sandwitch.setFilling("fried egg");

          }
          @Override
          public void buildSpread(){
                    sandwitch.setSpread("sauce");

          }
          @Override
          public Sandwitch getSandwitch(){
                    return sandwitch;
          }

          
}
