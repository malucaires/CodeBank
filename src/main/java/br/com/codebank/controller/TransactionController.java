package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.model.CustomerModel;
import br.com.codebank.model.TransactionModel;
import br.com.codebank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        transactionService.delete(id);
    }
    @PostMapping
    public ResponseEntity<TransactionModel> create (@RequestBody TransactionModel transaction){
        return ResponseEntity.ok(transactionService.create(transaction));
    }

    @GetMapping ("/id/{id}")
    public ResponseEntity<TransactionModel> findById (@PathVariable Long id){
        Optional<TransactionModel> optional = Optional.ofNullable(transactionService.findById(id));

        //Verificação se o accountNumber existe
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping ("/transactions")
    public ResponseEntity<List<TransactionModel>> viewAllTransactions (){
        return ResponseEntity.ok(transactionService.list());
    }

    @GetMapping ("/findtransaction/{id}")
    public ResponseEntity<List<TransactionModel>> findAllTransactionById (@PathVariable Long id){
        List<TransactionModel> listTransactionByIdOrigin = transactionService.findByIdAccount(id);
        return ResponseEntity.ok(listTransactionByIdOrigin);
    }
}
