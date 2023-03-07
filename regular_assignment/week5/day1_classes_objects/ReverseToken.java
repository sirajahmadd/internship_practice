import java.util.StringTokenizer;
public class ReverseToken {     
    public static void main(String[] args) {                 
        StringTokenizer st = new StringTokenizer("hello there");         
        String reverse = "";          
        while (st.hasMoreTokens()) {
            reverse = st.nextToken() + " " + reverse;
        }        
        System.out.println("Reversed string is : " + reverse);  
    }
}


// import java.util.StringTokenizer;
// public class ReverseToken {     
//     public static void main(String[] args) {        
//         String s = "messi leonal goat the";         
//         StringTokenizer st = new StringTokenizer(s);         
//         String reverse = "";          
//         while (st.hasMoreTokens()) {
//             reverse = st.nextToken() + " " + reverse;
//         }        
//         System.out.println("Original string is : " + s);
//         System.out.println("Reversed string is : " + reverse);  
//     }
// }