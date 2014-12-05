package com.amex.mi.util;

/**
 * Created by rmckay on 12/5/14.
 */
public class Payment {

    public enum Status{
        PENDING,
        DEPOSITED
    }

    private int id;
    private String amount;
    private Status status;
    private String depositDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public static Payment toPayment(int id, String amount, Status status, String depositDate){
        Payment payment = new Payment();
        payment.setId(id);
        payment.setAmount(amount);
        payment.setDepositDate(depositDate);
        payment.setStatus(status);
        return payment;
    }
}
