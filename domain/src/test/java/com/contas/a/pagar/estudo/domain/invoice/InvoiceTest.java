package com.contas.a.pagar.estudo.domain.invoice;

import com.contas.a.pagar.estudo.domain.enums.StatusInvoice;
import com.contas.a.pagar.estudo.domain.exceptions.DomainException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvoiceTest {

    @Test
    public void testNewInvoice() {

        final var actualInvoice = Invoice.newInvoice(
                20.0,
                "descricao",
                StatusInvoice.NEW
        );

        Assertions.assertNotNull(actualInvoice);
    }

    @Test
    public void givenInvoice_whenNewInvoice_thenReturnInvoice() {

        final var actualInvoice = Invoice.newInvoice(
                20.0,
                "descricao",
                StatusInvoice.NEW
        );

        Assertions.assertNotNull(actualInvoice);
        Assertions.assertInstanceOf(Invoice.class, actualInvoice);
    }

    @Test
    public void givenInvoice_whenNewInvoice_thenReturnValueMustBeBiggerThanZeroInvoice() {

        final var expectedValue = 0;
        final var expectedErrorCount = 1;
        final var expectedErrorMessage = "'value' should not be empty";
        final var expectedDescription = "pagamento de salário";
        final var expectedIsNew = StatusInvoice.NEW;

        final var actualCategory =
                Invoice.newInvoice(expectedValue, expectedDescription, expectedIsNew);

        final var actualException =
                Assertions.assertThrows(DomainException.class, () -> actualCategory.validate(new ThrowsValidationHandler()));

        Assertions.assertEquals(expectedErrorCount, actualException.getErrors().size());
        Assertions.assertEquals(expectedErrorMessage, actualException.getErrors().get(0).message());
    }
}