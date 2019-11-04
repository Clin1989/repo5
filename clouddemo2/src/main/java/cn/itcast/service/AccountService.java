package cn.itcast.service;

import cn.itcast.domain.Account;
import cn.itcast.mapper.IAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private IAccountMapper accountMapper;

    public List<Account> findAll(){
        List<Account> accounts = accountMapper.selectAll();
        return accounts;
    }
    public Account findById(int id){
        Account account = accountMapper.selectByPrimaryKey(id);
        return account;
    }


}
