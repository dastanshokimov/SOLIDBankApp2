package kz.jusan.market.bankapp.demo2.Account;

public class AccountWithdraw extends Account {
    public AccountWithdraw(AccountType accountType, String id, String clientId, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientId, balance, withdrawAllowed);
    }
}
