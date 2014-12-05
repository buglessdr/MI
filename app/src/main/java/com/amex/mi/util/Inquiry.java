package com.amex.mi.util;

/**
 * Created by rmckay on 12/5/14.
 */
public class Inquiry {

    public enum Status{
        URGENT,
        NEW,
        UPDATED
    }

    private String caseNumber;
    private String amount;
    private Status status;
    private String respondByDate;

    public String getRespondByDate() {
        return respondByDate;
    }

    public void setRespondByDate(String respondByDate) {
        this.respondByDate = respondByDate;
    }

    public Status getStatus() {

        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAmount() {

        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCaseNumber() {

        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public static Inquiry toInquiry(String caseNumber, String amount, String respondByDate, Status status){
        Inquiry inquiry = new Inquiry();
        inquiry.setCaseNumber(caseNumber);
        inquiry.setAmount(amount);
        inquiry.setRespondByDate(respondByDate);
        inquiry.setStatus(status);
        return inquiry;
    }
}
