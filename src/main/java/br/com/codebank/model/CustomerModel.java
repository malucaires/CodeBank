package br.com.codebank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerModel {
    @Id
    @GeneratedValue
    private Long idCustomer;
    private String name;
    private String socialName;
    private String gender;
    @Embedded
    private AddressModel address;
    private LocalDate birthDate;
    private String cpf;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "account_id")
    private AccountModel account;

    public AddressModel getAddress() {
        return address;
    }



}

