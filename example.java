class Account {
    private long id;
    private String name;
    private float balance;

    public Account(long id, String name, float balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

class MyCode {

    // for each purchase the platform will receive a commission of 5% from the seller
    private static String COMMISSION_RATE = "5";
    private static Account platform;

    public static void main(String[] args) {
        platform = new Account(1, "platform", 0);
        Account sellerA = new Account(2, "SellerA", 0);
        Account customerA = new Account(3, "customerA", 1000f);
    }

    /**
     * Implement an item purchase between a customer and seller for a specified item cost
     * Update the account balances of the relevant parties accordingly
     */
    private void purchaseItem(){}

    /**
     * Implement a refund between a customer and seller for a specified refund amount
     * Update the account balances of the relevant parties accordingly
     */
    private void refundItem(){}
}