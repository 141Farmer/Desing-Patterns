public class VictorianTable extends FurnitureVictorian{
    
    private int id;
    public VictorianTable(int id){
        this.id=id;
    }
    
    @Override
    public void victorianMethod(){
        System.err.println("Victorian Table "+this.id);
    }
    
}
