package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ResponseBody
    public List<Account> findAll(){
        List<Account> accounts = accountService.findAll();
        return accounts;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Account findById(@PathVariable("id")int id){
       Account account = accountService.findById(id);
        return account;
    }


}
