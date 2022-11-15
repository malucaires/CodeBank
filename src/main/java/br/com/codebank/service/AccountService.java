package br.com.codebank.service;

import br.com.codebank.controller.AccountController;
import br.com.codebank.model.AccountModel;
import org.springframework.stereotype.Component;

@Component
public class AccountService {

    AccountController ac = new AccountController();


    public AccountModel create (AccountModel account){
        AccountModel ac = new AccountModel();

        return ac;
    }



}
