package com.greenfoxacademy.bankofsimba.Service;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountService {

    private static ArrayList<BankAccount> handledAccounts = new ArrayList<>();

    public BankAccountService() {
        this.fillWithBSContent();
    }

    public BankAccount getBankAccount(String accountOwner) {
        boolean ownerExist = false;
        BankAccount itsTheOne = null;
        for (int i = 0; i < handledAccounts.size(); i++) {
            if (handledAccounts.get(i).getOwner().equals(accountOwner)) {
                ownerExist = true;
                itsTheOne = handledAccounts.get(i);
                break;
            }
        }
        if (ownerExist) {
            return itsTheOne;
        } else {
            return null;
        }
    }

    public static ArrayList<BankAccount> getAllBankAccounts() {
        return handledAccounts;
    }

    public void addBankAccount(BankAccount bankAccount) {
        handledAccounts.add(bankAccount);
    }

    public static void fillWithBSContent() {
        handledAccounts.add(new BankAccount("Simba", 2000.0, "lion", true, true));
        handledAccounts.add(new BankAccount("Zazu", 450.0, "hornbill", false, true));
        handledAccounts.add(new BankAccount("Pumba", 0.0, "warthog", false, true));
        handledAccounts.add(new BankAccount("Zordon", 5000.0, "lion", true, false));
        handledAccounts.add(new BankAccount("Kiara", 800.0, "lion", false, true));
    }

}
