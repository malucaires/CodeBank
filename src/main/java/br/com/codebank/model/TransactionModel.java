package br.com.codebank.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TransactionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long idTransaction;
    private Date date;
    private float amount;
    @ManyToOne
    @JoinColumn(name = "id_destiny_account_id")
    private AccountModel idDestinyAccount;
    @ManyToOne
    @JoinColumn(name = "id_origin_account_id")
    private AccountModel idOriginAccount;

}

