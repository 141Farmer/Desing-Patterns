public class ModernSofa extends FurnitureModern{
    
    private int id;
    public ModernSofa(int id){
        this.id=id;
    }
    
    @Override
    public void modernMethod(){
        System.err.println("Modern Sofa "+this.id);
    }
    
}
