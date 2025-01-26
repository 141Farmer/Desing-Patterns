public class PrinterObjectAdapter implements NewPrinter{
          private OldPrinter printer=new OldPrinter();

          @Override
          public void print(String doc){
                    printer.oldprint(doc);
          }

          
}
