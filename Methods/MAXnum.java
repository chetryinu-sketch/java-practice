public class MAXnum {
    int max(int A[]){
        int Max=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>Max){
                Max=A[i];
            }
        }
        return Max;
    }
    public static void main(String []args){
        MAXnum obj=new MAXnum();
        int A[]={23,6,34,9};
        System.out.println(obj.max(A));

    }
}
