package com.contas.a.pagar.estudo.domain.abstracts;

public abstract class Aggregate<ID extends Identifier> extends Entity<ID> {

    protected Aggregate(final ID id) {
        super(id);
    }
}
