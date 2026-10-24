class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID,String name,int maxMarks,int marksObtain){
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }

    public String getSubID(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getmarksObtain(){
        return marksObtain;
    }
    public void setMaxMarks(int maxMarks){
        this.maxMarks=maxMarks;

    }
    public void setMarksObtain(int marksObtain){
        this.marksObtain=marksObtain;
    }
}

class Student{
    private int rollNo;
    private String name;
    private String dept;
    private String subjects;

    public Student(int rollNo,String name,String dept,String subjects){
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        this.subjects=subjects;

    }

    public int getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public String getSubjects(){return subjects;}

    public void setDept(String dept){this.dept=dept; }
    public void setSubjects(String subjects){this.subjects=subjects; }

}


public class Subjects_Student {
    public static void main(String[] args) {
        Subject Subs[] = new Subject[3];
        System.out.println("--------Subject details-----------");

        Subs[0]=new Subject("s101","DS",100,99);
        Subs[1]=new Subject("s102","Algorithm",100,98);
        Subs[2]=new Subject("s103","OS",100,90);

        for(Subject s:Subs)
            System.out.println(s);

    }
}
