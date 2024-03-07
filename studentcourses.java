public class studentcourses {
    public String[] courses={"MP","ML","DO","CN","C#"};
        public int[] marks={80,40,39,32,96};
    
        void displaym(){
        for(int i=0;i<courses.length;i++){
            System.out.println("cources   "+courses[i]+"   " + "marks :"+marks[i]);
        }

    }
    void displayf(){
        for(int i=0;i<courses.length;i++){
            if(marks[i]<40)
            System.out.println("cources   "+courses[i]+"   " + "marks :"+marks[i]);
        }
    }
}
