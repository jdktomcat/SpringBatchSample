/**
 * 
 */
package com.jdktomcat.spring.batch.example.ch06.listener;

import com.jdktomcat.spring.batch.example.ch06.CreditBill;
import org.springframework.batch.core.annotation.AfterRead;
import org.springframework.batch.core.annotation.BeforeRead;
import org.springframework.batch.core.annotation.OnReadError;

/**
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-9-16下午05:47:05
 */
public class SystemOutAnnotation {
	@BeforeRead
	public void beforeRead() {
		System.out.println("SystemOutAnnotation.beforeRead()");
	}

	@AfterRead
	public void afterRead(CreditBill item) {
		System.out.println("SystemOutAnnotation.afterRead()");
	}

	@OnReadError
	public void onReadError(Exception ex) {
		System.out.println("SystemOutAnnotation.onReadError()");
	}
}
