/**
 * 
 */
package com.jdktomcat.spring.batch.example.ch06.listener;

import com.jdktomcat.spring.batch.example.ch06.CreditBill;
import org.springframework.batch.core.ItemReadListener;

/**
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-9-16下午05:47:05
 */
public class SystemOutItemReadlistener implements ItemReadListener<CreditBill> {
	public void beforeRead() {
		System.out.println("SystemOutItemReadlistener.beforeRead()");
	}

	public void afterRead(CreditBill item) {
		System.out.println("SystemOutItemReadlistener.afterRead()");
	}

	public void onReadError(Exception ex) {
		System.out.println("SystemOutItemReadlistener.onReadError()");
	}
}
