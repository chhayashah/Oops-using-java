public class Stu{
    public static void main(String[] args){
        Student s1=new Student();

        System.out.println(s1.yob);

        s1.name="chhaya";
        s1.yob=1999;
        
        System.out.println(s1.yob+" "+s1.name);
        System.out.println(s1.check());


        // s1
        Student s2=new Student();
        s2.name="kiran";
        s2.yob=2001;
        System.out.println(s2.yob+" "+s2.name);
        System.out.println(s2.check());


    }
}