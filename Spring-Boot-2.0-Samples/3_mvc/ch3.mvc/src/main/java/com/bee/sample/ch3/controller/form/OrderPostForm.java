package com.bee.sample.ch3.controller.form;

import java.util.List;

import com.bee.sample.ch3.entity.Order;
import com.bee.sample.ch3.entity.OrderDetail;

public class OrderPostForm {
	public Order order;
	public List<OrderDetail> details;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}
	
	
	
}
