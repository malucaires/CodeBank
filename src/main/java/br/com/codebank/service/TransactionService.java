package br.com.codebank.service;

import br.com.codebank.model.TransactionModel;
import br.com.codebank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionModel create(TransactionModel transaction){
        return transactionRepository.save(transaction);
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
