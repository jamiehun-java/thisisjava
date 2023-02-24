package ch06.sec100.exam20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            int selectNo = Integer.parseInt(scanner.nextLine());

            if(selectNo==1){
                createAccount();
            } else if (selectNo==2){
                showAccount();
            } else if (selectNo==3){
                depositAccount();
            } else if (selectNo==4){
                withdrawAccount();
            } else {
                run = false;
            }
        }
    }

    private static void createAccount(){
        String accountNo = scanner.nextLine();
        String accountOwner = scanner.nextLine();
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(accountNo, accountOwner, balance);
        for (int i = 0; i < accountArray.length; i++){
            if (accountArray[i] == null){
                accountArray[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void showAccount(){
        for (int i = 0; i < accountArray.length; i++){
            if (accountArray[i] != null){
                Account thisAccount = accountArray[i];
                String AccountNo = thisAccount.getAccountNumber();
                String AccountOwner = thisAccount.getAccountOwner();
                int balance = thisAccount.getBalance();

                System.out.println(AccountNo + "  " + AccountOwner + "  " + balance);
            }
        }
    }

    private static void depositAccount(){
        String accountNo = scanner.nextLine();
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(accountNo);

        if (account == null){
            System.out.println("존재하지 않는 계좌입니다.");
        } else {
            int balance = account.getBalance();
            int total = balance + money;
            account.setBalance(total);
            System.out.println("입금되었습니다.");
        }
    }

    private static void withdrawAccount(){
        String accountNo = scanner.nextLine();
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(accountNo);

        if (account == null){
            System.out.println("존재하지 않는 계좌입니다.");
        } else {
            int balance = account.getBalance();
            int rest = balance - money;
            if (rest < 0){
                System.out.println("출금 가능한 금액에서 초과됩니다.");
            } else {
                account.setBalance(rest);
                System.out.println("출금이 완료되었습니다.");
            }
        }
    }

    private static Account findAccount(String ano){
        Account account = null;
        for (int i = 0; i < accountArray.length; i++){
            if(accountArray[i] != null){
                String dbAno = accountArray[i].getAccountNumber();

                if(dbAno.equals(ano)){
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }
}
