package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.CustomerModel;
import br.com.codebank.model.TransactionModel;
import br.com.codebank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/Transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public String create (@RequestBody TransactionModel transaction){

        System.out.println(transaction.getIdTransaction());
        System.out.println(transaction.getDate());
        System.out.println(transaction.getAmount());

        return "Metodo de create";
    }

    @GetMapping ("/FindById/{id}")
    public String findById (@PathVariable int id){
        System.out.println("id a ser pesquisado");
        return "metodo de busca por id";
    }

    @GetMapping ("/AllTransactions")
    public String viewAllTransactions (){
        System.out.println("Exibindo todas as transações");
        return "metodo de exibição de todas as transações";
    }





    //private Date date;
    //private AccountModel idDestinyAccount;
    //private AccountModel idOriginAccount;
}
