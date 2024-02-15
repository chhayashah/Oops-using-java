public class Constructor1 {
    
    public static void main(String[] args){
        Constructor2 s1 = new Constructor2("chhaya",1890);

        // System.out.println(s1.yob+" "+s1.name);

        Constructor2 s2 = new Constructor2(s1);

        System.out.println(s2.yob+" "+s2.name);


        // int a=10;
        // int b=20;
        // System.out.println(a+" "+b);
        // swap(a,b);
        // System.out.println(a+" "+b);

        Pair p1=new Pair(10, 20);
        System.out.println(p1.a+" "+p1.b);
        swap(p1);
        System.out.println(p1.a+" "+p1.b);

    }

    private static void swap(Pair p1){
        int temp=p1.a;
        p1.a=p1.b;
        p1.b=temp;
    }

    // private static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
}
