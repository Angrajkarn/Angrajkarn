public class arrays { 
    /**
     * @karndeo args
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int[]number= new int [size];
        //input
        for(int i=0; i<size; i++){
            number[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        //int [] marks= new int[3];
       //System.out.println(marks[1]);
       //output
    for(int i=0; i<size; i++){
        System.out.println(number[i]);
    }
    }


}

    

