public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.divide();
        System.out.println("Hello");
    }
    void divide(){
        try{
            int a = 100,b = 0,c;
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
