package br.com.codebank.controller;

import br.com.codebank.model.CustomerModel;
import br.com.codebank.service.CustomerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerModel> create (@RequestBody @NotNull CustomerModel customer){
        return ResponseEntity.ok(customerService.create(customer));
    }

    @PutMapping
    public ResponseEntity<CustomerModel> update(@RequestBody CustomerModel customer) {
        return ResponseEntity.ok(customerService.update(customer));
    }

    @DeleteMapping("/{id}")//Deletar para fins de teste
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }

    @GetMapping ("/cpf/{cpf}")
    public ResponseEntity<CustomerModel> findByCpf (@PathVariable String cpf){
        Optional<CustomerModel> optional = customerService.findByCpf(cpf);
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping ("/id/{id}")
    public ResponseEntity<CustomerModel> findById (@PathVariable Long id){
        Optional<CustomerModel> optional = Optional.ofNullable(customerService.findById(id));
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping()
    public List<CustomerModel> list(){
        return customerService.list();
    }
}
