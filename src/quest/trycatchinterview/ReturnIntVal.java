package quest.trycatchinterview;

public class ReturnIntVal {
    public int getIntVal(){
        try {
            System.out.println("Block 1");
            return 1;
        } catch (Exception e) {
            System.out.println("Block 2");
            return 2;
        }
        finally {
            System.out.println("Block 3");
            return 3;
        }
    }
}
