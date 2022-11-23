package br.com.codebank.service;

import br.com.codebank.model.AccountModel;
import br.com.codebank.repository.AccountRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public AccountModel replace (AccountModel account){
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

    public @NotNull List<AccountModel> findByStatus(boolean status){
        List<AccountModel> accountsall = accountRepository.findAll();
        List<AccountModel> accountsByStatus = accountsall.stream().
                filter(p -> p.getStatus() == status).collect(Collectors.toList());
        return accountsByStatus;
    }

    public List<AccountModel> list(){
        return accountRepository.findAll();
    }

}
