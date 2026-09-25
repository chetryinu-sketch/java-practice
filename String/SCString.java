// package scstring;

public class SCString {
    public static void main(String[] args) {
        String str="programmer@gmail.com";        

        int i=str.indexOf("@");
        String Uname=str.substring(0,i);
        String domain=str.substring(i+1,str.length());

        System.out.println("Username :"+Uname);
        System.out.println("Domain :"+domain);

        System.out.println(domain.startsWith("gmail"));

        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}

