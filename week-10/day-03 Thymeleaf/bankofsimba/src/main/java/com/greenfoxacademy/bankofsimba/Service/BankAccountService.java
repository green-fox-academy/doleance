package com.greenfoxacademy.bankofsimba.Service;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class BankAccountService {

    private static HashMap<String, BankAccount> handledAccounts = new HashMap<>();

    public BankAccountService() {
        this.fillWithBSContent();
    }

    public BankAccount getBankAccount(String accountOwner) {
        return handledAccounts.get(accountOwner);
    }

    public static List<String> getAllBankAccounts() {
        List<String> listToGo = new ArrayList<>();
        String tempAccount;
        for (HashMap.Entry entry : handledAccounts.entrySet()) {
            tempAccount = entry.getKey() + " " + entry.getValue().toString();
            listToGo.add(tempAccount);
        }
        return listToGo;
    }

    public void addBankAccount(String name, BankAccount bankAccount) {
        handledAccounts.put(name, bankAccount);
    }

    public static void fillWithBSContent() {
        handledAccounts.put("Simba",new BankAccount(2000.0, "lion"));
        handledAccounts.put("Zazu",new BankAccount(450.0, "hornbill"));
        handledAccounts.put("Pumba",new BankAccount(0.0, "warthog"));
        handledAccounts.put("Zordon",new BankAccount(5000.0, "lion"));
        handledAccounts.put("Kiara",new BankAccount(800.0, "lion"));
    }

}
