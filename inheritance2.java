class Arithmetic
{ 
    int add(int x, int y)
    { 
        return x+y; 
    } 
}

class Adder extends Arithmetic
{

}

public class Solution {

public static void main(String[] args) {
    System.out.println("My superclass is: Arithmetic"); 
    Adder a = new Adder();
    System.out.print(a.add(12, 30)+" ");
    System.out.print(a.add(10, 3)+" ");
    System.out.print(a.add(10, 10)+" ");
}
}

 