package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.CustomerModel;
import br.com.codebank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountModel> create (@RequestBody AccountModel account){

        return ResponseEntity.ok(accountService.create(account));

    }


    @PutMapping
    //Cunsulta por parametros (id,accountNumber,status,transação)
    public String update (@RequestBody AccountModel account){

        //return ResponseEntity.ok(accountService.create(account.getIdAccount()));


       // return ResponseEntity.ok(accountService.update(account));

        //lembrar de só atualizar o status
        return "accountService.update(account)";
    }
    @GetMapping ("/FindById/{id}")
    public String findById (@PathVariable Long id){
        System.out.println("Id do cliente a ser pesquisado");
        return "metodo de busca por id";
    }

    @GetMapping ("/FindByAccountNumber/{accountNumber}")
    public String findByAccountNumber (@PathVariable Long accountNumber){
        System.out.println("Número da conta a ser pesquisado");
        return "metodo de busca por account number";
    }

    @GetMapping ("/FindByStatus/{status}")
    public String findByStatus (@PathVariable Boolean status){
        System.out.println("Status a ser pesquisado");
        return "metodo de busca por status";
    }

    @GetMapping ("/FindTransaction/{accountNumber}")
    public String findAllTransactionByAccountNumber (@PathVariable int accountNumber){
        System.out.println("Todas as transações realizadas pelo accountNumber");
        /*
        /Retornar dados da transação (id transacao, data, valor, conta origem ou destino
         */
        return "metodo de busca por accountNumber de todas as transações";
    }

    //Consulta a lista de contas
    @GetMapping
    public List<AccountModel> list(){
        return accountService.list();
    }








}
