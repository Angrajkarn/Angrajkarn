

//print all permuntation of a string "abc"

/*public class recursion3 {
    public static void printperm(String str, String permuntation){
        if(str.length()==0){
            System.out.println(permuntation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);
            String newStr= str.substring(0, i) +str.substring(i+1);
            printperm(newStr, permuntation+currChar);
        }
    }
    public static void main(String args[]){
        String str="abc";
        printperm(str, "");
    }
} /* */


    
    // find total paths in a maze to move form(0,0) to (n,m) n=3 and m=3

    /*public class recursion3 {
        public static int countPaths(int i, int j,int n, int m) {
            if(i==n || j==m){
                return 0;
            }
            if(i==n-1 && j==m-1){
                return 1;
            }

            int downPaths=countPaths(i+1,j,m,n);
            int rightPaths=countPaths(i,j+1,m,n);
            return downPaths + rightPaths;
        }
        public static void main(String args[]){
            int n=3,m=3;
            int totalPaths=countPaths(0,0, n, m);
            System.out.println(totalPaths);

        }
    } */

    //place tiles size 1xm in a floor of size nxm

    public class recursion3 {
        public static int placeTiles(int n, int m){
            if(n==m){
                return 2;
            }
            if(n<m){
                return 1;
            }


            int horizontal=placeTiles(n-m, m);
            int vertical=placeTiles(n-1, m);
            return horizontal +vertical;

        }
        public static void main (String args[]){
            int n=4,m=2;
            System.out.println(placeTiles(n, m));
        }
    }