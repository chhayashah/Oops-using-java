public class Constructor2 {
    
    String name;
    int yob;

    public int check() {
        return yob;
    }
    Constructor2(){

    }
    Constructor2(Constructor2 s1){
        name=s1.name;
        yob=s1.yob;
    }
    Constructor2(String s1, int y){
        name=s1;
        yob=y;
    }
}
