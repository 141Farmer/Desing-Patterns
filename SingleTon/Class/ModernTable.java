public class ModernTable extends FurnitureModern{
    private int id;
    public ModernTable(int id){
        this.id=id;
    }
    
    @Override
    public void modernMethod(){
        System.err.println("Modern Table "+this.id);
    }
    
}
