package com.comm.comm.model;

import javax.persistence.Entity;
import java.util.List;

public class OrderSeat {

  private double seat_Price;
  private String seat_number;


  public double getSeat_Price() {
    return seat_Price;
  }

  public void setSeat_Price(double seat_Price) {
    this.seat_Price = seat_Price;
  }

  public String getSeat_number() {
    return seat_number;
  }

  public void setSeat_number(String seat_number) {
    this.seat_number = seat_number;
  }
}
