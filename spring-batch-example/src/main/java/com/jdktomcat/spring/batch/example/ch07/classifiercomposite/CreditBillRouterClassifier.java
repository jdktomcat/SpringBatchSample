/**
 * 
 */
package com.jdktomcat.spring.batch.example.ch07.classifiercomposite;


import com.jdktomcat.spring.batch.example.ch07.CreditBill;
import org.springframework.classify.annotation.Classifier;

/**
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-9-23上午08:25:06
 */
public class CreditBillRouterClassifier{
	@Classifier
	public String classify(CreditBill classifiable) {
		if(classifiable.getAmount() > 500){
			return "large";
		}else{
			return "small";
		}
	}
}
