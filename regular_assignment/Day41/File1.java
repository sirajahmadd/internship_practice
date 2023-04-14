import java.io.FileWriter;
class File1{
  public static void main(String args[]){
    
    try{
      FileWriter fw=new FileWriter("abc.txt");
      fw.write("hi good morning");
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}