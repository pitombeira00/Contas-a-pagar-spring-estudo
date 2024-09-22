package com.contas.a.pagar.estudo.application;

import com.contas.a.pagar.estudo.domain.invoice.Invoice;

public class UseCase {

    public Invoice execute() {
        return new Invoice();
    }
}