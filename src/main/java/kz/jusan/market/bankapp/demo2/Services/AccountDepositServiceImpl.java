package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.Account;
import kz.jusan.market.bankapp.demo2.Account.AccountDAO;
import kz.jusan.market.bankapp.demo2.Account.AccountWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AccountDepositServiceImpl implements AccountDepositService{
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public void deposit(double amount, Account account) {
        System.out.println(amount + "$ transferred to " + account.getId() + " account");
        accountDAO.updateAccount(account, account.getBalance()+amount);
    }
}
