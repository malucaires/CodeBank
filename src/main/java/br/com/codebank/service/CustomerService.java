package br.com.codebank.service;

import br.com.codebank.controller.CustomerController;
import br.com.codebank.model.CustomerModel;
import br.com.codebank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerModel create (CustomerModel customer){ //criar
        return customerRepository.save(customer);
    }

    public CustomerModel update (CustomerModel customer){ //alterar
        return customerRepository.save(customer);
    }

    public CustomerModel findById(Long idCustomer){
        return customerRepository.findById(idCustomer).get();
    }

    public List<CustomerModel> list(){
        return customerRepository.findAll();
    }
}
