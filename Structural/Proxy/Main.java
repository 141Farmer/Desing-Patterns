import java.util.Scanner;

public class Main {

          public static void main(String[] args) {
                    Image image1=new ProxyImage("file1.jpg");
                    Image image2=new ProxyImage("file2.jpg");
                    Image image3=new ProxyImage("file3.jpg");
                    Image image4=new ProxyImage("file4.jpg");

                    image1.displayFile();
                    image2.displayFile();
                    image3.displayFile();
                    image4.displayFile();

                    System.out.println("Select filename");

                    while(true){
                              Scanner sc=new Scanner(System.in);
                              String file=sc.nextLine();

                              (new ProxyImage(file)).display();
                    }
          }
}