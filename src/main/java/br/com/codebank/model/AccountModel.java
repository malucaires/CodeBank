package br.com.codebank.model;

import java.util.ArrayList;
import java.util.List;

public class AccountModel {
    private int idAccount;
    private int accountNumber;
    private int agencyNumber;
    private Boolean status;
    private double balance;
    private CustomerModel customer;
    List<TransactionModel> transaction = new ArrayList<>();

    //Construtor
    public AccountModel(int idAccount, int accountNumber, int agencyNumber, Boolean status,
                        double balance) {
        /* alterando de this.idAccount = idAccountpara this.setIDAccount(idAccount) para que regras
         definidas nos métodos de entrada (setters) sejam aplicadas também quando for utilizado
         o método construtor */
        this.setIdAccount(idAccount);
        this.setAccountNumber(accountNumber);
        this.setAgencyNumber(agencyNumber);
        this.setStatus(status);
        this.setBalance(balance);
    }

    public AccountModel() {

    }

    // Getters e setters
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }

    public List<TransactionModel> getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "idAccount=" + idAccount +
                ", accountNumber=" + accountNumber +
                ", agencyNumber=" + agencyNumber +
                ", status=" + status +
                ", balance=" + balance +
                ", customer=" + customer +
                ", transaction=" + transaction +
                '}';
    }
}

