package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets GenericOptionsTrueFalseEnum
 */
public enum GenericOptionsTrueFalseEnumResource {
  
  TRUE("true"),
  
  FALSE("false"),
  
  NOTSELECTED("notSelected");

  private String value;

  GenericOptionsTrueFalseEnumResource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GenericOptionsTrueFalseEnumResource fromValue(String text) {
    for (GenericOptionsTrueFalseEnumResource b : GenericOptionsTrueFalseEnumResource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

