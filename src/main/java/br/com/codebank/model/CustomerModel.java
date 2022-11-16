package br.com.codebank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

//@Entity Pq essa classe deve virar uma tabela
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CustomerModel {
    @Id
    @GeneratedValue
    private int idCustomer;
    private String name;
    private String socialName;
    private String gender;
    @Embedded
    private String address;
    private LocalDate birthDate;
    private String cpf;
    private String phoneNumber;

    //@OneToOne pq provável que seja one to one na relação entre conta e cliente
    @OneToOne
    @JoinColumn(name = "account_id")
    private AccountModel account;

    //Getters e setters
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        if (idCustomer<=0){
            System.out.println("idCustomer inválido");
        }else{
            this.idCustomer = idCustomer;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Nome é um campo obrigatório");
        } else {
            this.name = name.toUpperCase();
        }
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName.toUpperCase();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.toUpperCase();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.isBlank()) {
            System.out.println("Address é um campo obrigatório");
        } else {
            this.address = address.toUpperCase();
        }
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isBlank()) {
            System.out.println("CPF é um campo obrigatório");
        } else {
            this.cpf = cpf.toUpperCase();
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.isBlank()) {
            System.out.println("Numero de telefone é um campo obrigatório");
        } else {
            this.phoneNumber = phoneNumber.toUpperCase();
        }
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }


}

