public class ChickenSandwitchBuilder implements Builder{

          private Sandwitch sandwitch=new Sandwitch();

          @Override
          public void buildBread(){
                    sandwitch.setBread("regular bread");

          }


          @Override
          public void buildFilling(){
                    sandwitch.setFilling("grilled chicken");

          }

          @Override
          public void buildSpread(){
                    sandwitch.setSpread("cheese");

          }
          
          @Override
          public Sandwitch getSandwitch(){
                    return sandwitch;
          }

          
}
