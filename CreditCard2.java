
package lab1;

public class CreditCard2 {
    private String customer;
    private String bank;
    private String account;
    private int balance;
    private int limit;

    public CreditCard2(String cust, String bk, String ac, int b, int lim) {
        customer = cust;
        bank = bk;
        account = ac;
        balance = b;
        limit = lim;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int  getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public boolean charge(int price) {
        if (price + balance > limit)
            return false;
        balance += price;
        return true;
    }

    public void makePayment(int payment) {
        if (payment > 0) {
            balance -= payment;
        }
    }
}