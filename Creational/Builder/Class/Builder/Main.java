import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Builder builder=null;
        Sandwitch sandwitch;
        Director director=new Director();
        Scanner sc=new Scanner(System.in);
        

        while(true){
            
            System.out.println("1.Chicken Sandwich");
            System.out.println("2.Egg Sandwich");
            System.out.println("3.Custom Menu");
            System.out.println("4.Exit");

            int choice=sc.nextInt();

            if(choice==1){
                builder=new ChickenSandwitchBuilder();
            }
            else if(choice==2){
                builder=new EggSandwitchBuilder();
            }

            else if(choice==3){
                builder=new MenuBuilder();
            }
            else{
                break;
            }

            director.construct(builder);
            sandwitch=builder.getSandwitch();
            sandwitch.displaySandwitch();
            System.out.println();

        }

    }
    
}
