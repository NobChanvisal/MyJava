//this package can access for public.
package AccountPack;

public class Balance {
    String name;
    double bal;
    Balance(String n, double b){
        name =n;
        bal = b;
    }
    void show(){
        if((bal < 0))
            System.out.print("--->");
            System.out.println(name + ": $" + bal);
    }
}
class AccountBance{
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Chanvisal", 150.50);
        current[1] = new Balance("Chandara", 200);
        current[2] = new Balance("Pinake",120);
        for(int i= 0; i<3; i++){
            current[i].show();
        }
    }
}
