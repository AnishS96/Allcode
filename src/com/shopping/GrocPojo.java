package com.shopping;


public class GrocPojo {
	
		private String userName;
		private int password;
		protected int userid;
		String customerName;
		private String address;
		private int phoneNumber;
		protected int productId;
		private String productName;
		private double price;
		private int quantity;
		private int cartUserId;
		private int cartProductid;
		private int cartQuantity;
		private int billId;
		private int billProductId;
		private int billPrice;
		private int billingBillId;
		private int billingUserId;
		double totalAmount;
		private String status;
		
	
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getCartQuantity() {
			return cartQuantity;
		}
		public void setCartQuantity(int cartQuantity) {
			this.cartQuantity = cartQuantity;
		}
		public int getBillId() {
			return billId;
		}
		public void setBillId(int billId) {
			this.billId = billId;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(int totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getCartUserId() {
			return cartUserId;
		}
		public void setCartUserId(int cartUserId) {
			this.cartUserId = cartUserId;
		}
		public int getCartProductid() {
			return cartProductid;
		}
		public void setCartProductid(int cartProductid) {
			this.cartProductid = cartProductid;
		}
			
		public int getBillProductId() {
			return billProductId;
		}
		public void setBillProductId(int billProductId) {
			this.billProductId = billProductId;
		}
		public int getBillPrice() {
			return billPrice;
		}
		public void setBillPrice(int billPrice) {
			this.billPrice = billPrice;
		}
		public int getBillingBillId() {
			return billingBillId;
		}
		public void setBillingBillId(int billingBillId) {
			this.billingBillId = billingBillId;
		}
		public int getBillingUserId() {
			return billingUserId;
		}
		public void setBillingUserId(int billingUserId) {
			this.billingUserId = billingUserId;
		}
}