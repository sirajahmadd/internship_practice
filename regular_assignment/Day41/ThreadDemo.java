class Example extends Thread{
  public void run(){
    System.out.println("running");
  }
}
class ThreadDemo{
  public static void main(String args[]){
    Example e=new Example();
    e.start();
  }
}