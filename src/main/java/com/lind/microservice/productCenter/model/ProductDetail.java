package com.lind.microservice.productCenter.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 产品实体.
 */
@ToString
@Getter
@Setter
@Entity
public class ProductDetail implements Serializable {
  @Id
  @GeneratedValue
  private int productId;

  @NotNull(message = "产品名称不能为空")
  private String productName;

  @NotNull(message = "简介不能为空")
  private String shortDescription;

  @NotNull(message = "描述不能为空")
  private String longDescription;

  @Min(value = 0, message = "库存不能小于0")
  private int inventory;
}