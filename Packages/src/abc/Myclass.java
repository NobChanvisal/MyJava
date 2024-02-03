package abc;
class A {
    int x, y;
    int sum(){
      return x+y;
    }
 }
public class Myclass {
    public static void main(String args[]){
        A ob = new A();
        ob.x = 23; ob.y = 34;
        System.out.println("sum = " + ob.sum());
     }
}
