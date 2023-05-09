public class Test{
     int data1(){
         int a = 44;
         int  b = 34;

         return a;
    }

      int data2(){
         int a = 10;
         int b = 20;

         return a;
    }
    public static void main(String[] args){
        Test a = new Test();
        System.out.println(a.data1());
    }
    
   
}