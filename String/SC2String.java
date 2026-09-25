public class SC2String {

    public static void main(String[] args){

    // checking whether the number is binary or not ------------------
    // int b=10110001;
    // String str=String.valueOf(b);

    // System.out.println(str.matches("[01]+"));

    // checking the number is hexadecimal or not---------------------
    // String str="23AFB";
    // System.out.println(str.matches("[0-9A-F]+"));


    //Finding the data in Date format(dd/mm/yyyy)--------------------
    String d="23/12/2004";
    System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));



}
}
