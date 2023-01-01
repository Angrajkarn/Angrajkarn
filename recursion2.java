import javax.sound.midi.SysexMessage;

// find the reverse of the string
public class recursion2 {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx - 1);

    }

    public static void main(String args[]) {
        String str = "abcd";
        printRev(str, str.length() - 1);
    }

} 
// find the first and last occurance of the string "abaacdeafaah"

public class recursion2 {
    public static int first=-1;
    public static int last=-1;
    public static void findOcurrance(String str,int idx, char element) {
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findOcurrance(str, idx+1, element);
    }
    public static void main (String args[]){
        String str="abaacdeafaah";
        findOcurrance(str, 0, 'a');
    }
}
/* */
//check if array is sorted(Strictly increasing) {1,2,3,4,5}

public class recursion2 {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;

        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(arr, 0));

    }
}
  

  //move all 'X' to end of  the string
  //"axbcxxd"

     
    public static void moveAllX(String str,int idx,int count, String newString ){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newString+='x';
            }
            System.out.println(newString);
        }
        char currChar =str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString+=currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str="axbcxxd";
        moveAllX(str, 0, 0, " ");
    }



   //remove dublicate in a string "abbccda"

   public class recursion2 {
    public static boolean[] map= new boolean[26];
    public static void removeDublicate(String str, int idx, String newString) {
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(idx);
        if(map[currChar-'a']) {
            removeDublicate(str, idx+1, newString);

        }else{
            newString+=currChar;
            map[currChar-'a'] = true;
            removeDublicate(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        String str="abbccda";
        removeDublicate(str,0, " ");
    }
} 


//print all the subsequenece of string  "abc"
public class recursion2 {
    public static void subsequenece(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar= str.charAt(idx);
         //to  be 
         subsequenece(str, idx+1, newString+ currChar);
         // or not to be
         subsequenece(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str= "abc";
        subsequenece(str, 0, "");
    }

}  */

//find all the unique subsequences of a string  "aaa"


import java.util.HashSet;


public class recursion2 {
    public static void subsequences (String str,int idx, String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar= str.charAt(idx);
        //to be 
        subsequences(str, idx+1, newString+currChar, set);
        //or not to be 
        subsequences(str, idx+1, newString, set);

    }
    public static void main (String args[]){
        String str="aaa";
        HashSet<String> set= new HashSet<>();
        subsequences(str, 0, "", set);
    }
}

//print keypad combination 

public  class recursion2 {
    public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return ;
        }
        char currChar=str.charAt(idx);
        String mapping=  keypad[currChar-'0'];

        for(int i=0;i<mapping.length(); i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    } 
    public static void main(String args[]){
        String str="23";
        printComb(str, 0, "");
    }
}