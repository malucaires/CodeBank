package br.com.codebank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "ACC_SEQ", sequenceName = "ACCOUNT_SEQ", initialValue = 1000, allocationSize = 1)
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long idAccount;
    @Column(unique = true, insertable = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACC_SEQ")
    private int accountNumber;
    @Column(insertable = true, updatable = false)
    private int agencyNumber;
    private Boolean status;

    private float balance;
    @OneToOne
    @JoinColumn(name = "customer_id_customer")
    private CustomerModel customer;
    @OneToMany
    List<TransactionModel> transaction = new ArrayList<>();

    public void setBalance(float balance) {
        if (this.getStatus()==true){
            this.balance = balance;
        }else {
            System.out.println("Conta inativa! Operação não realizada");
        }
    }

    public void replaceStatus(Boolean status) {
        this.status = status;
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

