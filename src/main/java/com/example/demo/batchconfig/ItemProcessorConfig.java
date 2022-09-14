package com.example.demo.batchconfig;

import com.example.demo.entity.BankTransaction;
import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemProcessor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component
public class ItemProcessorConfig implements ItemProcessor<BankTransaction,BankTransaction> {
    private DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy-HH:mm");
    @Override
    public BankTransaction process(BankTransaction bankTransaction) throws Exception {
        bankTransaction.setTransactionDate(dateFormat.parse(bankTransaction.getStrTransactionDate()));
        return bankTransaction;
    }






















}
