package kz.jusan.market.bankapp.demo2.Services;

import kz.jusan.market.bankapp.demo2.Account.AccountType;
import org.springframework.stereotype.Service;

@Service
public interface AccountCreationService {

    public void create(AccountType accountType, long bankID, String clientID, long accountID);
}
