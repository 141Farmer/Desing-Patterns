public class Single {
          private static Single instance=null;
          int data=0;
          private Single(){
                    System.out.println("This is instance");

          }


          public static Single initiate(){
                    if(instance==null){
                              instance=new Single();
                    }
                    return instance;
          }

          public void dataUpdate(){
                    System.out.println(data);
                    ++data;
          }
}
