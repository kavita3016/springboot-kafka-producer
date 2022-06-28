package com.assessment.sales.processing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalesNotificationMessage implements Serializable {
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
