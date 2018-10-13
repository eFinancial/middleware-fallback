package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets InteractorType
 */
public enum InteractorTypeResource {
  
  GENERIC_INTERACTOR("Generic Interactor"),
  
  HUMAN_USER("Human User"),
  
  BROWSER("Browser"),
  
  EXTERNAL_WEB_APPLICATION("External Web Application"),
  
  EXTERNAL_WEB_SERVICE("External Web Service"),
  
  AUTHORIZATION_PROVIDER("Authorization Provider"),
  
  MEGASERVICE("Megaservice"),
  
  WINDOWS_RUNTIME("Windows Runtime");

  private String value;

  InteractorTypeResource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InteractorTypeResource fromValue(String text) {
    for (InteractorTypeResource b : InteractorTypeResource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

