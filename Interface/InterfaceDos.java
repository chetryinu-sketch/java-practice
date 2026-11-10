interface Test{
    final static int x=10;
    public abstract void meth1();
    public abstract void meth2();
   default void meth3(){
        System.out.println("Meth3 of Test");
    }
}
interface Test2 extends Test
{
    void meth4();
}
class My implements Test2
{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}
    public void meth3(){}
}

public class InterfaceDos {
    public static void main(String[] args) {
         System.out.println(Test.x);
         My m=new My();
        
    }
}
