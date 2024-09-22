package com.contas.a.pagar.estudo.domain.invoice;

import com.contas.a.pagar.estudo.domain.abstracts.Identifier;

import java.util.Objects;
import java.util.UUID;

public class InvoiceID extends Identifier {

    private final String value;

    private InvoiceID(final String value) {
        this.value = value;
    }

    public static InvoiceID unique() {
        return InvoiceID.from(UUID.randomUUID());
    }

    public static InvoiceID from(final String anID) {
        return new InvoiceID(anID);
    }

    public static InvoiceID from(final UUID anID) {
        return new InvoiceID(anID.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceID invoiceID = (InvoiceID) o;
        return Objects.equals(getValue(), invoiceID.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}
