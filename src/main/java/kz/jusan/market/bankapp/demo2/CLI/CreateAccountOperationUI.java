package kz.jusan.market.bankapp.demo2.CLI;

import kz.jusan.market.bankapp.demo2.Account.AccountType;
import org.springframework.stereotype.Service;

@Service
public interface CreateAccountOperationUI {

    public AccountType requestAccountType();
}
