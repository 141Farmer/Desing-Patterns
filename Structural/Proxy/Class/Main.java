import java.util.Scanner;
public class Main{
          public static void main(String[] args){
              String[] imageFilenames={"image1.jpg","image2.jpg","image3.jpg"};
              Image[] images=new Image[imageFilenames.length];
              for(int i=0;i<imageFilenames.length;++i){
                  images[i]=new ProxyImage(imageFilenames[i]);
              }
              for(int i=0;i<imageFilenames.length;++i){
                  System.out.println(i+1+". "+images[i].getFilename());
              }
              Scanner sc=new Scanner(System.in);
              while(true){
                    int option=sc.nextInt();
                    if(option>=1 && option<=3)
                              images[option-1].display();
                    else
                              break;
              }  
              


          }
}
      