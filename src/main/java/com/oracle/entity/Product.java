package com.oracle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor // constructor with no arguments
@AllArgsConstructor // constructor with all arguments
public class Product {
	private int productId;
	private String prodName;
	private float price;
	private String portNo;
}
