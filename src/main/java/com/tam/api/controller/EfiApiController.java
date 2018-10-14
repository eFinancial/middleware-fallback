package com.tam.api.controller;

import com.tam.api.EfiApi;
import com.tam.model.InvoiceDataResource;
import com.tam.repositories.EfiRepository;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@EnableAutoConfiguration
@RestController
@AllArgsConstructor
public class EfiApiController implements EfiApi {

    @Autowired
    private EfiRepository efiRepository;

    @Override
    @CrossOrigin
    public ResponseEntity<Void> saveInvoice(@ApiParam(value = "Invoice"  )  @Valid @RequestBody InvoiceDataResource body) {
        InvoiceDataResource oldInvoice = efiRepository.findByHash(body.getHash());
        if (oldInvoice != null) {
            efiRepository.save(body);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @Override
    @CrossOrigin
    public ResponseEntity<List<InvoiceDataResource>> getInvoices() {
        List<InvoiceDataResource> existingInvoices = efiRepository.findAll();
        return new ResponseEntity<>(existingInvoices, HttpStatus.OK);
    }
}
