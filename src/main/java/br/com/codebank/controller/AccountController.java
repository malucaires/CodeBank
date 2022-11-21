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

    @DeleteMapping("/{id}") // Deletar para fins de teste apenas
    public ResponseEntity<?>delete(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok().build();
    }

    //Cunsulta por parametros (id,accountNumber,status,transação)
    @GetMapping ("/id/{id}")
    public ResponseEntity<AccountModel> findById (@PathVariable Long idAccount){
        Optional<AccountModel> optional = AccountService.findById(idAccount);

        return optional.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping ("/accountNumber/{accountNumber}")
    public ResponseEntity<AccountModel> findByAccountNumber(@PathVariable Long accountNumber){
        Optional<AccountModel> optional = accountService.findByAccountNumber(accountNumber);

        //Verificação se o accountNumber existe
        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /*
    public String findByAccountNumber (@PathVariable Long accountNumber){
        //System.out.println("Número da conta a ser pesquisado");
        //return "metodo de busca por account number";

        return null;
    } */

    @GetMapping ("/Status/{status}")
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
