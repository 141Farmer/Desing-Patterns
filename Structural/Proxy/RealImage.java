public class RealImage implements Image{

          private String filename;
          public RealImage(String filename){
                    this.filename=filename;
                    loadImage();
          }

          private void loadImage(){
                    System.out.println("Loading image: "+this.filename);
          }

          @Override
          public void display(){
                    System.out.println("Displaying image "+this.filename);
          }
          
}
