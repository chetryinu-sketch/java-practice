
public class StringPractice {
    
    public static void main(String[] args) {
        
            String str=new String("java");
            // String str2=str.toUpperCase();                  // strings are immutable that's why when 
            //                                                 // we use this methods it gives this in a new string
            // System.out.println(str2);

            str=str.toUpperCase();                            // we can replace it with the same varible name the old string will lost
            System.out.println(str);                          // (garbage collection)
    }


}
