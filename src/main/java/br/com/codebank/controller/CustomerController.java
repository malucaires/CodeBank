package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.CustomerModel;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @PostMapping
    public String create (@RequestBody CustomerModel customer){

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

    @PutMapping
    public String update (@RequestBody CustomerModel customer){
        return "Medoto de update";
    }

    @GetMapping ("/FindByName/{name}")
    public String findByName (@PathVariable String name){
        System.out.println("name a ser pesquisado");
        return "metodo de busca por nameCustomer";
    }

    @GetMapping ("/FindById/{id}")
    public String findById (@PathVariable int id){
        System.out.println("id a ser pesquisado");
        return "metodo de busca por idCustomer";
    }

    @GetMapping ("/FindByCPF/{cpf}")
    public String findByCpf (@PathVariable String cpf){
        System.out.println("cpf a ser pesquisado");
        return "metodo de busca por cpf";
    }



}
