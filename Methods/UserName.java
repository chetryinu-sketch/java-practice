import java.util.*;
public class UserName {
    
    static String uName(String email){
        int a=email.indexOf('@');
        String name=email.substring(0,a);
        return name;

    }
    public static void main(String []args){
        System.out.println(uName("inu@gmial.com"));
    }
}
