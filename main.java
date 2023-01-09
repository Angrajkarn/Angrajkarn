//print the sum of 10 numbers
/*public class main {
    public static void printSum(int i, int n,int sum){
       if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
       }
        sum +=i;
        printSum(i+1, n, sum);
        System.out.println(i);
        
        

       
    }
    public static void main(String args[]){
      printSum(1, 10, 0);
    }

} /* */

//print the factorial of n;

/*public class main {
    public static int printaFactorial(int n){
         if(n==1 || n==0){
            return 1;
         }
      int fact_nm1=printaFactorial(n-1);
      int fact_n=n*fact_nm1;
      return fact_n;
    }
    public static void main(String args[]){
        int n=5;
        int z=printaFactorial(n);
        System.out.println(z);
    }
}
 */


 //print the fibonacci sequence term till nth term;

  /*public  class main{
    public static void printFib(int a, int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main (String args[]){
        int a=0;
        int b=1;
        int n=7;
        printFib(a, b, n-2);
    }
 } */

 //print x^n(stack height=n);

 /*public class main{
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==0){
            return 0;
        }


        int xpow1=calPower(x, n-1);
        int xpownm1=x*xpow1;
        return xpownm1;

    }
    public static void main (String atgs[]){
        int x=2, n=5;
        int z=calPower(x, n);
        System.out.println(z);
    }
 }
*/

//print x^n(stack height=long)
public class main {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(n%2==0){  // for even
            return calPower(x, n/2)* calPower(x, n/2);


        }else{ // for odd
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
    }
    public static void main (String args[]){
        int x=2, n=5;
        int z=calPower(x, n);
        System.out.println(z);
    }
}
