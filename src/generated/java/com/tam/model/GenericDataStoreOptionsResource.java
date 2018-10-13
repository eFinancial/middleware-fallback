package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.GenericOptionsTrueFalseEnumResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericDataStoreOptionsResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class GenericDataStoreOptionsResource   {
  @JsonProperty("storesCredentials")
  private GenericOptionsTrueFalseEnumResource storesCredentials = null;

  @JsonProperty("storesLogData")
  private GenericOptionsTrueFalseEnumResource storesLogData = null;

  @JsonProperty("encrypted")
  private GenericOptionsTrueFalseEnumResource encrypted = null;

  @JsonProperty("signed")
  private GenericOptionsTrueFalseEnumResource signed = null;

  @JsonProperty("backup")
  private GenericOptionsTrueFalseEnumResource backup = null;

  @JsonProperty("writeAccess")
  private GenericOptionsTrueFalseEnumResource writeAccess = null;

  @JsonProperty("removableStorage")
  private GenericOptionsTrueFalseEnumResource removableStorage = null;

  @JsonProperty("shared")
  private GenericOptionsTrueFalseEnumResource shared = null;

  public GenericDataStoreOptionsResource storesCredentials(GenericOptionsTrueFalseEnumResource storesCredentials) {
    this.storesCredentials = storesCredentials;
    return this;
  }

  /**
   * Get storesCredentials
   * @return storesCredentials
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getStoresCredentials() {
    return storesCredentials;
  }

  public void setStoresCredentials(GenericOptionsTrueFalseEnumResource storesCredentials) {
    this.storesCredentials = storesCredentials;
  }

  public GenericDataStoreOptionsResource storesLogData(GenericOptionsTrueFalseEnumResource storesLogData) {
    this.storesLogData = storesLogData;
    return this;
  }

  /**
   * Get storesLogData
   * @return storesLogData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getStoresLogData() {
    return storesLogData;
  }

  public void setStoresLogData(GenericOptionsTrueFalseEnumResource storesLogData) {
    this.storesLogData = storesLogData;
  }

  public GenericDataStoreOptionsResource encrypted(GenericOptionsTrueFalseEnumResource encrypted) {
    this.encrypted = encrypted;
    return this;
  }

  /**
   * Get encrypted
   * @return encrypted
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getEncrypted() {
    return encrypted;
  }

  public void setEncrypted(GenericOptionsTrueFalseEnumResource encrypted) {
    this.encrypted = encrypted;
  }

  public GenericDataStoreOptionsResource signed(GenericOptionsTrueFalseEnumResource signed) {
    this.signed = signed;
    return this;
  }

  /**
   * Get signed
   * @return signed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getSigned() {
    return signed;
  }

  public void setSigned(GenericOptionsTrueFalseEnumResource signed) {
    this.signed = signed;
  }

  public GenericDataStoreOptionsResource backup(GenericOptionsTrueFalseEnumResource backup) {
    this.backup = backup;
    return this;
  }

  /**
   * Get backup
   * @return backup
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getBackup() {
    return backup;
  }

  public void setBackup(GenericOptionsTrueFalseEnumResource backup) {
    this.backup = backup;
  }

  public GenericDataStoreOptionsResource writeAccess(GenericOptionsTrueFalseEnumResource writeAccess) {
    this.writeAccess = writeAccess;
    return this;
  }

  /**
   * Get writeAccess
   * @return writeAccess
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getWriteAccess() {
    return writeAccess;
  }

  public void setWriteAccess(GenericOptionsTrueFalseEnumResource writeAccess) {
    this.writeAccess = writeAccess;
  }

  public GenericDataStoreOptionsResource removableStorage(GenericOptionsTrueFalseEnumResource removableStorage) {
    this.removableStorage = removableStorage;
    return this;
  }

  /**
   * Get removableStorage
   * @return removableStorage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getRemovableStorage() {
    return removableStorage;
  }

  public void setRemovableStorage(GenericOptionsTrueFalseEnumResource removableStorage) {
    this.removableStorage = removableStorage;
  }

  public GenericDataStoreOptionsResource shared(GenericOptionsTrueFalseEnumResource shared) {
    this.shared = shared;
    return this;
  }

  /**
   * Get shared
   * @return shared
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getShared() {
    return shared;
  }

  public void setShared(GenericOptionsTrueFalseEnumResource shared) {
    this.shared = shared;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericDataStoreOptionsResource genericDataStoreOptions = (GenericDataStoreOptionsResource) o;
    return Objects.equals(this.storesCredentials, genericDataStoreOptions.storesCredentials) &&
        Objects.equals(this.storesLogData, genericDataStoreOptions.storesLogData) &&
        Objects.equals(this.encrypted, genericDataStoreOptions.encrypted) &&
        Objects.equals(this.signed, genericDataStoreOptions.signed) &&
        Objects.equals(this.backup, genericDataStoreOptions.backup) &&
        Objects.equals(this.writeAccess, genericDataStoreOptions.writeAccess) &&
        Objects.equals(this.removableStorage, genericDataStoreOptions.removableStorage) &&
        Objects.equals(this.shared, genericDataStoreOptions.shared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storesCredentials, storesLogData, encrypted, signed, backup, writeAccess, removableStorage, shared);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericDataStoreOptionsResource {\n");
    
    sb.append("    storesCredentials: ").append(toIndentedString(storesCredentials)).append("\n");
    sb.append("    storesLogData: ").append(toIndentedString(storesLogData)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    writeAccess: ").append(toIndentedString(writeAccess)).append("\n");
    sb.append("    removableStorage: ").append(toIndentedString(removableStorage)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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

