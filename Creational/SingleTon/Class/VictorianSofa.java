public class VictorianSofa extends FurnitureVictorian{
    
    private int id;
    public VictorianSofa(int id){
        this.id=id;
    }
    
    @Override
    public void victorianMethod(){
        System.err.println("Victorian Sofa "+this.id);
    }
    
}
