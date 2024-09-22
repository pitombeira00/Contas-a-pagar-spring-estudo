package com.contas.a.pagar.estudo.domain.invoice;

import com.contas.a.pagar.estudo.domain.abstracts.Validator;
import com.contas.a.pagar.estudo.domain.validation.ValidationHandler;

public class InvoiceValidator extends Validator {

    private final Invoice invoice;

    protected InvoiceValidator(
            final Invoice aInvoice,
            final ValidationHandler ahandler) {
        super(ahandler);
        this.invoice = aInvoice;
    }

    @Override
    public void validate() {

    }
}
