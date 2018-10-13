package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.InvoiceResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceDataResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-13T21:31:05.089+02:00")

public class InvoiceDataResource   {
  @JsonProperty("invoices")
  @Valid
  private List<InvoiceResource> invoices = null;

  @JsonProperty("hash")
  private String hash = null;

  public InvoiceDataResource invoices(List<InvoiceResource> invoices) {
    this.invoices = invoices;
    return this;
  }

  public InvoiceDataResource addInvoicesItem(InvoiceResource invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

  /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<InvoiceResource> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<InvoiceResource> invoices) {
    this.invoices = invoices;
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
    return Objects.equals(this.invoices, invoiceData.invoices) &&
        Objects.equals(this.hash, invoiceData.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDataResource {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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

