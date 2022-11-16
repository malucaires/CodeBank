package br.com.codebank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity Pq essa classe deve virar uma tabela
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private int idAccount;
    private int accountNumber;
    private int agencyNumber;
    private Boolean status;
    private static float balance;


    //@OneToOne pq provável que seja one to one na relação entre conta e cliente
    @OneToOne
    @JoinColumn(name = "customer_id_customer")
    private CustomerModel customer;

    public void balance(float balance){
        this.balance = balance;

    }

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

    // Getters e setters
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        if (idAccount<=0){
            System.out.println("Id da conta inválido");
        }else{
            this.idAccount = idAccount;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber<=0){
            System.out.println("Número da conta inválido");
        }else{
            this.accountNumber = accountNumber;
        }
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        if (agencyNumber<=0){
            System.out.println("Número da agência inválido");
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

    public static float getBalance() {
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

