// package Interface;

interface Test
{
    void meth1();
    void meth2();
}
class My implements Test
{   
    @Override 
    public void meth1()
    {
        System.out.println("Meth1 of class My");
    }
    @Override 
    public void meth2()
    {
        System.out.println("Meth2 of class My");
    }
    public void meth3(){
        System.out.println("Meth3 of class My");
    }
}
public class InterfacePractice {
    public static void main(String[] args)
    {
        My n=new My();
        n.meth1();
        n.meth2();
        n.meth3();
    }
}
