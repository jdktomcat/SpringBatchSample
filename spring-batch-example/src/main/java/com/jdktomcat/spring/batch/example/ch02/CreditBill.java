package com.jdktomcat.spring.batch.example.ch02;

/**
 * 信用卡对账单模型.<br>
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-1-6下午09:56:02
 */
public class CreditBill {
    /**
     * 银行卡账户ID
     */
    private String accountID = "";
    /**
     * 持卡人姓名
     */
    private String name = "";
    /**
     * 消费金额
     */
    private double amount = 0;
    /**
     * 消费日期 ，格式YYYY-MM-DD HH:MM:SS
     */
    private String date;
    /**
     * 消费场所
     */
    private String address;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("accountID=" + getAccountID() + ";name=" + getName() + ";amount="
                + getAmount() + ";date=" + getDate() + ";address=" + getAddress());
        return sb.toString();
    }
}
