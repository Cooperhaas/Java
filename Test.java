public class Test {

    public static int w = 100;
    public static int z = 150;

    public static void main(String[] args){

        Test t = new Test();

        t.switchVar();
        System.out.print(w + " " + z);

}

public void switchVar(){
    int ter;
    ter = w;
    w = z;
    z = ter;
}
}

