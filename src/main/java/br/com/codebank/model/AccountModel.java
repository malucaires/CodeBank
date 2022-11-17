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
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int idAccount;
    private int accountNumber;
    private int agencyNumber;
    private Boolean status;
    private float balance;
    @OneToOne
    @JoinColumn(name = "customer_id_customer")
    private CustomerModel customer;
    @OneToMany
    List<TransactionModel> transaction = new ArrayList<>();

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

