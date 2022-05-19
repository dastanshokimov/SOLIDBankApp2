package kz.jusan.market.bankapp.demo2.CLI;

import kz.jusan.market.bankapp.demo2.Account.AccountType;
import org.springframework.stereotype.Service;

@Service
public interface CLIUI extends CreateAccountOperationUI, WithdrawDepositOperationCLIUI{

    public double requestClientAmount();
    public String requestClientAccountNumber();
    public AccountType requestAccountType();
}
