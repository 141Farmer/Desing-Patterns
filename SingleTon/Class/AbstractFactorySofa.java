public class AbstractFactorySofa extends AbstractFactory {
    private int idCounter=1;
    private static AbstractFactorySofa instance=null;
    private AbstractFactorySofa() {}

    public static AbstractFactorySofa getInstance() {
        if (instance == null) {
            synchronized (AbstractFactorySofa.class) {
                instance = new AbstractFactorySofa();
                
            }
        }
        return instance;
    }

    @Override
    public FurnitureModern createProductModern(){
        return new ModernSofa(idCounter++); 
    }
    @Override
    public FurnitureRustic createProductRustic(){
        return new RusticSofa(idCounter++);
    }
    @Override
    public FurnitureVictorian createProductVictorian(){
        return new VictorianSofa(idCounter++);
    }

    
}
