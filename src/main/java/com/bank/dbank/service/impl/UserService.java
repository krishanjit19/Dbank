package com.bank.dbank.service.impl;

import com.bank.dbank.dto.*;

public interface UserService {
  BankResponse createAccount(UserRequest userRequest);
  BankResponse balanceEnquiry(EnquiryRequest request);
  String nameEnquiry(EnquiryRequest request);
  BankResponse creditAccount(CreditDebitRequest request);
  BankResponse debitAccount(CreditDebitRequest request);
  BankResponse transfer(TransferRequest request);
}
