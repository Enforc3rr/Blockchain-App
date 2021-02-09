public class App {
    public static void main(String[] args) {
        //First Block
        String [] firstTransaction = {"I sent $50 To Sam","I Received $100 From Kenny"};
        Block firstBlock = new Block(firstTransaction , 0);
        System.out.println(firstBlock.toString());

        //Second Block
        String [] secondTransaction = {"Sam sent $500 To Steam","Gaben Received $10000 From CSGO_Devs"};
        Block secondBlock = new Block(secondTransaction , firstBlock.getHash());
        System.out.println(secondBlock.toString());

        //Third Block
        String [] thirdTransaction = {"CSGO_Devs sent $50 To CSGO_Community","Mr.X Received $10 From Mr.Y"};
        Block thirdBlock = new Block(thirdTransaction , secondBlock.getHash());
        System.out.println(thirdBlock.toString());
    }
}
