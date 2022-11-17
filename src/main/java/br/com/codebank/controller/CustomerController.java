package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.CustomerModel;
import br.com.codebank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService; //Atributo privado

    @PostMapping // Criar cadastro
    public String create (@RequestBody CustomerModel customer){ //metodo create que vai receber o objeto customer

        System.out.println(customer.getIdCustomer());
        System.out.println(customer.getName());
        System.out.println(customer.getSocialName());
        System.out.println(customer.getGender());
        System.out.println(customer.getAddress());
        System.out.println(customer.getBirthDate());
        System.out.println(customer.getCpf());
        System.out.println(customer.getPhoneNumber());

        return "Metodo de create";

    }

    @PutMapping //Alterar cadastro
    public String update (@RequestBody CustomerModel customer){
        return "Medoto de update";
    }

    //Consultas por parametros
    //@GetMapping ("/Name/{name}")
    //public String findByName (@PathVariable String name){
    //System.out.println("name a ser pesquisado");
    //return "metodo de busca por nameCustomer";
    //}

    @GetMapping ("/Id/{id}")
    public String findById (@PathVariable int id){
        System.out.println("id a ser pesquisado");
        return "metodo de busca por idCustomer";
    }

    @GetMapping ("/CPF/{cpf}")
    public String findByCpf (@PathVariable String cpf){
        System.out.println("cpf a ser pesquisado");
        return "metodo de busca por cpf";
    }

    //Consulta por listas
    @GetMapping()
    public List<CustomerModel> list(){
        return customerService.list();
    }



}
