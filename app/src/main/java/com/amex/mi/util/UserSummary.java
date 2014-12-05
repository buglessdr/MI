package com.amex.mi.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmckay on 12/5/14.
 */
public class UserSummary {

    private String userViewName;
    private String email;
    private int locationCount;

    private List<Payment> payments = new ArrayList<Payment>();
    private List<Inquiry> inquiries = new ArrayList<Inquiry>();

    public String getUserViewName() {
        return userViewName;
    }

    public void setUserViewName(String userViewName) {
        this.userViewName = userViewName;
    }

    public List<Inquiry> getInquiries() {
        return inquiries;
    }

    public void setInquiries(List<Inquiry> inquiries) {
        this.inquiries = inquiries;
    }

    public List<Payment> getPayments() {

        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int getLocationCount() {

        return locationCount;
    }

    public void setLocationCount(int locationCount) {
        this.locationCount = locationCount;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
