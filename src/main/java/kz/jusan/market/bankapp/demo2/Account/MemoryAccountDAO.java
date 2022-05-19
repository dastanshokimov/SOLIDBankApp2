package kz.jusan.market.bankapp.demo2.Account;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryAccountDAO implements AccountDAO{

    private List<Account> accountList;

    public MemoryAccountDAO(){
        this.accountList = new ArrayList<>();
    }

    public MemoryAccountDAO(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        List<Account> clientAccounts = new ArrayList<>();
        for(Account account: accountList){
            if(account.getClientID().equals(clientID)){
                clientAccounts.add(account);
            }
        }
        return clientAccounts;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account, double amount) {
        for(Account acc: accountList) {
            if (acc.getId().equals(account.getId())) {
                acc.setBalance(amount);
            }
        }
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        List<Account> listOfClientAccountsByType = new ArrayList<>();
        for(Account account: accountList){
            if(account.getClientID().equals(clientID)){
                if(account.getAccountType().getName().equals(accountType.getName())){
                    listOfClientAccountsByType.add(account);
                }
            }
        }
        return listOfClientAccountsByType;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        for(Account account: accountList){
            if(account.getId().equals(accountID)){
                if(account.isWithdrawAllowed()){
                    return new AccountWithdraw((account.getAccountType()),
                            account.getId(),
                            account.getClientID(),
                            account.getBalance(),
                            true);
                }
            }
        }
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        for(Account account:accountList){
            if(account.getClientID().equals(clientID)){
                if(account.getId().equals(accountID)){
                    return account;
                }
            }
        }
        return null;
    }
}
