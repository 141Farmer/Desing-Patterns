public class RusticTable extends FurnitureRustic{
    
    private int id;
    public RusticTable(int id){
        this.id=id;
    }
    
    @Override
    public void rusticMethod(){
        System.err.println("Rustic Table "+this.id);
    }
    
}
