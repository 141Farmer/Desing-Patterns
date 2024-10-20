public class RusticSofa extends FurnitureRustic{
    
    private int id;
    public RusticSofa(int id){
        this.id=id;
    }
    
    @Override
    public void rusticMethod(){
        System.err.println("Rustic Sofa "+this.id);
    }
    
}
