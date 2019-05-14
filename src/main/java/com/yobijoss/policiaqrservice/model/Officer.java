package com.yobijoss.policiaqrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Officer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-14T10:16:48.734-05:00[America/Mexico_City]")

public class Officer   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("fathers_last_name")
  private String fathersLastName;

  @JsonProperty("mothers_last_name")
  private String mothersLastName;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("height")
  private BigDecimal height;

  public Officer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Officer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Officer fathersLastName(String fathersLastName) {
    this.fathersLastName = fathersLastName;
    return this;
  }

  /**
   * Get fathersLastName
   * @return fathersLastName
  */
  @ApiModelProperty(value = "")


  public String getFathersLastName() {
    return fathersLastName;
  }

  public void setFathersLastName(String fathersLastName) {
    this.fathersLastName = fathersLastName;
  }

  public Officer mothersLastName(String mothersLastName) {
    this.mothersLastName = mothersLastName;
    return this;
  }

  /**
   * Get mothersLastName
   * @return mothersLastName
  */
  @ApiModelProperty(value = "")


  public String getMothersLastName() {
    return mothersLastName;
  }

  public void setMothersLastName(String mothersLastName) {
    this.mothersLastName = mothersLastName;
  }

  public Officer age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Officer height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Officer officer = (Officer) o;
    return Objects.equals(this.id, officer.id) &&
        Objects.equals(this.name, officer.name) &&
        Objects.equals(this.fathersLastName, officer.fathersLastName) &&
        Objects.equals(this.mothersLastName, officer.mothersLastName) &&
        Objects.equals(this.age, officer.age) &&
        Objects.equals(this.height, officer.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fathersLastName, mothersLastName, age, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Officer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fathersLastName: ").append(toIndentedString(fathersLastName)).append("\n");
    sb.append("    mothersLastName: ").append(toIndentedString(mothersLastName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

