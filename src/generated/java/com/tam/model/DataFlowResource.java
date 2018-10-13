package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tam.model.DataFlowStartElementResource;
import com.tam.model.DataFlowTypeResource;
import com.tam.model.GenericDataFlowOptionsResource;
import com.tam.model.PointCoordinatesResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataFlowResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class DataFlowResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    CENTER("center"),
    
    BOTTOM("bottom"),
    
    TOP("top");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("position")
  private PositionEnum position = null;

  @JsonProperty("startCoords")
  private PointCoordinatesResource startCoords = null;

  @JsonProperty("endCoords")
  private PointCoordinatesResource endCoords = null;

  @JsonProperty("startElement")
  private DataFlowStartElementResource startElement = null;

  @JsonProperty("endElement")
  private DataFlowStartElementResource endElement = null;

  @JsonProperty("type")
  private DataFlowTypeResource type = null;

  @JsonProperty("genericOptions")
  private GenericDataFlowOptionsResource genericOptions = null;

  public DataFlowResource id(String id) {
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

  public DataFlowResource name(String name) {
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

  public DataFlowResource position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")


  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public DataFlowResource startCoords(PointCoordinatesResource startCoords) {
    this.startCoords = startCoords;
    return this;
  }

  /**
   * Get startCoords
   * @return startCoords
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PointCoordinatesResource getStartCoords() {
    return startCoords;
  }

  public void setStartCoords(PointCoordinatesResource startCoords) {
    this.startCoords = startCoords;
  }

  public DataFlowResource endCoords(PointCoordinatesResource endCoords) {
    this.endCoords = endCoords;
    return this;
  }

  /**
   * Get endCoords
   * @return endCoords
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PointCoordinatesResource getEndCoords() {
    return endCoords;
  }

  public void setEndCoords(PointCoordinatesResource endCoords) {
    this.endCoords = endCoords;
  }

  public DataFlowResource startElement(DataFlowStartElementResource startElement) {
    this.startElement = startElement;
    return this;
  }

  /**
   * Get startElement
   * @return startElement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DataFlowStartElementResource getStartElement() {
    return startElement;
  }

  public void setStartElement(DataFlowStartElementResource startElement) {
    this.startElement = startElement;
  }

  public DataFlowResource endElement(DataFlowStartElementResource endElement) {
    this.endElement = endElement;
    return this;
  }

  /**
   * Get endElement
   * @return endElement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DataFlowStartElementResource getEndElement() {
    return endElement;
  }

  public void setEndElement(DataFlowStartElementResource endElement) {
    this.endElement = endElement;
  }

  public DataFlowResource type(DataFlowTypeResource type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DataFlowTypeResource getType() {
    return type;
  }

  public void setType(DataFlowTypeResource type) {
    this.type = type;
  }

  public DataFlowResource genericOptions(GenericDataFlowOptionsResource genericOptions) {
    this.genericOptions = genericOptions;
    return this;
  }

  /**
   * Get genericOptions
   * @return genericOptions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericDataFlowOptionsResource getGenericOptions() {
    return genericOptions;
  }

  public void setGenericOptions(GenericDataFlowOptionsResource genericOptions) {
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
    DataFlowResource dataFlow = (DataFlowResource) o;
    return Objects.equals(this.id, dataFlow.id) &&
        Objects.equals(this.name, dataFlow.name) &&
        Objects.equals(this.position, dataFlow.position) &&
        Objects.equals(this.startCoords, dataFlow.startCoords) &&
        Objects.equals(this.endCoords, dataFlow.endCoords) &&
        Objects.equals(this.startElement, dataFlow.startElement) &&
        Objects.equals(this.endElement, dataFlow.endElement) &&
        Objects.equals(this.type, dataFlow.type) &&
        Objects.equals(this.genericOptions, dataFlow.genericOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, position, startCoords, endCoords, startElement, endElement, type, genericOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlowResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    startCoords: ").append(toIndentedString(startCoords)).append("\n");
    sb.append("    endCoords: ").append(toIndentedString(endCoords)).append("\n");
    sb.append("    startElement: ").append(toIndentedString(startElement)).append("\n");
    sb.append("    endElement: ").append(toIndentedString(endElement)).append("\n");
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

