class CTest{
    int a;
    void test(int a){
        if (a%2==1) {
            System.out.println("此為奇數");
        }else if(a==0){
            System.out.println("此數為0");
        }
        else{
            System.out.println("此為偶數");
        }
    }
}
public class Class07 {
    public static void main(String[] args) {     
       CTest bb=new CTest();
       bb.test(4);
       bb.test(8);
       bb.test(0);
       

    }
}
