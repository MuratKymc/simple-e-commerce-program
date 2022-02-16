package com.company;

public class CreditCard {

    private User creditCardOwner;
    private String creditCardNumber;
    private String securityCode;
    private String expirationDateOfCreditCard;

    public CreditCard(User creditCardOwner, String creditCardNumber, String securityCode, String expirationDateOfCreditCard) {
        this.creditCardOwner = creditCardOwner;
        this.creditCardNumber = creditCardNumber;
        this.securityCode = securityCode;
        this.expirationDateOfCreditCard = expirationDateOfCreditCard;
    }

    public User getCreditCardOwner() {
        return creditCardOwner;
    }

    public void setCreditCardOwner(User creditCardOwner) {
        this.creditCardOwner = creditCardOwner;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDateOfCreditCard() {
        return expirationDateOfCreditCard;
    }

    public void setExpirationDateOfCreditCard(String expirationDateOfCreditCard) {
        this.expirationDateOfCreditCard = expirationDateOfCreditCard;
    }
}
