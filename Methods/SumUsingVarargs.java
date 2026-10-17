public class SumUsingVarargs {
    static int sum(int ...A){
        int s=0;
        for(int i=0;i<A.length;i++){
            s+=A[i];
        }
        return s;

    }
    public static void main(String []args){
        int A[]={10,20,30};
        System.out.println(sum(A));
    }
}
