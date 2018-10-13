package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.InvoiceResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceDataResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-13T21:59:50.256+02:00")

public class InvoiceDataResource   {
  @JsonProperty("invoice")
  private InvoiceResource invoice = null;

  @JsonProperty("hash")
  private String hash = null;

  public InvoiceDataResource invoice(InvoiceResource invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InvoiceResource getInvoice() {
    return invoice;
  }

  public void setInvoice(InvoiceResource invoice) {
    this.invoice = invoice;
  }

  public InvoiceDataResource hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(value = "")


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDataResource invoiceData = (InvoiceDataResource) o;
    return Objects.equals(this.invoice, invoiceData.invoice) &&
        Objects.equals(this.hash, invoiceData.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDataResource {\n");
    
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

