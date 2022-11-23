package br.com.codebank.service;

import br.com.codebank.model.AccountModel;
import br.com.codebank.repository.AccountRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
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
    }

    public void delete(Long id) { // deletar para fins de
        accountRepository.deleteById(id);
    }

    public @NotNull Optional<AccountModel> findById(Long idAccount){
        return accountRepository.findById(idAccount);
    }

   public @NotNull Optional<AccountModel> findByAccountNumber(int accountNumber){
        return accountRepository.findByAccountNumber(accountNumber);
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
