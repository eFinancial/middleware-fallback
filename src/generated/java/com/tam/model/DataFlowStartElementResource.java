package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.PointCoordinatesResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataFlowStartElementResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class DataFlowStartElementResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("coordinates")
  private PointCoordinatesResource coordinates = null;

  public DataFlowStartElementResource id(String id) {
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

  public DataFlowStartElementResource coordinates(PointCoordinatesResource coordinates) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFlowStartElementResource dataFlowStartElement = (DataFlowStartElementResource) o;
    return Objects.equals(this.id, dataFlowStartElement.id) &&
        Objects.equals(this.coordinates, dataFlowStartElement.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlowStartElementResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

