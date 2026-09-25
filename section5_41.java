// package widenarrodemo;
public class section5_41 {
    public static void main(String[] args) {
    
        byte b=5;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;
                                                // core concept
        // b=s; // not allowed widening        // smaller size on the right hand side and larger size on the 
                                               // left (this is widening) and the vice versa is (narrowing/  type-casting)
        b=(byte)s; // allowed by narrowing
        System.out.println(b);

        s=b;
        i=b;
        l=b;
        f=b;
        // c=b; // not allowed they are not compatable
        // bl=b; // not allowed with any other type rather then boolean itself



        // i=f; // not allowed but by type-casting it is possible
        i=(int)f;
        f=i; // allowed as size of 'f' size is larger 


    }

}

