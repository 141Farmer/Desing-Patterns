public class Main{
          public static void main(String[] args) {

                    AggressiveStrategy aggressiveStrategy=new AggressiveStrategy();
                    DefensiveStrategy defensiveStrategy=new DefensiveStrategy();
                    NormalStrategy normalStrategy=new NormalStrategy();

                    Robot robot1=new Robot(normalStrategy);
                    robot1.interact();

                    Robot robot2=new Robot(defensiveStrategy);
                    robot2.interact();

                    Robot robot3=new Robot(aggressiveStrategy);
                    robot3.interact();

                    robot1.setBehaviorStrategy(defensiveStrategy);
                    robot1.interact();

                    
          }

}