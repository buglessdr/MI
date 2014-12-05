package com.amex.mi.util;

/**
 * Created by rmckay on 12/5/14.
 */
public class UserSummaryCache {

    private static UserSummary userSummary = null;

    public static UserSummary getUserSummary(){

        if(userSummary == null){
            userSummary = createGenericUserSummary();
        }
        return userSummary;
    }

    private static UserSummary createGenericUserSummary(){
        UserSummary us = new UserSummary();
        us.setUserViewName("Test User Name");
        us.setEmail("testEmail@test.com");
        us.setLocationCount(2);
        us.getPayments().add(Payment.toPayment(1, "100.00", Payment.Status.PENDING, ""));
        us.getPayments().add(Payment.toPayment(2, "200.00", Payment.Status.DEPOSITED, "12/1/2014"));
        us.getPayments().add(Payment.toPayment(3, "300.00", Payment.Status.PENDING, ""));
        us.getPayments().add(Payment.toPayment(4, "400.00", Payment.Status.DEPOSITED, "12/2/2014"));
        us.getPayments().add(Payment.toPayment(5, "500.00", Payment.Status.PENDING, ""));
        us.getPayments().add(Payment.toPayment(6, "600.00", Payment.Status.DEPOSITED, "12/3/2014"));
        us.getPayments().add(Payment.toPayment(7, "700.00", Payment.Status.PENDING, ""));

        us.getInquiries().add(Inquiry.toInquiry("csn123", "100.00", "1/12/2015", Inquiry.Status.NEW));
        us.getInquiries().add(Inquiry.toInquiry("csn456", "200.00", "12/12/2014", Inquiry.Status.URGENT));
        us.getInquiries().add(Inquiry.toInquiry("csn789", "300.00", "1/12/2015", Inquiry.Status.UPDATED));
        us.getInquiries().add(Inquiry.toInquiry("vbg123", "400.00", "1/12/2015", Inquiry.Status.NEW));
        us.getInquiries().add(Inquiry.toInquiry("vbg234", "500.00", "12/13/2014", Inquiry.Status.URGENT));
        us.getInquiries().add(Inquiry.toInquiry("vbg456", "600.00", "1/12/2015", Inquiry.Status.NEW));
        us.getInquiries().add(Inquiry.toInquiry("vbg567", "700.00", "1/12/2015", Inquiry.Status.NEW));


        return us;
    }
}
