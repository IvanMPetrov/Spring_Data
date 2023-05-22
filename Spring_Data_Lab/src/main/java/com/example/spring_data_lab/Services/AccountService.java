package com.example.spring_data_lab.Services;

import java.math.BigDecimal;

public interface AccountService {

    void withdrawMoney(BigDecimal amount, int id);

    void transferMoney(BigDecimal amount, int idFrom, int idTo);
}
