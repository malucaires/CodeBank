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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSocialName() {
            return socialName;
        }

        public void setSocialName(String socialName) {
            this.socialName = socialName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
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
            this.cpf = cpf;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


    }

