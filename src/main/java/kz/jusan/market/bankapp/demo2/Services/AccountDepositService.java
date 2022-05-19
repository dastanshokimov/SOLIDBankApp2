package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountDepositService {
    public void deposit(double amount, Account accountWithdraw);
}
