package com.design.pattern.state;

public class DeliveryContext {
	
	private OrderState currentState;
	private String stateId;
	
	DeliveryContext(OrderState currentState, String stateId) {
		super();
		this.currentState = currentState;
		this.stateId = stateId;
		
		if(currentState == null) {
			this.currentState =  Processing.getInstance();
		}
	}
	
	public OrderState getCurrentState() {
		return currentState;
	}
	public void setCurrentState(OrderState currentState) {
		this.currentState = currentState;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	
	public void update() {
		currentState.updateOrderState(this);
	}
}
