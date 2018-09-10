package com.bac.client.test;

import com.bac.cxf.client.generated_code.Order;
import com.bac.cxf.client.generated_code.OrderProcess;
import com.bac.cxf.client.generated_code.OrderProcessImplService;

public class TestClient {
	
	public static void main(String[] args) {
		Order order = new Order();
		order.setCustomerID("cust-01");
		order.setItemID("item-1");
		order.setPrice(1000.00);
		order.setQunatity(10);
		
		OrderProcessImplService impl = new OrderProcessImplService();
		
		OrderProcess orp = impl.getOrderProcessImplPort();
		String orderID = orp.processOrder(order);
		System.out.println("Generated Order :"+orderID);
		
	}

}
