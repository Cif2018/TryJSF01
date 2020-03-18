package com.tryjsf01;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.NamedEvent;

@NamedEvent
@ManagedBean
@ViewScoped
public class CounterView implements Serializable {
	
	

	private int number;

	public int getNumber() {
		return number;
	}

	public void increment() {
		number++;
	}
	
	
}