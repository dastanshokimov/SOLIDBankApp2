package kz.jusan.market.bankapp.demo2.Transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Transaction {
    private String type; // transaction type either DEPOSIT or WITHDRAW
    private double amount;
    private String accountId;
}
