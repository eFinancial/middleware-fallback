package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointCoordinatesResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class PointCoordinatesResource   {
  @JsonProperty("xCoord")
  private BigDecimal xCoord = null;

  @JsonProperty("yCoord")
  private BigDecimal yCoord = null;

  public PointCoordinatesResource xCoord(BigDecimal xCoord) {
    this.xCoord = xCoord;
    return this;
  }

  /**
   * Get xCoord
   * @return xCoord
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getXCoord() {
    return xCoord;
  }

  public void setXCoord(BigDecimal xCoord) {
    this.xCoord = xCoord;
  }

  public PointCoordinatesResource yCoord(BigDecimal yCoord) {
    this.yCoord = yCoord;
    return this;
  }

  /**
   * Get yCoord
   * @return yCoord
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getYCoord() {
    return yCoord;
  }

  public void setYCoord(BigDecimal yCoord) {
    this.yCoord = yCoord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointCoordinatesResource pointCoordinates = (PointCoordinatesResource) o;
    return Objects.equals(this.xCoord, pointCoordinates.xCoord) &&
        Objects.equals(this.yCoord, pointCoordinates.yCoord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xCoord, yCoord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointCoordinatesResource {\n");
    
    sb.append("    xCoord: ").append(toIndentedString(xCoord)).append("\n");
    sb.append("    yCoord: ").append(toIndentedString(yCoord)).append("\n");
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

