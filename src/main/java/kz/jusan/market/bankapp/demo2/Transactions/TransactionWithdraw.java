package kz.jusan.market.bankapp.demo2.Transactions;

import kz.jusan.market.bankapp.demo2.Account.AccountWithdraw;
import kz.jusan.market.bankapp.demo2.Services.AccountWithdrawService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TransactionWithdraw {

    private AccountWithdrawService accountWithdrawService;
    private TransactionDAO transactionDAO;

    public void execute(double amount, AccountWithdraw accountWithdraw){
        accountWithdrawService.withdraw(amount, accountWithdraw);
        transactionDAO.addTransaction(new Transaction("WITHDRAW",amount, accountWithdraw.getId()));
    }
}
