package br.com.codebank.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

//@Entity Pq essa classe deve virar uma tabela
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TransactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private int idTransaction;
    private Date date;
    private float amount;

    @ManyToOne
    @JoinColumn(name = "id_destiny_account_id")
    private AccountModel idDestinyAccount;

    //@ManyToOne @JoinColumn (name="idAccount") @JoinColumn define
    //Transações estão vinculadas a uma conta origem
    @ManyToOne
    @JoinColumn(name = "id_origin_account_id")
    private AccountModel idOriginAccount;

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
            System.out.println("Valor inválido");
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

