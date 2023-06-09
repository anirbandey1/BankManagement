import java.util.*;
import java.io.*;
import java.lang.*;

class Account{
protected long accountNumber;
protected String holderName;
protected int balance;
long get_accountNumber(){
return accountNumber;
}
String get_holderName(){
return holderName;
}
int get_balance(){
return balance;
}
void update_balance(int balance){
this.balance=balance;
}
void update_holderName(String Name){
holderName=Name;
}
void print_details(){
System.out.println("Account Number : "+accountNumber);
System.out.println("Holder Name :  "+holderName);
System.out.println("Balance : "+balance+"\n");
}
}
class SavingsAccount extends Account{
private double interestRate;
private double yearlyInterest;
SavingsAccount(long accountNumber,String holderName,int balance,double interestRate){
this.accountNumber=accountNumber;
this.holderName=holderName;
this.balance=balance;
this.interestRate=interestRate;
this.yearlyInterest=(balance*interestRate)/100;
}
double get_interestRate(){
return interestRate;
}
void set_interestRate(double interestRate){
this.interestRate=interestRate;
this.yearlyInterest=(balance*interestRate)/100;
}
double get_yearlyInterest(){
return yearlyInterest;
}
}
class CurrentAccount extends Account{
CurrentAccount(long accountNumber,String holderName,int balance){
this.accountNumber=accountNumber;
this.holderName=holderName;
this.balance=balance;
}
}
class Manager{
private Account[] ac;
int i;
Manager(){
ac=new Account[100];
i=0;
}
void add_account(Account a){
ac[i]=a;
i++;
}
void print(){
for(int j=0;j<i;j++){
ac[j].print_details();
}
}
}
class Main{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter your name for account creation: ");
 String userName=sc.nextLine();
 int userId=(int)(Math.random() * 1000);
 System.out.println("Enter initial amount to be deposited to your  account : ");
 int depositMoney= Integer.parseInt(sc.nextLine());
 SavingsAccount a1,a2,a3;
a1=new SavingsAccount(userId,userName,depositMoney,3.0);
CurrentAccount c1,c2;
// c1=new CurrentAccount(45601074,"Priyanshu",120000);
// c2=new CurrentAccount(45601075,"Soham",115000);
Manager m1=new Manager();
m1.add_account(a1);
// m1.add_account(a2);
// m1.add_account(a3);
// m1.add_account(c1);
// m1.add_account(c2);
m1.print();
}
}

