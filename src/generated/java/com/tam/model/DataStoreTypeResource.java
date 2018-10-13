package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DataStoreType
 */
public enum DataStoreTypeResource {
  
  GENERIC_DATA_STORE("Generic Data Store"),
  
  CACHE("Cache"),
  
  CLOUD_STORAGE("Cloud Storage"),
  
  CONFIGURATION_FILE("Configuration File"),
  
  COOKIES("Cookies"),
  
  DEVICE("Device"),
  
  FILE_SYSTEM("File System"),
  
  HTML5_LOCAL_STORAGE("HTML5 Local Storage"),
  
  NON_RELATIONAL_DATABASE("Non-Relational Database"),
  
  REGISTRY_HIVE("Registry Hive"),
  
  SQL_DATABASE("SQL Database");

  private String value;

  DataStoreTypeResource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DataStoreTypeResource fromValue(String text) {
    for (DataStoreTypeResource b : DataStoreTypeResource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

