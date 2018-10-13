package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.ProductResource;
import com.tam.model.SellerResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvoiceResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-13T21:59:50.256+02:00")

public class InvoiceResource   {
  @JsonProperty("billNo")
  private Integer billNo = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("totalCostBrutto")
  private Integer totalCostBrutto = null;

  @JsonProperty("totalCostNetto")
  private Integer totalCostNetto = null;

  @JsonProperty("customerPaid")
  private Integer customerPaid = null;

  @JsonProperty("tax")
  private BigDecimal tax = null;

  @JsonProperty("seller")
  private SellerResource seller = null;

  @JsonProperty("products")
  @Valid
  private List<ProductResource> products = null;

  public InvoiceResource billNo(Integer billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * Get billNo
   * @return billNo
  **/
  @ApiModelProperty(value = "")


  public Integer getBillNo() {
    return billNo;
  }

  public void setBillNo(Integer billNo) {
    this.billNo = billNo;
  }

  public InvoiceResource date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InvoiceResource totalCostBrutto(Integer totalCostBrutto) {
    this.totalCostBrutto = totalCostBrutto;
    return this;
  }

  /**
   * Get totalCostBrutto
   * @return totalCostBrutto
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalCostBrutto() {
    return totalCostBrutto;
  }

  public void setTotalCostBrutto(Integer totalCostBrutto) {
    this.totalCostBrutto = totalCostBrutto;
  }

  public InvoiceResource totalCostNetto(Integer totalCostNetto) {
    this.totalCostNetto = totalCostNetto;
    return this;
  }

  /**
   * Get totalCostNetto
   * @return totalCostNetto
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalCostNetto() {
    return totalCostNetto;
  }

  public void setTotalCostNetto(Integer totalCostNetto) {
    this.totalCostNetto = totalCostNetto;
  }

  public InvoiceResource customerPaid(Integer customerPaid) {
    this.customerPaid = customerPaid;
    return this;
  }

  /**
   * Get customerPaid
   * @return customerPaid
  **/
  @ApiModelProperty(value = "")


  public Integer getCustomerPaid() {
    return customerPaid;
  }

  public void setCustomerPaid(Integer customerPaid) {
    this.customerPaid = customerPaid;
  }

  public InvoiceResource tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  public InvoiceResource seller(SellerResource seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SellerResource getSeller() {
    return seller;
  }

  public void setSeller(SellerResource seller) {
    this.seller = seller;
  }

  public InvoiceResource products(List<ProductResource> products) {
    this.products = products;
    return this;
  }

  public InvoiceResource addProductsItem(ProductResource productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductResource> getProducts() {
    return products;
  }

  public void setProducts(List<ProductResource> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceResource invoice = (InvoiceResource) o;
    return Objects.equals(this.billNo, invoice.billNo) &&
        Objects.equals(this.date, invoice.date) &&
        Objects.equals(this.totalCostBrutto, invoice.totalCostBrutto) &&
        Objects.equals(this.totalCostNetto, invoice.totalCostNetto) &&
        Objects.equals(this.customerPaid, invoice.customerPaid) &&
        Objects.equals(this.tax, invoice.tax) &&
        Objects.equals(this.seller, invoice.seller) &&
        Objects.equals(this.products, invoice.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billNo, date, totalCostBrutto, totalCostNetto, customerPaid, tax, seller, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceResource {\n");
    
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalCostBrutto: ").append(toIndentedString(totalCostBrutto)).append("\n");
    sb.append("    totalCostNetto: ").append(toIndentedString(totalCostNetto)).append("\n");
    sb.append("    customerPaid: ").append(toIndentedString(customerPaid)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

