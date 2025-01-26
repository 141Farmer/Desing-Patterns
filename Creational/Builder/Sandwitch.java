public class Sandwitch {
          private String bread;
          private String filling;
          private String spread;

          public void setBread(String bread) {
                    this.bread = bread;
          }

          public void setFilling(String filling) {
                    this.filling = filling;
          }

          public void setSpread(String spread) {
                    this.spread = spread;
          }

          public void showSandwitch(){
                    System.out.println(this.bread+" "+this.filling+" "+this.spread);
          }
          
}
