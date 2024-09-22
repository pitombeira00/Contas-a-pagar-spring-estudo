package com.contas.a.pagar.estudo.domain.abstracts;

import com.contas.a.pagar.estudo.domain.validation.ValidationHandler;

public abstract class Validator {

    private final ValidationHandler handler;

    protected Validator(final ValidationHandler ahandler) {
        this.handler = ahandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler;
    }
}
