package JavaFRQPractice;

// Class that represents a simple bank account
class BankAccount {
   private String owner;
   private double balance;
 
   public BankAccount(String o, double b) {
      owner = o;
      balance = b;
   }
 
   public void deposit(double amount) {
      balance = balance + amount;
   }
 
   public void printInfo() {
      System.out.println(owner + " — Balance: $" + balance);
   }
}

public class BankTester {
   public static void main(String[] args) {
	BankAccount Alex = new BankAccount("Alex", 100.0);
   BankAccount Jamies = new BankAccount("Jamies", 250.0);
 
      Alex.deposit(50.0);
 
      Alex.printInfo();
	Jamies.printInfo();
   }
}

