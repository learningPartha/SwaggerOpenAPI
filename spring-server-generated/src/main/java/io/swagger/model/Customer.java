package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-11T10:21:23.076Z")


public class Customer   {
  @JsonProperty("customerId")
  private Integer customerId = null;

  @JsonProperty("accountValue")
  private BigDecimal accountValue = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("address")
  private Object address = null;

  @JsonProperty("contacts")
  @Valid
  private List<Object> contacts = null;

  public Customer customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Customer accountValue(BigDecimal accountValue) {
    this.accountValue = accountValue;
    return this;
  }

  /**
   * Get accountValue
   * @return accountValue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAccountValue() {
    return accountValue;
  }

  public void setAccountValue(BigDecimal accountValue) {
    this.accountValue = accountValue;
  }

  public Customer customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Customer active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Customer address(Object address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public Customer contacts(List<Object> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Customer addContactsItem(Object contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Object>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")


  public List<Object> getContacts() {
    return contacts;
  }

  public void setContacts(List<Object> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.accountValue, customer.accountValue) &&
        Objects.equals(this.customerName, customer.customerName) &&
        Objects.equals(this.active, customer.active) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.contacts, customer.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, accountValue, customerName, active, address, contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    accountValue: ").append(toIndentedString(accountValue)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

