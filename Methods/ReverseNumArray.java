public class ReverseNumArray {
    
    static int Reverse(int n){
        int rev=0;
        while(n>0){
            
            rev=rev*10+(n%10);
            n=n/10;
        }
        return rev;
    }
    static void Reverse(int A[]){
        for(int i=A.length-1;i>=0;i--){
            System.out.printf(A[i]+",");
            
        }
    }
    public static void main(String []args){
        System.out.println(Reverse(23));
        int A[]={1,2,3,4};
        Reverse(A);

    }
}
