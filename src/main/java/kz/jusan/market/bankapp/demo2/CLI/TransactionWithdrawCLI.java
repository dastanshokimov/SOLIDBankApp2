package kz.jusan.market.bankapp.demo2.CLI;

import kz.jusan.market.bankapp.demo2.Account.AccountWithdraw;
import kz.jusan.market.bankapp.demo2.Services.AccountListingService;
import kz.jusan.market.bankapp.demo2.Transactions.TransactionWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionWithdrawCLI {

    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void withdrawMoney(String clientID) {
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountID = withdrawDepositOperationCLIUI.requestClientAccountNumber();
        AccountWithdraw accountWithdraw =accountListing.getClientWithdrawAccount(clientID, accountID);
        if (accountWithdraw != null) {
            transactionWithdraw.execute(amount, accountWithdraw);
        } else System.out.println("No withdraw is allowed for FIXED accounts.");
    }
}