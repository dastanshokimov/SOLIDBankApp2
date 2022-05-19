package kz.jusan.market.bankapp.demo2.Transactions;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionDAO {

    public List<Transaction> getTransactions();
    public void addTransaction(Transaction transaction);
}
