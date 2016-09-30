public class AccountTest {

    public static void main(String[] args) {
      Account acc = new Account(201416000, 0.0);
      System.out.println(acc);  
 
      acc.setBalance(2012);
      System.out.println(acc); 
      System.out.println("Balance : " + acc.getBalance());
 
      acc.credit(160000);
      System.out.println(acc);
      
      acc.debit(170000);
      System.err.println(acc);
   }   
}