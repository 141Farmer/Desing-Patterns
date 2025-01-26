public class PrinterClassAdapter extends OldPrinter implements NewPrinter {

          @Override 
          public void print(String doc){
                    this.oldprint(doc);
          }
          
}
