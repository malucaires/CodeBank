package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Account")
public class AccountController {

    //private AccountService accountService;

    @PostMapping
    public String create (@RequestBody AccountModel account){

        System.out.println(account.getIdAccount());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAgencyNumber());
        System.out.println(account.getStatus());
        System.out.println(account.getBalance());

        return "Metodo de create";

        //return accountService.create(account);
    }


    @PutMapping
    public String update (@RequestBody AccountModel account){
        //lembrar de só atualizar o status
        return "Medoto de update";
         //return accountService.update(account);
    }

    @GetMapping ("/FindById/{id}")
    public String findById (@PathVariable Long id){
        System.out.println("id do cliente a ser pesquisado");
        return "metodo de busca por id";
    }

    @GetMapping ("/FindByAccountNumber/{accountNumber}")
    public String findByAccountNumber (@PathVariable Long accountNumber){
        System.out.println("account number a ser pesquisado");
        return "metodo de busca por account number";
    }

    @GetMapping ("/FindByStatus/{status}")
    public String findByStatus (@PathVariable Boolean status){
        System.out.println("status a ser pesquisado");
        return "metodo de busca por status";
    }

    @GetMapping ("/FindTransaction/{accountNumber}")
    public String findAllTransactionByAccountNumber (@PathVariable int accountNumber){
        System.out.println("todas as transações realizadas pelo accountNumber");
        /*
        /Retornar dados da transação (id transacao, data, valor, conta origem ou destino
         */
        return "metodo de busca por accountNumber de todas as transações";
    }








}
