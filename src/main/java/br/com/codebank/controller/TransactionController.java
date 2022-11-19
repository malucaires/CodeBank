package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.CustomerModel;
import br.com.codebank.model.TransactionModel;
import br.com.codebank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionModel> create (@RequestBody TransactionModel transaction){

        return ResponseEntity.ok(transactionService.create(transaction));


    }

    @GetMapping ("/FindById/{id}")
    public ResponseEntity<TransactionModel> findById (@PathVariable Long id){
        return ResponseEntity.ok(transactionService.findById(id));

    }

    @GetMapping ("/AllTransactions")
    public ResponseEntity<List<TransactionModel>> viewAllTransactions (){
        return ResponseEntity.ok(transactionService.list());

    }





    //private Date date;
    //private AccountModel idDestinyAccount;
    //private AccountModel idOriginAccount;
}
