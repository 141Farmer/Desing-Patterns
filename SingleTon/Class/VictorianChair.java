public class VictorianChair extends FurnitureVictorian{
    
    private int id;
    public VictorianChair(int id){
        this.id=id;
    }
    
    @Override
    public void victorianMethod(){
        System.err.println("Victorian Chair "+this.id);
    }
    
}
