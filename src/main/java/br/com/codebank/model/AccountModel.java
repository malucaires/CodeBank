package br.com.codebank.model;

import java.util.ArrayList;
import java.util.List;

//@Entity Pq essa classe deve virar uma tabela
public class AccountModel {
    private int idAccount;
    private int accountNumber;
    private int agencyNumber;
    private Boolean status;
    private float balance;
    //@OneToOne pq provável que seja one to one na relação entre conta e cliente
    private CustomerModel customer;

    //@OneToMany (mappedBy="idOriginAccount")
    //Uma conta tem várias transações
    //@JsonIgnorePropertis(<nome da propriedade>) utilizado principalmente em listas para impedir loop infinito
    List<TransactionModel> transaction = new ArrayList<>();

    //Construtor
    public AccountModel(int idAccount, int accountNumber, int agencyNumber, Boolean status,
                        float balance) {
        /* alterando de this.idAccount = idAccount para this.setIDAccount(idAccount) para que regras
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
        if (idAccount<=0){
            System.out.println("idAccount inválido");
        }else{
            this.idAccount = idAccount;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber<=0){
            System.out.println("Account Number inválido");
        }else{
            this.accountNumber = accountNumber;
        }
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        if (agencyNumber<=0){
            System.out.println("Agency Number inválido");
        }else{
            this.agencyNumber = agencyNumber;
        }
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if (balance<=0){
            System.out.println("Saldo insuficiente!");
        }else{
            this.balance = balance;
        }
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

