public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory=new AbstractFactorySofa();

        FurnitureModern modernSofa=abstractFactory.createProductModern();
        modernSofa.modernMethod();

        FurnitureRustic rusticSofa=abstractFactory.createProductRustic();
        rusticSofa.rusticMethod();

        FurnitureVictorian VictorianSofa=abstractFactory.createProductVictorian();
        VictorianSofa.victorianMethod();

        abstractFactory=new AbstractFactoryTable();

        FurnitureModern modernTable=abstractFactory.createProductModern();
        modernTable.modernMethod();

        FurnitureRustic rusticTable=abstractFactory.createProductRustic();
        rusticTable.rusticMethod();

        FurnitureVictorian VictorianTable=abstractFactory.createProductVictorian();
        VictorianTable.victorianMethod();

        abstractFactory=new AbstractFactoryChair();
        
        FurnitureModern modernChair=abstractFactory.createProductModern();
        modernChair.modernMethod();

        FurnitureRustic rusticChair=abstractFactory.createProductRustic();
        rusticChair.rusticMethod();

        FurnitureVictorian VictorianChair=abstractFactory.createProductVictorian();
        VictorianChair.victorianMethod();
        
        
        
    }
    
}
