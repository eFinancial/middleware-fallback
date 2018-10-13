/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.tam.api;

import com.tam.model.InvoiceDataResource;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-13T22:42:07.745+02:00")

@Api(value = "efi", description = "the efi API")
public interface EfiApi {

    Logger log = LoggerFactory.getLogger(EfiApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Get transactions", nickname = "getInvoices", notes = "Returns all saved transactions", response = InvoiceDataResource.class, responseContainer = "List", tags={ "efi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Got successful", response = InvoiceDataResource.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "There are no transactions") })
    @RequestMapping(value = "/efi/load",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<InvoiceDataResource>> getInvoices() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"invoice\" : {    \"date\" : \"date\",    \"seller\" : {      \"address\" : {        \"zip\" : \"zip\",        \"city\" : \"city\",        \"street\" : \"street\"      },      \"storeIdNr\" : \"storeIdNr\",      \"name\" : \"name\",      \"checkoutLane\" : 2.3021358869347654518833223846741020679473876953125,      \"ustIdNr\" : \"ustIdNr\"    },    \"totalCostNetto\" : 1.46581298050294517310021547018550336360931396484375,    \"customerPaid\" : 5.962133916683182377482808078639209270477294921875,    \"totalCostBrutto\" : 6.02745618307040320615897144307382404804229736328125,    \"tax\" : 5.63737665663332876420099637471139430999755859375,    \"billNo\" : 0,    \"products\" : [ {      \"name\" : \"name\",      \"count\" : 7.061401241503109105224211816675961017608642578125,      \"itemPrice\" : 9.301444243932575517419536481611430644989013671875    }, {      \"name\" : \"name\",      \"count\" : 7.061401241503109105224211816675961017608642578125,      \"itemPrice\" : 9.301444243932575517419536481611430644989013671875    } ]  },  \"hash\" : \"hash\"}, {  \"invoice\" : {    \"date\" : \"date\",    \"seller\" : {      \"address\" : {        \"zip\" : \"zip\",        \"city\" : \"city\",        \"street\" : \"street\"      },      \"storeIdNr\" : \"storeIdNr\",      \"name\" : \"name\",      \"checkoutLane\" : 2.3021358869347654518833223846741020679473876953125,      \"ustIdNr\" : \"ustIdNr\"    },    \"totalCostNetto\" : 1.46581298050294517310021547018550336360931396484375,    \"customerPaid\" : 5.962133916683182377482808078639209270477294921875,    \"totalCostBrutto\" : 6.02745618307040320615897144307382404804229736328125,    \"tax\" : 5.63737665663332876420099637471139430999755859375,    \"billNo\" : 0,    \"products\" : [ {      \"name\" : \"name\",      \"count\" : 7.061401241503109105224211816675961017608642578125,      \"itemPrice\" : 9.301444243932575517419536481611430644989013671875    }, {      \"name\" : \"name\",      \"count\" : 7.061401241503109105224211816675961017608642578125,      \"itemPrice\" : 9.301444243932575517419536481611430644989013671875    } ]  },  \"hash\" : \"hash\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default EfiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Save invoices", nickname = "saveInvoice", notes = "Save invoices", tags={ "efi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created Invoice"),
        @ApiResponse(code = 405, message = "Failed to create invoice") })
    @RequestMapping(value = "/efi/save",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> saveInvoice(@ApiParam(value = "Invoice"  )  @Valid @RequestBody InvoiceDataResource body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default EfiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
