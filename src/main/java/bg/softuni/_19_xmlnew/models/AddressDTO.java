package bg.softuni._19_xmlnew.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AddressDTO {
    private String country;
    private String city;

    public AddressDTO() {
    }

    public AddressDTO(String country, String city) {
        this.country = country;
        this.city = city;
    }
}
