package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.AccountWithdraw;
import org.springframework.stereotype.Service;

@Service
public interface AccountWithdrawService {

    public void withdraw(double amount, AccountWithdraw account);
}
