public class student {
    String name;
    int sem;
    String prog;
    public student(String name,int sem,String prog){
        this.name = name ;
        this.sem = sem;
        this.prog = prog;
    }
    void Display(){
        System.out.println("Name of the student: "+name);
        System.out.println("Sem of the student: "+sem);
        System.out.println("Program of the student: "+prog);
    }


public static void main(String[] args){
       student s = new student("harsh",6,"bca");
       s.Display();
       studentcourses p = new studentcourses(); 
       p.displaym();    
       System.out.println("-----------------");
       p.displayf();
}
}     
        
    


