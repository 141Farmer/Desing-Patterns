import java.util.Scanner;

public class SandwitchBuilder implements Builder{
          private Sandwitch sandwitch=new Sandwitch();
          @Override
          public void buildBread(){
                    System.out.println("1. Toasted bread");
                    System.out.println("2. Regular bread");
                    Scanner scn=new Scanner(System.in);
                    int choice=scn.nextInt();
                    if(choice==1)
                              sandwitch.setBread("Toasted bread");
                    
                    else 
                              sandwitch.setBread("Regular bread");
          }


          @Override
          public void buildFilling(){
                    System.out.println("1. Grilled chicken");
                    System.out.println("2. Fried egg");
                    Scanner scn=new Scanner(System.in);
                    int choice=scn.nextInt();
                    if(choice==1)
                              sandwitch.setFilling("Grilled chicken");
                    
                    else 
                              sandwitch.setFilling("Fried egg");

          }
          @Override
          public void buildSpread(){
                    System.out.println("1. Cheese");
                    System.out.println("2. Sauce");
                    Scanner scn=new Scanner(System.in);
                    int choice=scn.nextInt();
                    if(choice==1)
                              sandwitch.setSpread("Cheese");
                    
                    else 
                              sandwitch.setSpread("Sauce");

          }
          @Override
          public Sandwitch getSandwitch(){
                    return sandwitch;
          }
          
}
