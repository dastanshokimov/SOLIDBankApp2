package kz.jusan.market.bankapp.demo2.Transactions;

import kz.jusan.market.bankapp.demo2.Account.Account;
import kz.jusan.market.bankapp.demo2.Services.AccountDepositService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, Account accountDeposit) {
        accountDepositService.deposit(amount, accountDeposit);
        transactionDAO.addTransaction(new Transaction("deposit", amount, accountDeposit.getId()));
    }
}