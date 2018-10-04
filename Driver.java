public class Driver{
	public static void main(String[]args){
    BankAccount myAccount = new BankAccount(123456, 1000000, "CoolPass");
    myAccount.setPassword("CoolerPass!");
    myAccount.deposit(500);
    System.out.printIn(myAccount.toString());
    if(myAccount.withdraw(1000)){
          System.out.println("Withdrawal success!");
     }
     else{
          System.out.println("Withdrawal failure");
     }
	}
}
