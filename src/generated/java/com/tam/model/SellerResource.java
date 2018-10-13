package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.AddressResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SellerResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-13T22:42:07.745+02:00")

public class SellerResource   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ustIdNr")
  private String ustIdNr = null;

  @JsonProperty("storeIdNr")
  private String storeIdNr = null;

  @JsonProperty("checkoutLane")
  private BigDecimal checkoutLane = null;

  @JsonProperty("address")
  private AddressResource address = null;

  public SellerResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SellerResource ustIdNr(String ustIdNr) {
    this.ustIdNr = ustIdNr;
    return this;
  }

  /**
   * Get ustIdNr
   * @return ustIdNr
  **/
  @ApiModelProperty(value = "")


  public String getUstIdNr() {
    return ustIdNr;
  }

  public void setUstIdNr(String ustIdNr) {
    this.ustIdNr = ustIdNr;
  }

  public SellerResource storeIdNr(String storeIdNr) {
    this.storeIdNr = storeIdNr;
    return this;
  }

  /**
   * Get storeIdNr
   * @return storeIdNr
  **/
  @ApiModelProperty(value = "")


  public String getStoreIdNr() {
    return storeIdNr;
  }

  public void setStoreIdNr(String storeIdNr) {
    this.storeIdNr = storeIdNr;
  }

  public SellerResource checkoutLane(BigDecimal checkoutLane) {
    this.checkoutLane = checkoutLane;
    return this;
  }

  /**
   * Get checkoutLane
   * @return checkoutLane
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCheckoutLane() {
    return checkoutLane;
  }

  public void setCheckoutLane(BigDecimal checkoutLane) {
    this.checkoutLane = checkoutLane;
  }

  public SellerResource address(AddressResource address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AddressResource getAddress() {
    return address;
  }

  public void setAddress(AddressResource address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerResource seller = (SellerResource) o;
    return Objects.equals(this.name, seller.name) &&
        Objects.equals(this.ustIdNr, seller.ustIdNr) &&
        Objects.equals(this.storeIdNr, seller.storeIdNr) &&
        Objects.equals(this.checkoutLane, seller.checkoutLane) &&
        Objects.equals(this.address, seller.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ustIdNr, storeIdNr, checkoutLane, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerResource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ustIdNr: ").append(toIndentedString(ustIdNr)).append("\n");
    sb.append("    storeIdNr: ").append(toIndentedString(storeIdNr)).append("\n");
    sb.append("    checkoutLane: ").append(toIndentedString(checkoutLane)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

