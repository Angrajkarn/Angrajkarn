/* public class recursion7 {
    public static void towerOfHonoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        towerOfHonoi(n - 1,src, dest, helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        towerOfHonoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHonoi(n, "S", "H", "D");
    }
} // disk probelem  */

//2. question print a string in inverse.
/* public class recursion7{
    public static void printRev(String src,int index) {
        if(index==0){
            System.out.println(src.charAt(index));
            return ;
        }
        System.out.prin[t(src.charAt(index));
        printRev(src,index-1);
    }
    public static void main(String args[]){
        String src="abcd";
        printRev(src,src.length()-1);
    }
}
*/

//QUESTION 3:- find the 1st & last occurance of an element in string

public class recursion7 { 
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,int idx,char element){
        if(idx==str.length()) {
            System.out.println(first);
            System.out.println(last);
        }
        char currChar=str.charAt(idx);
        if(currChar==element) {
            if(first==-1) {
                first=idx;
            }else{
                last=idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    public static void main(String args[]){
        String str="abaacdaefaah";
        findOccurance(str, 0, 'a');

    }
}