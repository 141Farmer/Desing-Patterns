public class ModernChair extends FurnitureModern{
    
    private int id;

    public ModernChair(int id){
        this.id=id;
    }

    @Override
    public void modernMethod(){
        System.err.println("Modern Chair "+this.id);
    }
    
}
