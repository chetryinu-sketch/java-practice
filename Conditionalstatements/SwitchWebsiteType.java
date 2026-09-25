
import java.util.*;
public class SwitchWebsiteType {
    public static void main(String args[]){
        String domain;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter website name:");

        domain=sc.nextLine();

        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch (ext) {
        case "com":
            System.out.println("Commercial");
                break;
        case "gov":
            System.out.println("Government");
                break;
        case "biz":
            System.out.println("Business");
                break;
        default: System.out.println("not vallid url");
        }

    }
}
