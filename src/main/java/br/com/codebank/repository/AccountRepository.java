package br.com.codebank.repository;

import br.com.codebank.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountModel, Long> {

    void delete(Long idAccount);

    Optional<AccountModel> findByAccountNumber(Long accountNumber);
}
