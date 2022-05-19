package kz.jusan.market.bankapp.demo2.CLI;

import jdk.jfr.Registered;
import kz.jusan.market.bankapp.demo2.Account.Account;
import kz.jusan.market.bankapp.demo2.Account.AccountType;
import kz.jusan.market.bankapp.demo2.Services.AccountListingService;
import kz.jusan.market.bankapp.demo2.Services.BankCore;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class AccountBasicCLI {

    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;

    public void createAccountRequest(String clientID){
        AccountType accountType = createAccountOperationUI.requestAccountType();
        bankCore.createNewAccount(accountType, clientID);
    }

    public void getAccounts(String clientID){
        List<Account> accountList = this.accountListing.getClientAccounts(clientID);
        System.out.print("[");
        for(Account account: accountList){
            System.out.print(account);
        }
        System.out.println("]");
    }
}
