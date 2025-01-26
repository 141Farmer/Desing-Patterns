

public class Printer{

          private int num;
          public Printer(int num){
                    this.num=num;
          }

          public void getNum(){
                    System.out.println("printer number: "+this.num);
          }

          public void print(String data){
                    System.out.println("Printing: "+data);
          }
          
}
