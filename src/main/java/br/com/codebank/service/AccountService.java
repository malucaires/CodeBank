package br.com.codebank.service;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.TransactionModel;
import br.com.codebank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountModel create (AccountModel account){
        return accountRepository.save(account);
    }

    public AccountModel update (AccountModel account){
        return accountRepository.save(account);



        /*
        if (account.getIdAccount() == id){
            return accountRepository.save(account);
        }else{
            return ""
        }
        */


        /*
        if{ condição da conta por chamar por id
            if{
                vai determinar se quer mudar o status
                        se for qualquer outra coisa, retornar null
            }
        }

        */

    }

    public Optional<AccountModel> findById(Long idAccount){
        return accountRepository.findById(idAccount);
    }

/*
    public AccountModel findById(Long idAccount){
        return accountRepository.findById(idAccount).get();
    }
*/
    public List<AccountModel> list(){
        return accountRepository.findAll();
    }

}
