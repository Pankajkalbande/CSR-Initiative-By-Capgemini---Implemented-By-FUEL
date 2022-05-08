
abstract class Account {
    void getCustInfo() {
        System.out.println("Get cust information");
    }

    abstract void calculateInterest();
}

class Saving extends Account {

    @Override
    void calculateInterest() {
        System.out.println("Calculate interest of saving");
    }
}

class Loan extends Account {
    @Override
    void calculateInterest() {
        System.out.println("Calculate interest of loan");
    }
}

class AccountFactory{
    public static Account getAccount(String type) {
        Account obj = null;
        if(type.equalsIgnoreCase("saving")){
            obj = new Saving();
        }
        else{
            obj = new Loan();
        }
        return obj;
    }
}

public class DemoFactory {
    public static void main(String[] args) {

        Account obj1 = AccountFactory.getAccount("Loan");
        obj1.calculateInterest();
        obj1 = AccountFactory.getAccount("saving");
        obj1.calculateInterest();
    }

}
