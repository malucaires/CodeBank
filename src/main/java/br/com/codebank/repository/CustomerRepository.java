package br.com.codebank.repository;

import br.com.codebank.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

    //criar método findByCpf

}
