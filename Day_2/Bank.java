 public class Bank
{

    public static void main(String[] args) {
        BankAccount account= new BankAccount("sandeep",  12);
    if(account  instanceof BankAccount )
    {
        System.out.println("account is instance of BankAccount class");
    }
    account.display();
    }
}

class BankAccount
{

static  String bankName;
String accountHolderName;
  final int accountNumber;
   public BankAccount(String accountHolderName,int accountNumber){
       this.accountHolderName=accountHolderName;
       this.accountNumber=accountNumber;

   }
   public void display()
   {
    System.out.println("The Account Holder name is :"+ accountHolderName);
    System.out.println("The account  number is :"+accountNumber);
   }



}
