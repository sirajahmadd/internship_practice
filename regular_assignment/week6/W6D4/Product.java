class Product{
  private int pid;
  private float cost;
  private String name;

  //setters
  void setPid(int pid){
    this.pid=pid;
  }
  void setCost(float cost){
    this.cost=cost;
  }
  void setName(String name){
    this.name=name;
  }

  //getters
  int getPid(){
    return this.pid;
  }
  float getCost(){
    return this.cost;
  }
  String getName(){
    return this.name;
  }
}