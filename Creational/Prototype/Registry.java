
import java.util.HashMap;
import java.util.Map;
public class Registry {

          private Map<String,Products> protoype=new HashMap<>();

          public void addPrototype(String key, Products products){
                    protoype.put(key,products);
          }

          public Products getPrototype(String key){
                    Products products=protoype.get(key);
                    if(products==null){
                              System.out.println("Entry not found");
                    }
                    return products.clone();

          }

                    
          
          
}
