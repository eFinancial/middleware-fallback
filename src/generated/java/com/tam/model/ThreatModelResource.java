package com.tam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tam.model.CollectionResource;
import com.tam.model.DataFlowResource;
import com.tam.model.DataStoreResource;
import com.tam.model.InteractorResource;
import com.tam.model.ProcessResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ThreatModelResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-06T16:03:03.178+02:00")

public class ThreatModelResource   {
  @JsonProperty("interactors")
  @Valid
  private List<InteractorResource> interactors = null;

  @JsonProperty("dataFlows")
  @Valid
  private List<DataFlowResource> dataFlows = null;

  @JsonProperty("dataStores")
  @Valid
  private List<DataStoreResource> dataStores = null;

  @JsonProperty("processes")
  @Valid
  private List<ProcessResource> processes = null;

  @JsonProperty("collections")
  @Valid
  private List<CollectionResource> collections = null;

  public ThreatModelResource interactors(List<InteractorResource> interactors) {
    this.interactors = interactors;
    return this;
  }

  public ThreatModelResource addInteractorsItem(InteractorResource interactorsItem) {
    if (this.interactors == null) {
      this.interactors = new ArrayList<>();
    }
    this.interactors.add(interactorsItem);
    return this;
  }

  /**
   * Get interactors
   * @return interactors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<InteractorResource> getInteractors() {
    return interactors;
  }

  public void setInteractors(List<InteractorResource> interactors) {
    this.interactors = interactors;
  }

  public ThreatModelResource dataFlows(List<DataFlowResource> dataFlows) {
    this.dataFlows = dataFlows;
    return this;
  }

  public ThreatModelResource addDataFlowsItem(DataFlowResource dataFlowsItem) {
    if (this.dataFlows == null) {
      this.dataFlows = new ArrayList<>();
    }
    this.dataFlows.add(dataFlowsItem);
    return this;
  }

  /**
   * Get dataFlows
   * @return dataFlows
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataFlowResource> getDataFlows() {
    return dataFlows;
  }

  public void setDataFlows(List<DataFlowResource> dataFlows) {
    this.dataFlows = dataFlows;
  }

  public ThreatModelResource dataStores(List<DataStoreResource> dataStores) {
    this.dataStores = dataStores;
    return this;
  }

  public ThreatModelResource addDataStoresItem(DataStoreResource dataStoresItem) {
    if (this.dataStores == null) {
      this.dataStores = new ArrayList<>();
    }
    this.dataStores.add(dataStoresItem);
    return this;
  }

  /**
   * Get dataStores
   * @return dataStores
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataStoreResource> getDataStores() {
    return dataStores;
  }

  public void setDataStores(List<DataStoreResource> dataStores) {
    this.dataStores = dataStores;
  }

  public ThreatModelResource processes(List<ProcessResource> processes) {
    this.processes = processes;
    return this;
  }

  public ThreatModelResource addProcessesItem(ProcessResource processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Get processes
   * @return processes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProcessResource> getProcesses() {
    return processes;
  }

  public void setProcesses(List<ProcessResource> processes) {
    this.processes = processes;
  }

  public ThreatModelResource collections(List<CollectionResource> collections) {
    this.collections = collections;
    return this;
  }

  public ThreatModelResource addCollectionsItem(CollectionResource collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * Get collections
   * @return collections
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CollectionResource> getCollections() {
    return collections;
  }

  public void setCollections(List<CollectionResource> collections) {
    this.collections = collections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatModelResource threatModel = (ThreatModelResource) o;
    return Objects.equals(this.interactors, threatModel.interactors) &&
        Objects.equals(this.dataFlows, threatModel.dataFlows) &&
        Objects.equals(this.dataStores, threatModel.dataStores) &&
        Objects.equals(this.processes, threatModel.processes) &&
        Objects.equals(this.collections, threatModel.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactors, dataFlows, dataStores, processes, collections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatModelResource {\n");
    
    sb.append("    interactors: ").append(toIndentedString(interactors)).append("\n");
    sb.append("    dataFlows: ").append(toIndentedString(dataFlows)).append("\n");
    sb.append("    dataStores: ").append(toIndentedString(dataStores)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

