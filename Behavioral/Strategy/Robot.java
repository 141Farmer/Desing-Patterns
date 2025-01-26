public class Robot {
          private String position;
          private String obstacles;

          private BehaviorStrategy behaviorStrategy;

          public Robot(BehaviorStrategy behaviorStrategy)
          {
                    this.behaviorStrategy=behaviorStrategy;
          }

          public void setBehaviorStrategy(BehaviorStrategy behaviorStrategy){
                    this.behaviorStrategy=behaviorStrategy;
          }

          public void interact(){
                    behaviorStrategy.behave();
          }

          
}
