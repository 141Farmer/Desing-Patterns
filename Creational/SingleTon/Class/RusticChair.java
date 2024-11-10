public class RusticChair extends FurnitureRustic{
    
    private int id;
    public RusticChair(int id){
        this.id=id;
    }
    
    @Override
    public void rusticMethod(){
        System.err.println("Rustic Chair "+this.id);
    }
    
}
