package kz.jusan.market.bankapp.demo2.Account;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountDAO {

    List<Account> getClientAccounts(String clientID);

    public void createNewAccount(Account account);

    public void updateAccount(Account account, double amount);

    List<Account> getClientAccountsByType(String clientID, AccountType accountType);

    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    public Account getClientAccount(String clientID, String accountID);
}
