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
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping // Criar
    public ResponseEntity<CustomerModel> create (@RequestBody @NotNull CustomerModel customer){
        return ResponseEntity.ok(customerService.create(customer));

    }

    @PutMapping //Alterar
    public ResponseEntity<CustomerModel> update(@RequestBody CustomerModel customer) {
        return ResponseEntity.ok(customerService.update(customer));
    }

    /*@DeleteMapping("/{id}") // Deletar para fiz de teste apenas
    public ResponseEntity<?>delete(@PathVariable Long idCustomer) throws Exception{
        return ResponseEntity.ok().build();
    }*/

    @DeleteMapping("/{id}")//Deletar para fins de teste
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }

    //Consultas por parametros
    //@GetMapping ("/Name/{name}")
    //public String findByName (@PathVariable String name){
    //System.out.println("name a ser pesquisado");
    //return "metodo de busca por nameCustomer";
    //}

    @GetMapping ("/Id/{id}")
    public ResponseEntity<CustomerModel> findById (@PathVariable Long id){
        Optional<CustomerModel> optional = Optional.ofNullable(customerService.findById(id));

        //Verificação se o Id existe
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       // System.out.println("id a ser pesquisado");
       // return "metodo de busca por idCustomer";
    }

    @GetMapping ("/CPF/{cpf}")
    public ResponseEntity<CustomerModel> findByCpf (@PathVariable String cpf){
        Optional<CustomerModel> optional = customerService.findByCpf(cpf);

        //Verificação se o Id existe
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

       // System.out.println("cpf a ser pesquisado");
        // return "metodo de busca por cpf";
    }

    //Consulta por listas
    @GetMapping()
    public List<CustomerModel> list(){
        return customerService.list();
    }



}
