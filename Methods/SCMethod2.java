public class SCMethod2 {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }
    static int reverse(int n){
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(validate("inu"));
        System.out.println(validate(5));
        System.out.println(reverse(23));
    }
}
