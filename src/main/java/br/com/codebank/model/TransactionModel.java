package br.com.codebank.model;


import java.util.Date;

public class TransactionModel {
    private int idTransaction;
    private Date date;
    private double amount;
    private AccountModel idDestinyAccount;
    private AccountModel idOriginAccount;

    public TransactionModel(int idTransaction, Date date, double amount,
                            AccountModel idDestinyAccount, AccountModel idOriginAccount) {
        /* alterando de this.idAccount = idAccountpara this.setIDAccount(idAccount) para que regras
        definidas nos métodos de entrada (setters) sejam aplicadas também quando for utilizado
        o método construtor */
        this.setIdTransaction(idTransaction);
        this.setDate(date);
        this.setAmount(amount);
        this.setIdDestinyAccount(idDestinyAccount);
        this.setIdOriginAccount(idOriginAccount);
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountModel getIdDestinyAccount() {
        return idDestinyAccount;
    }

    public void setIdDestinyAccount(AccountModel idDestinyAccount) {
        this.idDestinyAccount = idDestinyAccount;
    }

    public AccountModel getIdOriginAccount() {
        return idOriginAccount;
    }

    public void setIdOriginAccount(AccountModel idOriginAccount) {
        this.idOriginAccount = idOriginAccount;
    }

}

