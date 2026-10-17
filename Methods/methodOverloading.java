public class methodOverloading {
    static int max(int x,int y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        if(x>y)
            return x;
        else
            return y; 
    }
    public static void main(String []args){
        System.out.println(max(5,9));
        System.out.println(max(6f,2f));
    }
}
