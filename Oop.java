
class Bank{
    BankAccount []Accounts;
    int count;
    Bank(int capacity){
    Accounts=new BankAccount[capacity];
    count=0;
    }
    void Add(BankAccount acc){
     boolean exists = false;
for(int i=0;i<count;i++){
    if(acc.accountNumber == Accounts[i].accountNumber){ exists = true; break; }
}
if(!exists){ Accounts[count]=acc; count++; }
else System.out.println("Invalid operation");
    }
  void remove(int num){
    for(int i=0;i<count;i++){
        if (Accounts[i].accountNumber == num){
            for(int j=i; j<count-1; j++){
                Accounts[j]=Accounts[j+1];
            }
            Accounts[count-1]=null;
            count--;
            break;
        }
    }
}

    void retrieve(int num){
        for(int i=0;i<count;i++){
            
                if (Accounts[i] != null && Accounts[i].accountNumber == num){
                Accounts[i].display(); break;}}
           }
           void details(){
            for(int i=0;i<count;i++){
              Accounts[i].display();
              System.out.println();
            }
           }

        }
        
    


 class BankAccount{
     int accountNumber;
      String accountName;
    double accountBalance;
    void setnumber(int n){
        if(n!=accountNumber)
            accountNumber=n;
        else System.out.println("this account Number have already exist!");
    }
    int getnumber(){

        return accountNumber;
    }
     void setbalance(double b){
       accountBalance=b;
    }
    double getbalance(){

        return accountBalance;
    }
      void setName(String name){
       accountName=name;
    }
    String getName(){

        return accountName;
    }

    void Deposite(double deposite){
        if(deposite>0){
            accountBalance+=deposite;
          System.out.println("Deposite is " +deposite);
        System.out.println("so Your Account Balance  is " +accountBalance);
        }
        else System.out.println("Invalid Input ");
    }
    void Withdraw(double Withdraw){
        if(Withdraw<=accountBalance&&Withdraw>0){
            accountBalance-=Withdraw;
        System.out.println("Withdraw is " +Withdraw);
        System.out.println("so Your Account Balance  is " +accountBalance);

        }
        else System.out.println("Warning you musn't exceed the available balance");
    }
    double checkbalance(){
        return accountBalance;
    }
    void transfer(BankAccount account,double value){
        if(value>0){
        accountBalance-=value;
        account.accountBalance+=value;
    System.out.println("The Account Balance for the account which transfer from it become  "+accountBalance);
    System.out.println("The Account Balance for the account which transfer to it become  "+account.accountBalance);

    }
    else System.out.println("Invalid Operation");
    }
    void display(){
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Account Name is "+accountName);
        System.out.println("Account Balance is "+accountBalance);


    }
}

public class Oop {
  
    public static void main(String[] args) {

BankAccount acc1=new BankAccount();
BankAccount acc2=new BankAccount();
BankAccount acc3=new BankAccount();


acc1.setnumber(1);
acc2.setnumber(2);
acc3.setnumber(3);
acc3.setbalance(300000);

acc1.setbalance(100000);
System.out.println(acc1.checkbalance());
acc1.Withdraw(20000);
acc1.Deposite(10000);
acc2.setbalance(50000);
acc1.transfer(acc2,-40000);

Bank container=new Bank(100);
acc1.setName("company");
acc2.setName("hospital");
acc3.setName("sama");


container.Add(acc1);
container.Add(acc2);
container.Add(acc3);


//acc1.display();
//container.remove(2);
 container.retrieve(2);
//container.details();
    }}