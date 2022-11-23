package br.com.codebank.service;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.TransactionModel;
import br.com.codebank.repository.AccountRepository;
import br.com.codebank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private AccountRepository accountRepository;




    public TransactionModel create(TransactionModel transaction){
        if (transaction.getAmount()<=0){
            System.out.println("Valor inválido!");
            return null;
        }else{
            AccountModel amOrigin = accountRepository.findById(transaction.getIdOriginAccount().getIdAccount()).get();
            AccountModel amDestiny = accountRepository.findById(transaction.getIdDestinyAccount().getIdAccount()).get();
            if (transaction.getAmount()>amOrigin.getBalance()){
                System.out.println("Saldo insuficiente!");
                return null;
            }else{
                float balanceOrigem = amOrigin.getBalance()-transaction.getAmount();
                amOrigin.setBalance(balanceOrigem);
                System.out.println(balanceOrigem);
                System.out.println("exibindo o valor que vai ficar a conta de destino");
                float balanceDestiny = amDestiny.getBalance()+transaction.getAmount();
                amDestiny.setBalance(balanceDestiny);
                System.out.println(balanceDestiny);

                System.out.println(amOrigin);
                System.out.println(amDestiny);

                accountRepository.save(amOrigin);
                accountRepository.save(amDestiny);

                return transactionRepository.save(transaction);

                }
            }
    }



    public void delete (Long id){
        transactionRepository.deleteById(id);
    }

    public TransactionModel findById(Long idTransaction){
        return transactionRepository.findById(idTransaction).get();
    }

    public List<TransactionModel> list(){
        return transactionRepository.findAll();
    }

}
