import java.util.Arrays;

public class Block {
    private String [] transaction;
    private int hash;
    private int previousHash;

    public Block(String[] transaction , int previousHash) {
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.hash = Arrays.hashCode(new int[]{Arrays.hashCode(transaction),previousHash});
    }

    public Block() {
    }

    public String[] getTransaction() {
        return transaction;
    }

    public void setTransaction(String[] transaction) {
        this.transaction = transaction;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "transaction=" + Arrays.toString(transaction) +
                ", hash=" + hash +
                ", previousHash=" + previousHash +
                '}';
    }
}
