package com.contas.a.pagar.estudo.domain.exceptions;

import com.contas.a.pagar.estudo.domain.validation.Error;

import java.util.List;

public class DomainException extends RuntimeException{

    private final List<Error> erros;

    private DomainException(final List<Error> anErros) {
        super("", null, true, false);
        this.erros = anErros;
    }

    public static DomainException with(final List<Error> anErros) {
        return new DomainException(anErros);
    }

    public List<Error> getErrors() {
        return this.erros;
    }
}
