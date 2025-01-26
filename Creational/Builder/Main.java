import java.util.Scanner;

public class Main {

          public static void main(String[] args) {
                    Sandwitch sandwitch;
                    Builder builder;
                    Scanner sc = new Scanner(System.in);
                
                    while(true){
                              System.out.println("1. Chicken Sandwitch");
                              System.out.println("2. Egg Sandwitch");
                              System.out.println("3. Custom Sandwitch");
                              System.out.println("4. Exit");
                              int choice = sc.nextInt();
                
                              if(choice == 1){
                                        builder = new ChickenSandwitchBuilder();
                                        builder.buildBread();
                                        builder.buildFilling();
                                        builder.buildSpread();
                                        sandwitch = builder.getSandwitch();
                              }
                              else if(choice == 2){
                                        builder = new EggSandwitchBuilder();
                                        builder.buildBread();
                                        builder.buildFilling();
                                        builder.buildSpread();
                                        sandwitch = builder.getSandwitch();
                              }
                              else if(choice == 3){
                                        builder = new SandwitchBuilder();
                                        builder.buildBread();
                                        builder.buildFilling();
                                        builder.buildSpread();
                                        sandwitch = builder.getSandwitch();
                              }
                              else{
                                        break;
                              }
                              sandwitch.showSandwitch();
                    }
          }
}