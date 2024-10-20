public class AbstractFactoryChair extends AbstractFactory {
    @Override
    public FurnitureModern createProductModern(){
        return new ModernChair(); 
    }
    @Override
    public FurnitureRustic createProductRustic(){
        return new RusticChair();
    }
    @Override
    public FurnitureVictorian createProductVictorian(){
        return new VictorianChair();
    }

    
}
