public class Main {
          public static void main(String[] args) {
                    
                    File file1=new File("FILE1","abc def gh");
                    File file2=new File("FILE2","ijk lmn opq rst");
                    File file3=new File("FILE3","uvw xyz");

                    Folder folder1=new Folder("FOLDER1");
                    folder1.addFile(file1);
                    folder1.addFile(file2);

                    System.out.println(folder1.search("abc"));
                    

                    System.out.println(folder1.search("abcd"));

                    System.out.println(file3.search("uvw"));



          }
          
}
