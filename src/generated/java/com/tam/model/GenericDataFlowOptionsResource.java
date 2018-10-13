package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tam.model.GenericOptionsTrueFalseEnumResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericDataFlowOptionsResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class GenericDataFlowOptionsResource   {
  /**
   * Gets or Sets physicalNetwork
   */
  public enum PhysicalNetworkEnum {
    WIRE("wire"),
    
    WIFI("wifi"),
    
    _2G_4G("2G-4G"),
    
    BLUETOOTH("bluetooth"),
    
    NOTSELECTED("notSelected");

    private String value;

    PhysicalNetworkEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PhysicalNetworkEnum fromValue(String text) {
      for (PhysicalNetworkEnum b : PhysicalNetworkEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("physicalNetwork")
  private PhysicalNetworkEnum physicalNetwork = null;

  @JsonProperty("sourceAuthenticated")
  private GenericOptionsTrueFalseEnumResource sourceAuthenticated = null;

  @JsonProperty("destinationAuthenticated")
  private GenericOptionsTrueFalseEnumResource destinationAuthenticated = null;

  @JsonProperty("providesConfidentiality")
  private GenericOptionsTrueFalseEnumResource providesConfidentiality = null;

  @JsonProperty("providesIntegrity")
  private GenericOptionsTrueFalseEnumResource providesIntegrity = null;

  @JsonProperty("transmitsXML")
  private GenericOptionsTrueFalseEnumResource transmitsXML = null;

  @JsonProperty("containsCookies")
  private GenericOptionsTrueFalseEnumResource containsCookies = null;

  @JsonProperty("soapPayload")
  private GenericOptionsTrueFalseEnumResource soapPayload = null;

  @JsonProperty("restPayload")
  private GenericOptionsTrueFalseEnumResource restPayload = null;

  @JsonProperty("rssPayload")
  private GenericOptionsTrueFalseEnumResource rssPayload = null;

  @JsonProperty("jsonPayload")
  private GenericOptionsTrueFalseEnumResource jsonPayload = null;

  public GenericDataFlowOptionsResource physicalNetwork(PhysicalNetworkEnum physicalNetwork) {
    this.physicalNetwork = physicalNetwork;
    return this;
  }

  /**
   * Get physicalNetwork
   * @return physicalNetwork
  **/
  @ApiModelProperty(value = "")


  public PhysicalNetworkEnum getPhysicalNetwork() {
    return physicalNetwork;
  }

  public void setPhysicalNetwork(PhysicalNetworkEnum physicalNetwork) {
    this.physicalNetwork = physicalNetwork;
  }

  public GenericDataFlowOptionsResource sourceAuthenticated(GenericOptionsTrueFalseEnumResource sourceAuthenticated) {
    this.sourceAuthenticated = sourceAuthenticated;
    return this;
  }

  /**
   * Get sourceAuthenticated
   * @return sourceAuthenticated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getSourceAuthenticated() {
    return sourceAuthenticated;
  }

  public void setSourceAuthenticated(GenericOptionsTrueFalseEnumResource sourceAuthenticated) {
    this.sourceAuthenticated = sourceAuthenticated;
  }

  public GenericDataFlowOptionsResource destinationAuthenticated(GenericOptionsTrueFalseEnumResource destinationAuthenticated) {
    this.destinationAuthenticated = destinationAuthenticated;
    return this;
  }

  /**
   * Get destinationAuthenticated
   * @return destinationAuthenticated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getDestinationAuthenticated() {
    return destinationAuthenticated;
  }

  public void setDestinationAuthenticated(GenericOptionsTrueFalseEnumResource destinationAuthenticated) {
    this.destinationAuthenticated = destinationAuthenticated;
  }

  public GenericDataFlowOptionsResource providesConfidentiality(GenericOptionsTrueFalseEnumResource providesConfidentiality) {
    this.providesConfidentiality = providesConfidentiality;
    return this;
  }

  /**
   * Get providesConfidentiality
   * @return providesConfidentiality
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getProvidesConfidentiality() {
    return providesConfidentiality;
  }

  public void setProvidesConfidentiality(GenericOptionsTrueFalseEnumResource providesConfidentiality) {
    this.providesConfidentiality = providesConfidentiality;
  }

  public GenericDataFlowOptionsResource providesIntegrity(GenericOptionsTrueFalseEnumResource providesIntegrity) {
    this.providesIntegrity = providesIntegrity;
    return this;
  }

  /**
   * Get providesIntegrity
   * @return providesIntegrity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getProvidesIntegrity() {
    return providesIntegrity;
  }

  public void setProvidesIntegrity(GenericOptionsTrueFalseEnumResource providesIntegrity) {
    this.providesIntegrity = providesIntegrity;
  }

  public GenericDataFlowOptionsResource transmitsXML(GenericOptionsTrueFalseEnumResource transmitsXML) {
    this.transmitsXML = transmitsXML;
    return this;
  }

  /**
   * Get transmitsXML
   * @return transmitsXML
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getTransmitsXML() {
    return transmitsXML;
  }

  public void setTransmitsXML(GenericOptionsTrueFalseEnumResource transmitsXML) {
    this.transmitsXML = transmitsXML;
  }

  public GenericDataFlowOptionsResource containsCookies(GenericOptionsTrueFalseEnumResource containsCookies) {
    this.containsCookies = containsCookies;
    return this;
  }

  /**
   * Get containsCookies
   * @return containsCookies
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getContainsCookies() {
    return containsCookies;
  }

  public void setContainsCookies(GenericOptionsTrueFalseEnumResource containsCookies) {
    this.containsCookies = containsCookies;
  }

  public GenericDataFlowOptionsResource soapPayload(GenericOptionsTrueFalseEnumResource soapPayload) {
    this.soapPayload = soapPayload;
    return this;
  }

  /**
   * Get soapPayload
   * @return soapPayload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getSoapPayload() {
    return soapPayload;
  }

  public void setSoapPayload(GenericOptionsTrueFalseEnumResource soapPayload) {
    this.soapPayload = soapPayload;
  }

  public GenericDataFlowOptionsResource restPayload(GenericOptionsTrueFalseEnumResource restPayload) {
    this.restPayload = restPayload;
    return this;
  }

  /**
   * Get restPayload
   * @return restPayload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getRestPayload() {
    return restPayload;
  }

  public void setRestPayload(GenericOptionsTrueFalseEnumResource restPayload) {
    this.restPayload = restPayload;
  }

  public GenericDataFlowOptionsResource rssPayload(GenericOptionsTrueFalseEnumResource rssPayload) {
    this.rssPayload = rssPayload;
    return this;
  }

  /**
   * Get rssPayload
   * @return rssPayload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getRssPayload() {
    return rssPayload;
  }

  public void setRssPayload(GenericOptionsTrueFalseEnumResource rssPayload) {
    this.rssPayload = rssPayload;
  }

  public GenericDataFlowOptionsResource jsonPayload(GenericOptionsTrueFalseEnumResource jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

  /**
   * Get jsonPayload
   * @return jsonPayload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getJsonPayload() {
    return jsonPayload;
  }

  public void setJsonPayload(GenericOptionsTrueFalseEnumResource jsonPayload) {
    this.jsonPayload = jsonPayload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericDataFlowOptionsResource genericDataFlowOptions = (GenericDataFlowOptionsResource) o;
    return Objects.equals(this.physicalNetwork, genericDataFlowOptions.physicalNetwork) &&
        Objects.equals(this.sourceAuthenticated, genericDataFlowOptions.sourceAuthenticated) &&
        Objects.equals(this.destinationAuthenticated, genericDataFlowOptions.destinationAuthenticated) &&
        Objects.equals(this.providesConfidentiality, genericDataFlowOptions.providesConfidentiality) &&
        Objects.equals(this.providesIntegrity, genericDataFlowOptions.providesIntegrity) &&
        Objects.equals(this.transmitsXML, genericDataFlowOptions.transmitsXML) &&
        Objects.equals(this.containsCookies, genericDataFlowOptions.containsCookies) &&
        Objects.equals(this.soapPayload, genericDataFlowOptions.soapPayload) &&
        Objects.equals(this.restPayload, genericDataFlowOptions.restPayload) &&
        Objects.equals(this.rssPayload, genericDataFlowOptions.rssPayload) &&
        Objects.equals(this.jsonPayload, genericDataFlowOptions.jsonPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalNetwork, sourceAuthenticated, destinationAuthenticated, providesConfidentiality, providesIntegrity, transmitsXML, containsCookies, soapPayload, restPayload, rssPayload, jsonPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericDataFlowOptionsResource {\n");
    
    sb.append("    physicalNetwork: ").append(toIndentedString(physicalNetwork)).append("\n");
    sb.append("    sourceAuthenticated: ").append(toIndentedString(sourceAuthenticated)).append("\n");
    sb.append("    destinationAuthenticated: ").append(toIndentedString(destinationAuthenticated)).append("\n");
    sb.append("    providesConfidentiality: ").append(toIndentedString(providesConfidentiality)).append("\n");
    sb.append("    providesIntegrity: ").append(toIndentedString(providesIntegrity)).append("\n");
    sb.append("    transmitsXML: ").append(toIndentedString(transmitsXML)).append("\n");
    sb.append("    containsCookies: ").append(toIndentedString(containsCookies)).append("\n");
    sb.append("    soapPayload: ").append(toIndentedString(soapPayload)).append("\n");
    sb.append("    restPayload: ").append(toIndentedString(restPayload)).append("\n");
    sb.append("    rssPayload: ").append(toIndentedString(rssPayload)).append("\n");
    sb.append("    jsonPayload: ").append(toIndentedString(jsonPayload)).append("\n");
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

