class Account{
    private String accNo;
    private String name;
    private String address;
    private int phNo;
    private String Dob;
    protected long balance;

    public Account(String acc,String n,String add,int phNo,String Dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phNo=phNo;
        this.Dob=Dob;
        balance=0;

    }

    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPhNo(){
        return phNo;
    }
    public String getDob(){
        return Dob;
    }
    public long getBalance(){
        return balance;
    }
    public void setAddress(String add){
        this.address=add;
    }
    public void setPhno(int phno){
        this.phNo=phno;
    }
}

class SavingAccount extends Account
{
    public void deposit(long amt){
        balance-=amt;
    }
    public void repay(long amt){
        if(balance==amt)
            balance=0;
    }
}


public class Bank {
    public static void main(String[] args) {
        
    }
}
