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
 * GenericProcessOptionsResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class GenericProcessOptionsResource   {
  /**
   * Gets or Sets codeType
   */
  public enum CodeTypeEnum {
    MANAGED("managed"),
    
    UNMANAGED("unmanaged"),
    
    NOTSELECTED("notSelected");

    private String value;

    CodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeTypeEnum fromValue(String text) {
      for (CodeTypeEnum b : CodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("codeType")
  private CodeTypeEnum codeType = null;

  /**
   * Gets or Sets runningAs
   */
  public enum RunningAsEnum {
    KERNEL("kernel"),
    
    SYSTEM("system"),
    
    NETWORKSERVICE("networkService"),
    
    LOCALSERVICE("localService"),
    
    ADMIN("admin"),
    
    STANDARDUSERWITHELEVATION("standardUserWithElevation"),
    
    STANDARDUSERWITHOUTELEVATION("standardUserWithoutElevation"),
    
    WINDOWSSTOREAPP("windowsStoreApp"),
    
    NOTSELECTED("notSelected");

    private String value;

    RunningAsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RunningAsEnum fromValue(String text) {
      for (RunningAsEnum b : RunningAsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("runningAs")
  private RunningAsEnum runningAs = null;

  /**
   * Gets or Sets isolationLevel
   */
  public enum IsolationLevelEnum {
    APPCONTAINER("appContainer"),
    
    LOWINTEGRITYLVL("lowIntegrityLvl"),
    
    MOICE("moice"),
    
    SANDBOX("sandbox"),
    
    NOTSELECTED("notSelected");

    private String value;

    IsolationLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsolationLevelEnum fromValue(String text) {
      for (IsolationLevelEnum b : IsolationLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("isolationLevel")
  private IsolationLevelEnum isolationLevel = null;

  /**
   * Gets or Sets acceptsInputsFrom
   */
  public enum AcceptsInputsFromEnum {
    ANYREMOTEINTERACTOR("anyRemoteInteractor"),
    
    KERNELSYSORLOCALADMIN("kernelSysOrLocalAdmin"),
    
    LOCALNETWORKORSERVICE("localNetworkOrService"),
    
    LOCALSTANDARDUSERWITHELEVATION("localStandardUserWithElevation"),
    
    LOCALSTANDARDUSERWITHOUTELEVATION("localStandardUserWithoutElevation"),
    
    WINDOWSSTOREAPPS("windowsStoreApps"),
    
    NOTHING("nothing"),
    
    OTHER("other"),
    
    NOTSELECTED("notSelected");

    private String value;

    AcceptsInputsFromEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AcceptsInputsFromEnum fromValue(String text) {
      for (AcceptsInputsFromEnum b : AcceptsInputsFromEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("acceptsInputsFrom")
  private AcceptsInputsFromEnum acceptsInputsFrom = null;

  @JsonProperty("implAuthenticationMechanism")
  private GenericOptionsTrueFalseEnumResource implAuthenticationMechanism = null;

  @JsonProperty("implAuthorizationMechanism")
  private GenericOptionsTrueFalseEnumResource implAuthorizationMechanism = null;

  @JsonProperty("implCommunityProtocol")
  private GenericOptionsTrueFalseEnumResource implCommunityProtocol = null;

  @JsonProperty("sanitizesInput")
  private GenericOptionsTrueFalseEnumResource sanitizesInput = null;

  @JsonProperty("sanitizesOutput")
  private GenericOptionsTrueFalseEnumResource sanitizesOutput = null;

  public GenericProcessOptionsResource codeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
    return this;
  }

  /**
   * Get codeType
   * @return codeType
  **/
  @ApiModelProperty(value = "")


  public CodeTypeEnum getCodeType() {
    return codeType;
  }

  public void setCodeType(CodeTypeEnum codeType) {
    this.codeType = codeType;
  }

  public GenericProcessOptionsResource runningAs(RunningAsEnum runningAs) {
    this.runningAs = runningAs;
    return this;
  }

  /**
   * Get runningAs
   * @return runningAs
  **/
  @ApiModelProperty(value = "")


  public RunningAsEnum getRunningAs() {
    return runningAs;
  }

  public void setRunningAs(RunningAsEnum runningAs) {
    this.runningAs = runningAs;
  }

  public GenericProcessOptionsResource isolationLevel(IsolationLevelEnum isolationLevel) {
    this.isolationLevel = isolationLevel;
    return this;
  }

  /**
   * Get isolationLevel
   * @return isolationLevel
  **/
  @ApiModelProperty(value = "")


  public IsolationLevelEnum getIsolationLevel() {
    return isolationLevel;
  }

  public void setIsolationLevel(IsolationLevelEnum isolationLevel) {
    this.isolationLevel = isolationLevel;
  }

  public GenericProcessOptionsResource acceptsInputsFrom(AcceptsInputsFromEnum acceptsInputsFrom) {
    this.acceptsInputsFrom = acceptsInputsFrom;
    return this;
  }

  /**
   * Get acceptsInputsFrom
   * @return acceptsInputsFrom
  **/
  @ApiModelProperty(value = "")


  public AcceptsInputsFromEnum getAcceptsInputsFrom() {
    return acceptsInputsFrom;
  }

  public void setAcceptsInputsFrom(AcceptsInputsFromEnum acceptsInputsFrom) {
    this.acceptsInputsFrom = acceptsInputsFrom;
  }

  public GenericProcessOptionsResource implAuthenticationMechanism(GenericOptionsTrueFalseEnumResource implAuthenticationMechanism) {
    this.implAuthenticationMechanism = implAuthenticationMechanism;
    return this;
  }

  /**
   * Get implAuthenticationMechanism
   * @return implAuthenticationMechanism
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getImplAuthenticationMechanism() {
    return implAuthenticationMechanism;
  }

  public void setImplAuthenticationMechanism(GenericOptionsTrueFalseEnumResource implAuthenticationMechanism) {
    this.implAuthenticationMechanism = implAuthenticationMechanism;
  }

  public GenericProcessOptionsResource implAuthorizationMechanism(GenericOptionsTrueFalseEnumResource implAuthorizationMechanism) {
    this.implAuthorizationMechanism = implAuthorizationMechanism;
    return this;
  }

  /**
   * Get implAuthorizationMechanism
   * @return implAuthorizationMechanism
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getImplAuthorizationMechanism() {
    return implAuthorizationMechanism;
  }

  public void setImplAuthorizationMechanism(GenericOptionsTrueFalseEnumResource implAuthorizationMechanism) {
    this.implAuthorizationMechanism = implAuthorizationMechanism;
  }

  public GenericProcessOptionsResource implCommunityProtocol(GenericOptionsTrueFalseEnumResource implCommunityProtocol) {
    this.implCommunityProtocol = implCommunityProtocol;
    return this;
  }

  /**
   * Get implCommunityProtocol
   * @return implCommunityProtocol
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getImplCommunityProtocol() {
    return implCommunityProtocol;
  }

  public void setImplCommunityProtocol(GenericOptionsTrueFalseEnumResource implCommunityProtocol) {
    this.implCommunityProtocol = implCommunityProtocol;
  }

  public GenericProcessOptionsResource sanitizesInput(GenericOptionsTrueFalseEnumResource sanitizesInput) {
    this.sanitizesInput = sanitizesInput;
    return this;
  }

  /**
   * Get sanitizesInput
   * @return sanitizesInput
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getSanitizesInput() {
    return sanitizesInput;
  }

  public void setSanitizesInput(GenericOptionsTrueFalseEnumResource sanitizesInput) {
    this.sanitizesInput = sanitizesInput;
  }

  public GenericProcessOptionsResource sanitizesOutput(GenericOptionsTrueFalseEnumResource sanitizesOutput) {
    this.sanitizesOutput = sanitizesOutput;
    return this;
  }

  /**
   * Get sanitizesOutput
   * @return sanitizesOutput
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getSanitizesOutput() {
    return sanitizesOutput;
  }

  public void setSanitizesOutput(GenericOptionsTrueFalseEnumResource sanitizesOutput) {
    this.sanitizesOutput = sanitizesOutput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericProcessOptionsResource genericProcessOptions = (GenericProcessOptionsResource) o;
    return Objects.equals(this.codeType, genericProcessOptions.codeType) &&
        Objects.equals(this.runningAs, genericProcessOptions.runningAs) &&
        Objects.equals(this.isolationLevel, genericProcessOptions.isolationLevel) &&
        Objects.equals(this.acceptsInputsFrom, genericProcessOptions.acceptsInputsFrom) &&
        Objects.equals(this.implAuthenticationMechanism, genericProcessOptions.implAuthenticationMechanism) &&
        Objects.equals(this.implAuthorizationMechanism, genericProcessOptions.implAuthorizationMechanism) &&
        Objects.equals(this.implCommunityProtocol, genericProcessOptions.implCommunityProtocol) &&
        Objects.equals(this.sanitizesInput, genericProcessOptions.sanitizesInput) &&
        Objects.equals(this.sanitizesOutput, genericProcessOptions.sanitizesOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeType, runningAs, isolationLevel, acceptsInputsFrom, implAuthenticationMechanism, implAuthorizationMechanism, implCommunityProtocol, sanitizesInput, sanitizesOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericProcessOptionsResource {\n");
    
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    runningAs: ").append(toIndentedString(runningAs)).append("\n");
    sb.append("    isolationLevel: ").append(toIndentedString(isolationLevel)).append("\n");
    sb.append("    acceptsInputsFrom: ").append(toIndentedString(acceptsInputsFrom)).append("\n");
    sb.append("    implAuthenticationMechanism: ").append(toIndentedString(implAuthenticationMechanism)).append("\n");
    sb.append("    implAuthorizationMechanism: ").append(toIndentedString(implAuthorizationMechanism)).append("\n");
    sb.append("    implCommunityProtocol: ").append(toIndentedString(implCommunityProtocol)).append("\n");
    sb.append("    sanitizesInput: ").append(toIndentedString(sanitizesInput)).append("\n");
    sb.append("    sanitizesOutput: ").append(toIndentedString(sanitizesOutput)).append("\n");
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

