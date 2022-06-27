package com.eim.springbootkafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sales implements Serializable {
  private static final long serialVersionUID = -4551323276601557391L;

  private String product;
  private Integer quantity;
  private Double price;
  private String adjustmentOperation;
  private Double adjustmentPrice;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

}
