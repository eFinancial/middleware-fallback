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
 * GenericInteractorOptionsResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class GenericInteractorOptionsResource   {
  @JsonProperty("authenticatesItself")
  private GenericOptionsTrueFalseEnumResource authenticatesItself = null;

  @JsonProperty("destinationAuthenticated")
  private GenericOptionsTrueFalseEnumResource destinationAuthenticated = null;

  @JsonProperty("human")
  private GenericOptionsTrueFalseEnumResource human = null;

  public GenericInteractorOptionsResource authenticatesItself(GenericOptionsTrueFalseEnumResource authenticatesItself) {
    this.authenticatesItself = authenticatesItself;
    return this;
  }

  /**
   * Get authenticatesItself
   * @return authenticatesItself
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getAuthenticatesItself() {
    return authenticatesItself;
  }

  public void setAuthenticatesItself(GenericOptionsTrueFalseEnumResource authenticatesItself) {
    this.authenticatesItself = authenticatesItself;
  }

  public GenericInteractorOptionsResource destinationAuthenticated(GenericOptionsTrueFalseEnumResource destinationAuthenticated) {
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

  public GenericInteractorOptionsResource human(GenericOptionsTrueFalseEnumResource human) {
    this.human = human;
    return this;
  }

  /**
   * Get human
   * @return human
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericOptionsTrueFalseEnumResource getHuman() {
    return human;
  }

  public void setHuman(GenericOptionsTrueFalseEnumResource human) {
    this.human = human;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericInteractorOptionsResource genericInteractorOptions = (GenericInteractorOptionsResource) o;
    return Objects.equals(this.authenticatesItself, genericInteractorOptions.authenticatesItself) &&
        Objects.equals(this.destinationAuthenticated, genericInteractorOptions.destinationAuthenticated) &&
        Objects.equals(this.human, genericInteractorOptions.human);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatesItself, destinationAuthenticated, human);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericInteractorOptionsResource {\n");
    
    sb.append("    authenticatesItself: ").append(toIndentedString(authenticatesItself)).append("\n");
    sb.append("    destinationAuthenticated: ").append(toIndentedString(destinationAuthenticated)).append("\n");
    sb.append("    human: ").append(toIndentedString(human)).append("\n");
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

