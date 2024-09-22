package com.contas.a.pagar.estudo.domain.invoice;

import com.contas.a.pagar.estudo.domain.abstracts.Aggregate;
import com.contas.a.pagar.estudo.domain.enums.StatusInvoice;
import com.contas.a.pagar.estudo.domain.validation.ValidationHandler;

import java.time.Instant;

public class Invoice  extends Aggregate<InvoiceID> {

    private String id;
    private double valor;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    private StatusInvoice status;

    private Invoice(
            final InvoiceID anId,
            final double anValue,
            final String anDescription,
            final StatusInvoice anStatus,
            final Instant anCreatedAt,
            final Instant anUpdatedAt
    ) {
       super(anId);
        this.valor = anValue;
        this.description = anDescription;
        this.status = anStatus;
        this.createdAt = anCreatedAt;
        this.updatedAt = anUpdatedAt;
    }

    public static Invoice newInvoice(
            final double valor,
            final String descricao,
            final StatusInvoice status
    ) {
        final Instant now = Instant.now();
        final var id = InvoiceID.unique();
        return new Invoice(id, valor, descricao, status, now, now);
    }

    @Override
    public void validate(final ValidationHandler handler) {
        new InvoiceValidator(this, handler).validate();
    }
}