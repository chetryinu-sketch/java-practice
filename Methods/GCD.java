public class GCD {
    int gcd(int m,int n){
        while(m!=n){

            if(m>n){
            m=m-n;
            }
            else{
                n=n-m;
            }
           
    }
     return m;
         
}
    public static void main(String[] args) {
        GCD obj=new GCD();
        System.out.println(obj.gcd(35,56));
    }

}
