package com.stackoverflow;

import com.stackoverflow.aspect.AccountInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public TestController(AccountInterface accountInterface) {
        this.accountInterface = accountInterface;
    }

    private final AccountInterface accountInterface;

    @GetMapping
    public String test(){
        accountInterface.withdraw(10);
        return "test";
    }
}
