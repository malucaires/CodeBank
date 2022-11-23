package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountModel> create (@RequestBody AccountModel account){
        return ResponseEntity.ok(accountService.create(account));
    }

    @PutMapping
    public ResponseEntity<AccountModel> update (@RequestBody AccountModel account){
        return ResponseEntity.ok(accountService.update(account));
    }

    @DeleteMapping("/{id}") //Deletar para fins de teste
    public void delete(@PathVariable Long id){
        accountService.delete(id);
    }

    @GetMapping ("/accountnumber/{accountNumber}")
    public ResponseEntity<AccountModel> findByAccountNumber(@PathVariable int accountNumber){
        Optional<AccountModel> optional = accountService.findByAccountNumber(accountNumber);
        return optional.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping ("/id/{id}")
    public ResponseEntity<AccountModel> findById (@PathVariable Long id){
        Optional<AccountModel> optional = accountService.findById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping ("/status/{status}")
    public ResponseEntity<List<AccountModel>> findByStatus (@PathVariable Boolean status){
        List<AccountModel> listAccountsByStatus = accountService.findByStatus(status);
        return ResponseEntity.ok(listAccountsByStatus);
    }

    @GetMapping
    public List<AccountModel> list(){
        return accountService.list();
    }
}