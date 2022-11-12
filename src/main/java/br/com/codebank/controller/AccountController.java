package br.com.codebank.controller;

import br.com.codebank.model.AccountModel;
import br.com.codebank.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Account")
public class AccountController {
    //Account      Get Post Put
    //Customer     Get Post Put
    //Transaction  Get Post Put

    private AccountService accountService;

    @PostMapping
    public AccountModel create (@RequestBody AccountModel account){
        return accountService.create(account);
    }

    //@PutMapping
    //public AccountModel update (@RequestBody AccountModel account){
    //     return accountService.update(account);
    //}

    //@GetMapping ("/{idAccount}")
    //public AccountModel findById (@PathVariable Long id){
    //    return accountService.findById(id);
    //}




}
