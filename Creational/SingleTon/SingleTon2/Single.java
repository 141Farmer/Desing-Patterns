
import java.util.Map;
import java.util.HashMap;
public class Single {
          private static int printerNum=1;
          private static Printer instance;
          private static Map<String, Printer>registry=new HashMap<String, Printer>();

          public static Printer initiate(String department){
                    if(registry.get(department)==null){
                              instance=new Printer(++printerNum);
                              registry.put(department,instance);
                    }
                    return registry.get(department);
          }

          
}
