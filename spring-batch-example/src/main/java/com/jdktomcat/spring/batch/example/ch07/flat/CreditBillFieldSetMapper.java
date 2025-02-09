/**
 * 
 */
package com.jdktomcat.spring.batch.example.ch07.flat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.jdktomcat.spring.batch.example.ch07.CreditBill;

/**
 * 
 * @author bruce.liu(mailto:jxta.liu@gmail.com)
 * 2013-9-19下午01:13:17
 */
public class CreditBillFieldSetMapper implements FieldSetMapper<CreditBill> {

	public CreditBill mapFieldSet(FieldSet fieldSet) throws BindException {
		CreditBill result = new CreditBill();
		result.setAccountID(fieldSet.readString("accountID"));
		result.setName(fieldSet.readString("name"));
		result.setAmount(fieldSet.readDouble("amount"));
		result.setDate(fieldSet.readString("date"));
		result.setAddress(fieldSet.readString("address"));
		return result;
	}
}
