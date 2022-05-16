package com.example.demoManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Items {
	
	@Id
	int items_id;
	String item_dis;
	int item_cost;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cartobj;
	
	
	public Items() {
		
	}

	public int getItems_id() {
		return items_id;
	}

	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}

	public String getItem_dis() {
		return item_dis;
	}

	public void setItem_dis(String item_dis) {
		this.item_dis = item_dis;
	}

	public int getItem_cost() {
		return item_cost;
	}

	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}

	public Cart getCartobj() {
		return cartobj;
	}

	public void setCartobj(Cart cartobj) {
		this.cartobj = cartobj;
	}

	public Items(int items_id, String item_dis, int item_cost, Cart cartobj) {
		super();
		this.items_id = items_id;
		this.item_dis = item_dis;
		this.item_cost = item_cost;
		this.cartobj = cartobj;
	}
	
	

}
