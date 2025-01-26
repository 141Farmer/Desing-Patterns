import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

          private String foldername;
          public Folder(String foldername)
          {
                    this.foldername=foldername;

          }
          private List<File> files=new ArrayList<File>();

          public void addFile(File file){
                    files.add(file);
          }

          @Override
          public String search(String key){
                    for(File file: files){
                              if(file.search(key)!=null){
                                        return foldername+"/"+file.search(key);
                              }
                    }
                    return null;
          }
          
}
