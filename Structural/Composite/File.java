public class File implements FileSystem{

          private String filename;
          private String contents;

          public File(String filename,String contents)
          {
                    this.filename=filename;
                    this.contents=contents;
          }

          @Override
          public String search(String key){
                    if(contents.contains(key)){
                              return filename;
                    }
                    return null;
          }
          
}
