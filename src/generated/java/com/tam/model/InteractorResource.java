package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.GenericInteractorOptionsResource;
import com.tam.model.InteractorTypeResource;
import com.tam.model.PointCoordinatesResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InteractorResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class InteractorResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("coordinates")
  private PointCoordinatesResource coordinates = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private InteractorTypeResource type = null;

  @JsonProperty("genericOptions")
  private GenericInteractorOptionsResource genericOptions = null;

  public InteractorResource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InteractorResource coordinates(PointCoordinatesResource coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PointCoordinatesResource getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(PointCoordinatesResource coordinates) {
    this.coordinates = coordinates;
  }

  public InteractorResource name(String name) {
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

  public InteractorResource type(InteractorTypeResource type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InteractorTypeResource getType() {
    return type;
  }

  public void setType(InteractorTypeResource type) {
    this.type = type;
  }

  public InteractorResource genericOptions(GenericInteractorOptionsResource genericOptions) {
    this.genericOptions = genericOptions;
    return this;
  }

  /**
   * Get genericOptions
   * @return genericOptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericInteractorOptionsResource getGenericOptions() {
    return genericOptions;
  }

  public void setGenericOptions(GenericInteractorOptionsResource genericOptions) {
    this.genericOptions = genericOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractorResource interactor = (InteractorResource) o;
    return Objects.equals(this.id, interactor.id) &&
        Objects.equals(this.coordinates, interactor.coordinates) &&
        Objects.equals(this.name, interactor.name) &&
        Objects.equals(this.type, interactor.type) &&
        Objects.equals(this.genericOptions, interactor.genericOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, coordinates, name, type, genericOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractorResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    genericOptions: ").append(toIndentedString(genericOptions)).append("\n");
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

