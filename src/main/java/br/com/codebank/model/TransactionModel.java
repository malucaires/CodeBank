package br.com.codebank.model;


import java.util.Date;

public class TransactionModel {
    private int idTransaction;
    private Date date;
    private float amount;
    private AccountModel idDestinyAccount;
    private AccountModel idOriginAccount;

    public TransactionModel(int idTransaction, Date date, float amount,
                            AccountModel idDestinyAccount, AccountModel idOriginAccount) {
        /* alterando de this.idAccount = idAccount para this.setIDAccount(idAccount) para que regras
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
        if (idTransaction<=0){
            System.out.println("idTransaction inválido");
        }else{
            this.idTransaction = idTransaction;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        if (amount<=0){
            System.out.println("amount inválido");
        }else{
            this.amount = amount;
        }
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

