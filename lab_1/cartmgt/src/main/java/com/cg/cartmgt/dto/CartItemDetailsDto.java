package com.cg.cartmgt.dto;

public class CartItemDetailsDto {
 
	  private  String productId;
	  
	  public String getProductId(){
			return productId;
	    }

	    public void setProductId(String id){
	        this.productId=id;
	    }

	    private String productName;

	    public String getProductName(){
	        return productName;
	    }

	    public void setProductName(String name){
	        this.productName=name;
	    }

	    private  double productPrice;
	    
	    public  double  getProductPrice(){
	        return productPrice;
	    }

	    public void setProductPrice(double price){
	        this.productPrice = price;
	    }
}
