package br.com.codebank.model;

import java.util.Date;

public class CustomerModel {
        private int idCustomer;
        private String name;
        private String socialName;
        private String gender;
        private String address;
        private Date birthDate;
        private String cpf;
        private String phoneNumber;
        private AccountModel account;

        //Construtor
        public CustomerModel(int idCustomer, String name, String socialName, String gender, String address,
                             Date birthDate, String cpf, String phoneNumber, AccountModel account) {
            this.idCustomer = idCustomer;
            this.name = name;
            this.socialName = socialName;
            this.gender = gender;
            this.address = address;
            this.birthDate = birthDate;
            this.cpf = cpf;
            this.phoneNumber = phoneNumber;
            this.account = account;
        }
        //Getters e setters
        public int getIdCustomer() {
            return idCustomer;
        }

        public void setIdCustomer(int idCustomer) {
            this.idCustomer = idCustomer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.isBlank()){
                System.out.println("Name é um campo obrigatório");
            }else{
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
            if (address.isBlank()){
                System.out.println("Address é um campo obrigatório");
            }else{
                this.address = address.toUpperCase();
            }
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public String getCpf() {

            return cpf;
        }

        public void setCpf(String cpf) {
            if (cpf.isBlank()){
                System.out.println("CPF é um campo obrigatório");
            }else{
                this.cpf = cpf.toUpperCase();
            }
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            if (phoneNumber.isBlank()){
                System.out.println("Phone Number é um campo obrigatório");
            }else{
                this.phoneNumber = phoneNumber.toUpperCase();
            }
        }


    }

