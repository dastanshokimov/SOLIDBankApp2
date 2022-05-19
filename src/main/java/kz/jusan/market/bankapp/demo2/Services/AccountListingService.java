package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.Account;
import kz.jusan.market.bankapp.demo2.Account.AccountType;
import kz.jusan.market.bankapp.demo2.Account.AccountWithdraw;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface    AccountListingService {

    public Account getClientAccount(String clientID, String accountID);

    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    List<Account> getClientAccounts(String clientID);

    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
