import java.io.*;
import java.util.*;

abstract class Book 
{
    String title;
    abstract void setTitle(String s);
    String getTitle() 
    {
        return title;
    }
}

class MyBook extends Book 
{
   void setTitle(String s) 
   {
        this.title = s; 
    }
}

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook mb = new MyBook(); 
        mb.setTitle(title); 
        System.out.println("The title is: " + mb.getTitle());
        sc.close();
    }
}
