public class Fun {
    int a;
    int b;

    public void fundata(){
        System.out.print(a+b);
    }

    public static void main(String[] args){
        Fun r1=new Fun();
        r1.a=10;
        r1.b=20;
        r1.fundata();
    }
}
