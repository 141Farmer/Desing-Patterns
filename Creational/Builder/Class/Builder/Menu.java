import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> breads= new ArrayList<>();
    private List<String> fillins= new ArrayList<>();
    private List<String> accompaniments= new ArrayList<>();

    public void addBread(String bread){
        breads.add(bread);
    }

    public void addFilling(String filling){
        fillins.add(filling);
    }

    public void addAccompaniment(String accompaniment){
        accompaniments.add(accompaniment);
    }

    public void showBread(){
        for(int i=0;i<breads.size();++i){
            System.out.println((i+1)+". "+breads.get(i));
        }
    }

    public void showFilling(){
        for(int i=0;i<fillins.size();++i){
            System.out.println((i+1)+". "+fillins.get(i));
        }
    }

    public void showAccompaniment(){
        for(int i=0;i<accompaniments.size();++i){
            System.out.println((i+1)+". "+accompaniments.get(i));
        }
    }
}
