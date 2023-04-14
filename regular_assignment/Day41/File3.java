import java.io.FileOutputStream;
import java.io.FileWriter;
class File3{
  public static void main(String args[]){
    
    try{
      FileOutputStream fw=new FileOutputStream("xyz.txt");
      String str="hi hello how are you";
      byte bytes[]=str.getBytes();
      
      fw.write(bytes);
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}