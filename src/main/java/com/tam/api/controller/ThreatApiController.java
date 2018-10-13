package com.tam.api.controller;

import com.tam.api.ThreatApi;
import com.tam.model.ThreatModelResource;
import com.tam.repositories.ThreatModelRepository;
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

@EnableAutoConfiguration
@RestController
@AllArgsConstructor
public class ThreatApiController implements ThreatApi {

    @Autowired
    private ThreatModelRepository threatModelRepository;

    @Override
    @CrossOrigin
    public ResponseEntity<Void> saveThreatModel(@ApiParam(value = "Threat Model"  )  @Valid @RequestBody ThreatModelResource body) {
        // TODO: Validate
        this.threatModelRepository.save(body);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
