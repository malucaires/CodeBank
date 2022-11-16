package br.com.codebank.service;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.TransactionModel;
import br.com.codebank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountModel create (AccountModel account){
        return accountRepository.save(account);
    }

    public AccountModel findById(Long idAccount){
        return accountRepository.findById(idAccount).get();
    }

    public List<AccountModel> list(){
        return accountRepository.findAll();
    }

}
