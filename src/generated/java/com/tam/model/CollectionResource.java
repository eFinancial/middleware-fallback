package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.PointCoordinatesResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CollectionResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class CollectionResource   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("coordinates")
  private PointCoordinatesResource coordinates = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("width")
  private BigDecimal width = null;

  @JsonProperty("collectedElements")
  @Valid
  private List<String> collectedElements = null;

  public CollectionResource id(String id) {
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

  public CollectionResource coordinates(PointCoordinatesResource coordinates) {
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

  public CollectionResource height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public CollectionResource width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public CollectionResource collectedElements(List<String> collectedElements) {
    this.collectedElements = collectedElements;
    return this;
  }

  public CollectionResource addCollectedElementsItem(String collectedElementsItem) {
    if (this.collectedElements == null) {
      this.collectedElements = new ArrayList<>();
    }
    this.collectedElements.add(collectedElementsItem);
    return this;
  }

  /**
   * Get collectedElements
   * @return collectedElements
  **/
  @ApiModelProperty(value = "")


  public List<String> getCollectedElements() {
    return collectedElements;
  }

  public void setCollectedElements(List<String> collectedElements) {
    this.collectedElements = collectedElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionResource collection = (CollectionResource) o;
    return Objects.equals(this.id, collection.id) &&
        Objects.equals(this.coordinates, collection.coordinates) &&
        Objects.equals(this.height, collection.height) &&
        Objects.equals(this.width, collection.width) &&
        Objects.equals(this.collectedElements, collection.collectedElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, coordinates, height, width, collectedElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    collectedElements: ").append(toIndentedString(collectedElements)).append("\n");
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

