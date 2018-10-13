package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DataFlowType
 */
public enum DataFlowTypeResource {
  
  GENERIC_DATA_FLOW("Generic Data Flow"),
  
  ALCP("ALCP"),
  
  BINARY_DATA_FLOW("Binary Data Flow"),
  
  HTTP_DATA_FLOW("HTTP Data Flow"),
  
  HTTPS_DATA_FLOW("HTTPS Data Flow"),
  
  IOCTL_INTERFACE("IOCTL Interface"),
  
  IPSEC_DATA_FLOW("IPsec Data Flow"),
  
  NAMED_PIPE_DATA_FLOW("Named Pipe Data Flow"),
  
  RPC_DCOM("RPC / DCOM"),
  
  SMB_DATA_FLOW("SMB Data Flow"),
  
  USER_DATA_PROTOCOL("User Data Protocol");

  private String value;

  DataFlowTypeResource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DataFlowTypeResource fromValue(String text) {
    for (DataFlowTypeResource b : DataFlowTypeResource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

