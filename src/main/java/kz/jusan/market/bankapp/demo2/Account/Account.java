package kz.jusan.market.bankapp.demo2.Account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Account {

    private AccountType accountType;
    private String id;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType.getName() +
                ", id='" + id + '\'' +
                ", clientID='" + clientID + '\'' +
                ", balance=" + balance +
                '}';
    }
}
