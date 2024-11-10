public class AbstractFactoryTable extends AbstractFactory{

    private int idCounter=1;
    private static AbstractFactoryTable instance = null;

    private AbstractFactoryTable() {}

    public static AbstractFactoryTable getInstance() {
        if (instance == null) {
            synchronized (AbstractFactoryTable.class) {
                instance = new AbstractFactoryTable();
                
            }
        }
        return instance;
    }


    @Override
    public FurnitureModern createProductModern(){
        return new ModernTable(idCounter++); 
    }
    @Override
    public FurnitureRustic createProductRustic(){
        return new RusticTable(idCounter++);
    }
    @Override
    public FurnitureVictorian createProductVictorian(){
        return new VictorianTable(idCounter++);
    }

    
}
