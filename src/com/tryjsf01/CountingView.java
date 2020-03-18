package com.tryjsf01;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.NamedEvent;

@NamedEvent
@ManagedBean
@ViewScoped
public class CountingView implements Serializable {

	private int number = 0;

	public int getNumber() {
		return number;
	}

	public void increment() {
		number++;
//		System.out.println(number);

//		boolean b = true;
//		while (b) {
//			try {
//				number++;
//				Thread.sleep(1);
//				System.out.println(number);
//				if (number > 10)
//					b = false;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}

	}
}