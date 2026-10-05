public class index{
    static int  plusMethodInt(int x,int y){
        return x + y;
    }
    static  double plusMethodDouble(double x,double y){
        return x + y;
    }
    public static void main(String[] args){
        int Mynum1 = plusMethodInt(8,5);
        double Mynum2 = plusMethodDouble(4.3,8.90);
        System.out.println("int" + Mynum1);
        System.out.println("double"+ Mynum2);
    }
    
    
}
