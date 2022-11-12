package br.com.codebank.model;

import java.util.ArrayList;
import java.util.List;

public class AccountModel {
    private int idAccount;
    private int accountNumber;
    private int agencyNumber;
    private Boolean status;
    private String address;
    private double balance;
    private CustomerModel customer;
    List<TransactionModel> transaction = new ArrayList<>();

    //Construtor
    public AccountModel(int idAccount, int accountNumber, int agencyNumber, Boolean status, String address,
                            double balance) {
        this.idAccount = idAccount;
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.status = status;
        this.address = address;
        this.balance = balance;

    }

    public AccountModel() {

    }

    // Getters e setters
        public int getIdAccount() {
            return idAccount;
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
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
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
                    ", address='" + address + '\'' +
                    ", balance=" + balance +
                    ", customer=" + customer +
                    ", transaction=" + transaction +
                    '}';
        }
    }

