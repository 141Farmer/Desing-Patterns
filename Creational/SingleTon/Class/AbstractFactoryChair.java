public class AbstractFactoryChair extends AbstractFactory{
    private static AbstractFactoryChair instance=null;
    private int idCounter=1;
    private AbstractFactoryChair() {}

    public static AbstractFactoryChair getInstance() {
        if (instance == null) {
            synchronized (AbstractFactoryChair.class) {
                instance = new AbstractFactoryChair();
                
            }
        }
        return instance;
    }
    

    @Override
    public FurnitureModern createProductModern(){
        return new ModernChair(idCounter++); 
    }
    @Override
    public FurnitureRustic createProductRustic(){
        return new RusticChair(idCounter++);
    }
    @Override
    public FurnitureVictorian createProductVictorian(){
        return new VictorianChair(idCounter++);
    }

    
}
