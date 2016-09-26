public class AccountTest {

    public static void main(String[] args) {
      // Test constructor and toString()
      Account acc = new Account(201416000, 0.0);
      System.out.println(acc);  // toString()
 
      // Test Setters and Getters
      acc.setBalance(2012);
      System.out.println(acc);  // run toString() to inspect the modified instance
      System.out.println("Balance : " + acc.getBalance());
 
      
      //Test credit()
      acc.credit(160000);
      System.out.println(acc);
      
      //Test debit()
      acc.debit(170000);
      System.err.println(acc);
   }   
}