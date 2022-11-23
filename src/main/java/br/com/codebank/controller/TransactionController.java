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
@RequestMapping("/Transaction")
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

    @GetMapping ("/Id/{id}")
    public ResponseEntity<TransactionModel> findById (@PathVariable Long id){
        Optional<TransactionModel> optional = Optional.ofNullable(transactionService.findById(id));

        //Verificação se o accountNumber existe
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping ("/Transactions")
    public ResponseEntity<List<TransactionModel>> viewAllTransactions (){
        return ResponseEntity.ok(transactionService.list());

    }
}
