public class Main {
          public static void main(String[] args) {
                    AbstractFactory abstractFactory;

                    abstractFactory=new ConcreteFactory1();
                    AbstractProductA abstractProductA1=abstractFactory.createProductA();
                    abstractProductA1.methodA();
                    AbstractProductB abstractProductB1=abstractFactory.createProductB();
                    abstractProductB1.methodB();

                    abstractFactory=new ConcreteFactory2();
                    AbstractProductA abstractProductA2=abstractFactory.createProductA();
                    abstractProductA2.methodA();
                    AbstractProductB abstractProductB2=abstractFactory.createProductB();
                    abstractProductB2.methodB();
          }
          
}
