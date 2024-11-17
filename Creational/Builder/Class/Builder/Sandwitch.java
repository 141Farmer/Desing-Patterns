public class Sandwitch{
    private String bread;
    private String filling;
    private String accompaniment;

    public Sandwitch(){}

    public Sandwitch(String bread,String filling,String accompaniment){
        setBread(bread);
        setAccompaniment(accompaniment);
        setFilling(filling);
    }

    public void setBread(String bread){
        this.bread=bread;
    }

    public void setFilling(String filling){
        this.filling=filling;
    }

    public void setAccompaniment(String accompaniment){
        this.accompaniment=accompaniment;
    }

    public void displaySandwitch(){
        System.out.println("Bread: "+bread+"\nFilling: "+filling+"\nAccomapniment: "+accompaniment);
    }

}