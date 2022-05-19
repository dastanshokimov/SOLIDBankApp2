package kz.jusan.market.bankapp.demo2.CLI;

import kz.jusan.market.bankapp.demo2.Account.Account;
import kz.jusan.market.bankapp.demo2.Services.AccountListingService;
import kz.jusan.market.bankapp.demo2.Transactions.TransactionDeposit;
import kz.jusan.market.bankapp.demo2.Transactions.TransactionWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionDepositCLI {

    private TransactionDeposit transactionDeposit;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void depositMoney(String clientID){
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        Account account = null;
        if(!accountID.isEmpty()){
            account = accountListing.getClientAccount(clientID, accountID);
        }
        if(account != null){
            transactionDeposit.execute(amount, account);
        }
        else System.out.println("Account not found.");
    }
}
