public class AbstractFactorySofa extends AbstractFactory {
    @Override
    public FurnitureModern createProductModern(){
        return new ModernSofa(); 
    }
    @Override
    public FurnitureRustic createProductRustic(){
        return new RusticSofa();
    }
    @Override
    public FurnitureVictorian createProductVictorian(){
        return new VictorianSofa();
    }

    
}
