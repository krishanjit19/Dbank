package com.bank.dbank.service.impl;

import com.bank.dbank.dto.EmailDetails;

public interface EmailService {
  void sendEmailAlert(EmailDetails emailDetails);
  void sendEmailWithAttachment(EmailDetails emailDetails);
}
