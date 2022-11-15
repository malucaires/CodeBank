package br.com.codebank.model;

import java.time.LocalDate;

//@Entity Pq essa classe deve virar uma tabela
public class CustomerModel {
    private int idCustomer;
    private String name;
    private String socialName;
    private String gender;
    private String address;
    private LocalDate birthDate;
    private String cpf;
    private String phoneNumber;

    //@OneToOne pq provável que seja one to one na relação entre conta e cliente
    private AccountModel account;

    //Construtor
    public CustomerModel(int idCustomer, String name, String socialName, String gender, String address,
                         LocalDate birthDate, String cpf, String phoneNumber, AccountModel account) {
        /* alterando de this.idAccount = idAccount para this.setIDAccount(idAccount) para que regras
        definidas nos métodos de entrada (setters) sejam aplicadas também quando for utilizado
        o método construtor */

        this.setIdCustomer(idCustomer);
        this.setName(name);
        this.setSocialName(socialName);
        this.setGender(gender);
        this.setAddress(address);
        this.setBirthDate(birthDate);
        this.setCpf(cpf);
        this.setPhoneNumber(phoneNumber);
        this.setAccount(account);
    }
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
            System.out.println("Name é um campo obrigatório");
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
            System.out.println("Phone Number é um campo obrigatório");
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

