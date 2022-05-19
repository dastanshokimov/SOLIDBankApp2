package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.AccountType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BankCore {

    private static long id = 1;
    private long lastAccountNumber = 1;
    private AccountCreationService accountCreation;

    public BankCore(@Qualifier("accountCreationServiceImpl") AccountCreationService accountCreation){
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientID){
        accountCreation.create(accountType, id, clientID, lastAccountNumber);
        incrementLastAccountNumber();
    }

    private void incrementLastAccountNumber(){
        lastAccountNumber++;
    }
}
