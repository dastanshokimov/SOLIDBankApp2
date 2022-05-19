package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.Account;
import kz.jusan.market.bankapp.demo2.Account.AccountDAO;
import kz.jusan.market.bankapp.demo2.Account.AccountType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AccountCreationServiceImpl implements AccountCreationService{
    private AccountDAO accountDAO;

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        if(accountType != null){
            String id = String.format("%03d%06d", bankID, accountID);
            boolean isWithdrawAllowed = true;
            if(accountType.getName().equals("FIXED")) {
                isWithdrawAllowed = false;
            }

            Account account = new Account(accountType, id, clientID,0, isWithdrawAllowed);

            System.out.println("Bank account has been created successfully.");
            accountDAO.createNewAccount(account);
        }
    }
}
