package kz.jusan.market.bankapp.demo2.Transactions;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryTransactionDAO implements TransactionDAO{

    private List<Transaction> transactions;

    public MemoryTransactionDAO(){
        transactions = new ArrayList<>();
    }

    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
