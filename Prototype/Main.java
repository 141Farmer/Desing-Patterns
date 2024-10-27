public class Main {
    public static void main(String[] args) {

        Shape circlePrototype=new Circle("red");

        circlePrototype.draw();
      
        ShapeClient client=new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();
      
        redCircle.draw();
    }     
}