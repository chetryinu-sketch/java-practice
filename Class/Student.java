class StudentTest{

    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){

        return m1+m2+m3;

    }

    public float average(){
        return total()/3.0f;
    }

    public char grade(){
        
        if(average()>=60){
            return 'A';
        }
        else
            return 'B';
    
}
    public String details(){
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }

}


public class Student{
    public static void main(String []args){

        StudentTest S1 = new StudentTest();
        S1.roll=2581328;
        S1.name="Inu Chetry";
        S1.course="Btech";
        S1.m1=90;
        S1.m2=100;
        S1.m3=99;

        System.out.println("Details:\n"+S1.details());
        System.out.println("Total marks:"+S1.total());
        System.out.println("Average marks:"+S1.average());
        System.out.println("Grade:"+S1.grade());
   
       

        

    }
}
