package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ProcessType
 */
public enum ProcessTypeResource {
  
  GENERIC_PROCESS("Generic Process"),
  
  APP_RUNNING_NON_MS_OS("App running non-MS OS"),
  
  BROWSER_PLUG_INS("Browser Plug-ins"),
  
  BROWSER_CLIENT("Browser Client"),
  
  KERNEL_THREAD("Kernel Thread"),
  
  MANAGED_APPLICATION("Managed Application"),
  
  OS_PROCESS("OS Process"),
  
  THICK_CLIENT("Thick Client"),
  
  THREAD("Thread"),
  
  VIRTUAL_MACHINE("Virtual Machine"),
  
  WEB_APPLICATION("Web Application"),
  
  WEB_SERVER("Web Server"),
  
  WEB_SERVICE("Web Service"),
  
  WIN32_SERVICE("Win32 Service"),
  
  WINDOWS_STORE_PROCESS("Windows Store Process");

  private String value;

  ProcessTypeResource(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProcessTypeResource fromValue(String text) {
    for (ProcessTypeResource b : ProcessTypeResource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

