// import java.util.HashMap;
// import java.util.Map;
// class MapDemo{
//   public static void main(String args[]){
//     HashMap<Integer,String> map=new HashMap<Integer,String>();
//     map.put(10,"siraj");
//     map.put(100,"messi");
//     map.putIfAbsent(10, "siraj");
//     map.putIfAbsent(101, "sirajj");
//     System.out.println(map);
//     for(Map.Entry m:map.entrySet()){
//       System.out.println(m.getKey()+" "+m.getValue());
//     }
//   }
// }

// import java.util.HashMap;
// import java.util.Map;
// class MapDemo{
//   public static void main(String args[]){
//     HashMap<Integer,String> map=new HashMap<Integer,String>();
//     map.put(10,"siraj");
//     map.put(100,"messi");
//     map.putIfAbsent(10, "siraj");
//     map.putIfAbsent(101, "sirajj");

//     Integer key=10;
    
//     System.out.println(map);
//     for(Map.Entry m:map.entrySet()){
//       if(m.getKey()==key){
//         System.out.println(m.getValue());
//       }

//     }
//   }
// }

// import java.util.HashMap;
// import java.util.Map;

// class MapDemo {
//   public static void main(String args[]) {
//     HashMap<Integer, String> map = new HashMap<Integer, String>();
//     map.put(10, "siraj");
//     map.put(100, "messi");
//     map.putIfAbsent(10, "siraj");
//     map.putIfAbsent(101, "sirajj");
//     System.out.println(map);
//     map.remove(10, "siraj");
//     System.out.println(map);

//   }
// }

// import java.util.LinkedHashMap;

// import java.util.HashMap;
// import java.util.Map;
// class MapDemo{
//   public static void main(String args[]){
//     LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
//     map.put(10,100);
//     map.put(100,100);
//     map.putIfAbsent(10, 100);
//     map.put(20,200);
//     if(map.containsKey(100)){
//       System.out.println("found");
//     }
//     else{
//       System.out.println("not found");
//     }
    
//   }
// }


// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.Scanner;
 
// class Student{
//   int rollno;
//   String name;
//   Student(int rollno,String name){
//     this.rollno=rollno;
//     this.name=name;
//   }
// }
// class MapDemo{
//   public static void main(String args[]){
//     LinkedHashMap<Integer,Student> map=new LinkedHashMap<Integer,Student>();
//     Scanner sc=new Scanner(System.in);
//     for(int i=1;i<=3;i++){
//       map.put(i,new Student(sc.nextInt(),sc.next()));
//     }
 
//     for(Map.Entry m:map.entrySet()){
//       Student st=(Student)m.getValue(); 
//       System.out.println("key is "+m.getKey()+"value is "+m.getValue());
//       System.out.println("values are");
//       System.out.println(st.rollno+" "+st.name);
      
//     }
//   }
// }


import java.util.Map;
import java.util.HashMap;

class MapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> h=new HashMap<Integer,String>();
    h.put(10,"xnxx");
    h.put(2,"sex");
    h.remove(10);
    System.out.println(h);
  }
}