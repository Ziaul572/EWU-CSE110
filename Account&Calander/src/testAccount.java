import java.util.*;
public class testAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> AccountList = new ArrayList<>();
        while (true) {
            System.out.println("1. Create a Checking Account");
            System.out.println("2. Create a Saving Account\n0. Next");
            int option = input.nextInt();
            if (option == 1) {
                CheckingAccount checkAcc = new CheckingAccount();

                System.out.println("Enter Account ID:");
                checkAcc.setId(input.nextInt());
               
                System.out.println("Enter Account Balance:");
                checkAcc.setBalance(input.nextInt());
               
                System.out.println("Enter Account Annual Interest Rate(%):");
                checkAcc.setAnnualInterestRate(input.nextDouble());
            
                System.out.println("Enter Account Over Draft:");
                checkAcc.setOverdraft(input.nextDouble());
             
                
                AccountList.add(checkAcc);
                System.out.println("Checking account created Successfully for ID:" + checkAcc.getId() + " at " + checkAcc.getDataCreated().getTime());

            } else if (option == 2) {
                
                SavingAccount saveAcc = new SavingAccount();

                System.out.println("Enter Account ID:");
                saveAcc.setId(input.nextInt());
               
                System.out.println("Enter Account Balance:");
                saveAcc.setBalance(input.nextInt());
               
                System.out.println("Enter Account Annual Interest Rate(%):");
                saveAcc.setAnnualInterestRate(input.nextDouble());
               
                System.out.println("Saving account created Successfully for ID:" + saveAcc.getId() + " at " + saveAcc.getDataCreated().getTime());
                System.out.println("Your card No:" + saveAcc.getCardNo() + " Expire Date:" + saveAcc.getExpireDate().getTime());
                AccountList.add(saveAcc);
            } else if (option == 0)
                break;
        }
        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit\n0. next");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Account ID:");
                int accountID = input.nextInt();
                for (Account account : AccountList) {
                    if (account.getId() == accountID) {
                        System.out.println("Withdraw Amount:");
                        if( account instanceof CheckingAccount ) {
                            double x = input.nextDouble();
                            ((CheckingAccount) account).withdraw(x, ((CheckingAccount) account).getOverdraft());
                        }
                        else
                            account.withdraw(input.nextDouble());
                    }
                }
            } else if (option == 2) {
                System.out.println("Account ID:");

                int accountID = input.nextInt();
                for (Account account : AccountList) {
                    if (account.getId() == accountID) {
                        System.out.println("Deposit Amount :");
                        account.deposit(input.nextDouble());
                        break;
                    }
                }

            } else if (option == 0) {
                break;
            }
        }
            while(true){
                System.out.println("1. Show Detail");
                System.out.println("2. Exit");
                int option = input.nextInt();
                if( option == 1 ){
                    System.out.println("Account ID:");
                    int accountID = input.nextInt();
                    for (Account account : AccountList) {
                        if (account.getId() == accountID) {
                            System.out.println("Detail for account :" + accountID);
                            System.out.println("Balance :" + account.getBalance() + "$");
                            System.out.println("Account Created :" + account.getDataCreated().getTime());
                            System.out.println("Annually Interest Rate :" + account.getAnnualInterestRate() + "%");
                            System.out.println("Monthly Interest :" + account.getMonthlyInterestAmount() + "$");
                            if (account instanceof SavingAccount) {
                                System.out.println("Account Type : Saving");
                                System.out.println("Card No :" + ((SavingAccount) account).getCardNo());
                                System.out.println("Credit Card Balance : " + ((SavingAccount) account).getCreditBalance() + "$");
                                System.out.println("Expire Date :" + ((SavingAccount) account).getExpireDate().getTime());

                            } else {
                                System.out.println("Account Type : Checking");
                                System.out.println("Over Draft :" + ((CheckingAccount) account).getOverdraft()+"$");
                            }
                        }
                    }
                }
                else if( option == 2 ) break;
            }
            input.close();
        }
}