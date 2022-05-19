package kz.jusan.market.bankapp.demo2.CLI;

import kz.jusan.market.bankapp.demo2.Account.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
@AllArgsConstructor
@Getter
public class MyCLI implements CLIUI{

    private Scanner scanner;
    @Autowired
    public MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public double requestClientAmount(){
        System.out.println("Type amount of Money: ");
        return Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String requestClientAccountNumber() {
        System.out.println("Type account ID: ");
        String accountID = scanner.nextLine();
        return accountID;
    }

    @Override
    public AccountType requestAccountType(){
        System.out.println("Please, choose account type:");
        System.out.println("[CHECKING, SAVING, FIXED]");
        String accountTypeValue = scanner.nextLine();
        List<String> accountTypes = Arrays.asList("CHECKING", "SAVING", "FIXED");
        if(!accountTypes.contains(accountTypeValue)) {
            System.out.println("Invalid account type.");
            return null;
        }
        return new AccountType(accountTypeValue);
    }
}
