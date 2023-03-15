// [11:16 AM] Lalitha Ujjaneni
//     customer class
// cid,cname,nooforders as private
// ​[11:16 AM] Lalitha Ujjaneni
//     use gettere and seeters

class Customer{
  private int cid,num_orders;
  private String cname;

  void setCid(int cid){
    this.cid=cid;
  }
  void setNum_Orders(int num_orders){
    this.num_orders=num_orders;
  }
  void setCname(String cname){
    this.cname=cname;
  }
  int getCid(){
    return this.cid;
  }
  int getNum_Orders(){
    return this.num_orders;
  }
  String getCname(){
    return this.cname;
  }
}
