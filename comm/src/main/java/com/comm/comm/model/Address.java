package com.comm.comm.model;


public class Address {

  private int addressId;
  private String addressArea;
  private String addressName;
  private String addressStreet;
  private String addressTelephone;
  private int userId;

  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }

  public String getAddressArea() {
    return addressArea;
  }

  public void setAddressArea(String addressArea) {
    this.addressArea = addressArea;
  }

  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public String getAddressStreet() {
    return addressStreet;
  }

  public void setAddressStreet(String addressStreet) {
    this.addressStreet = addressStreet;
  }

  public String getAddressTelephone() {
    return addressTelephone;
  }

  public void setAddressTelephone(String addressTelephone) {
    this.addressTelephone = addressTelephone;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
