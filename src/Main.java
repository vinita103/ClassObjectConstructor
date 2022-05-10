

public class Main {
    public static void main(String[] args) {

        // creating instance of BankAccount

        BankAccount account = new BankAccount(500, " Vinita");

        // calling deposit method 

        account.deposit(100);

        // calling print account details method

        account.printAccountDetails();

    //   Bank transfer - creating two instances of BankAccount

       BankAccount  account1 = new BankAccount (5000 , "Larry");

       BankAccount account2 = new BankAccount (300, "Mary");

    //    calling withdraw and deposit method

       account1.withdraw(100);

       account2.deposit(100);

    //    printing account1 and account2

      account1.printAccountDetails();

      account2.printAccountDetails();

    //   creating instance of product
   
      Product gas = new Product (4.0, 10 , "Gallon of gas");

       // calling totalcost method

       gas.totalCost();

       // calling printProduct method

       gas.printProduct();




    }

}
