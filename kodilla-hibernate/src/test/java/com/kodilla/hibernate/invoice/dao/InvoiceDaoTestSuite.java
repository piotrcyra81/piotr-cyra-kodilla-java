package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item1 = new Item(new BigDecimal("100000"), 1, new BigDecimal("100"));
        Item item2 = new Item(new BigDecimal("200000"), 1, new BigDecimal("200"));

        Product product = new Product("Coffee");
        item1.setProduct(product);
        item2.setProduct(product);

        Invoice invoice = new Invoice("Faktura 10/2017");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);

        int idProduct = product.getId();
        int idInvoice = invoice.getId();

        //Then
        Assert.assertNotEquals(0, idProduct);
        Assert.assertNotEquals(0, idInvoice);
        Assert.assertEquals(2,invoice.getItems().size());

        //CleanUp
        productDao.deleteAll();
        invoiceDao.deleteAll();

    }
}