package br.com.codebank.model;


import java.util.Date;
    public class TransactionModel {
        private int idTransaction;
        private Date date;
        private double amount;
        private AccountModel idDestinyAccount;
        private AccountModel idOriginAccount;

        public TransactionModel(int idTransaction, Date date, double amount,
                                AccountModel idDestinyAccount, AccountModel idOriginAccount) {
            this.idTransaction = idTransaction;
            this.date = date;
            this.amount = amount;
            this.idDestinyAccount = idDestinyAccount;
            this.idOriginAccount = idOriginAccount;
        }

        public int getIdTransaction() {
            return idTransaction;
        }

        public void setIdTransaction(int idTransaction) {
            this.idTransaction = idTransaction;
        }
        public Date getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

    }

