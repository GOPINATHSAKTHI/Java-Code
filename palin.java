bool isPalindrome(int x) {

     double rev=0; 
     double rem;
     double orignal=x;
     while(x>0)
        {
            rem = x % 10;
            rev = rev * 10 + rem;
            x=x/10;
        }

        if(rev == orignal)
            return true;
        
         else
       return false;
    
}
