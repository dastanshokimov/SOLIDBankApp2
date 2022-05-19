package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.AccountDAO;
import kz.jusan.market.bankapp.demo2.Account.AccountWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AccountWithdrawServiceImpl implements AccountWithdrawService{
    @Autowired
    private AccountDAO accountDAO;

    @Override
    public void withdraw(double amount, AccountWithdraw account){
        double withdrawResult = account.getBalance()-amount;
        if(withdrawResult >= 0) {
            System.out.println(amount + "& transferred from " + account.getId() + " account");
            accountDAO.updateAccount(account, account.getBalance()-amount);
        } else System.out.println("Withdraw is not possible, not enough money on account.");
    }
}
