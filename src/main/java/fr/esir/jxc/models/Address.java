package fr.esir.jxc.models;

public class Address {

    private String postalCode;
    private String street;
    private Integer streetNumber;
    private String complement;

    public Address(String postalCode, String street, Integer streetNumber, String complement) {
        this.postalCode = postalCode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.complement = complement;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
