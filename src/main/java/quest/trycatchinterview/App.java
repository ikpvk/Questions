package quest.trycatchinterview;

public class App {
    public static void main(String[] args) {

        ReturnIntVal returnIntVal = new ReturnIntVal();
        //System.out.printf("Value returned : " + returnIntVal.getIntVal());


        int intArray[][] = {{1,2,3},{4,5,6}};
        for(int i=0 ; i< 2; i++) {
            for(int j=0; j< 3; j++) {
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }



    }
}
