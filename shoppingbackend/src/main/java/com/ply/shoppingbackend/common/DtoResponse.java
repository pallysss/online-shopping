package com.ply.shoppingbackend.common;

import java.util.List;
import java.util.Map;

public class DtoResponse {

	private String status;    
    private List data;
    private Map<String,Object> message;
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public Map<String, Object> getMessage() {
		return message;
	}
	public void setMessage(Map<String, Object> message) {
		this.message = message;
	}
    
    public static DtoResponse construct(String status , Map<String, Object> message, List data) {
    	DtoResponse res = new DtoResponse();
    	res.setStatus(status);
    	res.setMessage(message);
    	res.setData(data);
    	return res;
    }
    
}
