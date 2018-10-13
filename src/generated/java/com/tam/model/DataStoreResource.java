package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.DataStoreTypeResource;
import com.tam.model.GenericDataStoreOptionsResource;
import com.tam.model.PointCoordinatesResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataStoreResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class DataStoreResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("coordinates")
  private PointCoordinatesResource coordinates = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private DataStoreTypeResource type = null;

  @JsonProperty("genericOptions")
  private GenericDataStoreOptionsResource genericOptions = null;

  public DataStoreResource id(String id) {
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

  public DataStoreResource coordinates(PointCoordinatesResource coordinates) {
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

  public DataStoreResource name(String name) {
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

  public DataStoreResource type(DataStoreTypeResource type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DataStoreTypeResource getType() {
    return type;
  }

  public void setType(DataStoreTypeResource type) {
    this.type = type;
  }

  public DataStoreResource genericOptions(GenericDataStoreOptionsResource genericOptions) {
    this.genericOptions = genericOptions;
    return this;
  }

  /**
   * Get genericOptions
   * @return genericOptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericDataStoreOptionsResource getGenericOptions() {
    return genericOptions;
  }

  public void setGenericOptions(GenericDataStoreOptionsResource genericOptions) {
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
    DataStoreResource dataStore = (DataStoreResource) o;
    return Objects.equals(this.id, dataStore.id) &&
        Objects.equals(this.coordinates, dataStore.coordinates) &&
        Objects.equals(this.name, dataStore.name) &&
        Objects.equals(this.type, dataStore.type) &&
        Objects.equals(this.genericOptions, dataStore.genericOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, coordinates, name, type, genericOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStoreResource {\n");
    
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

