public class Main {
    public static void main(String[] args) {
        Runnable task=()->{
            AbstractFactory abstractFactory;

            abstractFactory=AbstractFactorySofa.getInstance();
            FurnitureModern modernSofa=abstractFactory.createProductModern();
            modernSofa.modernMethod();

            FurnitureRustic rusticSofa=abstractFactory.createProductRustic();
            rusticSofa.rusticMethod();

            FurnitureVictorian VictorianSofa=abstractFactory.createProductVictorian();
            VictorianSofa.victorianMethod();

            abstractFactory=AbstractFactoryTable.getInstance();
            FurnitureModern modernTable=abstractFactory.createProductModern();
            modernTable.modernMethod();

            FurnitureRustic rusticTable=abstractFactory.createProductRustic();
            rusticTable.rusticMethod();

            FurnitureVictorian VictorianTable=abstractFactory.createProductVictorian();
            VictorianTable.victorianMethod();

            abstractFactory=AbstractFactoryChair.getInstance();
            FurnitureModern modernChair=abstractFactory.createProductModern();
            modernChair.modernMethod();

            FurnitureRustic rusticChair=abstractFactory.createProductRustic();
            rusticChair.rusticMethod();

            FurnitureVictorian VictorianChair=abstractFactory.createProductVictorian();
            VictorianChair.victorianMethod();
        };

       
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        //thread3.start();
        

        
    }
}
