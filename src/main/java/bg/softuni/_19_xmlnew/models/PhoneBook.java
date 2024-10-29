package bg.softuni._19_xmlnew.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneBook {
    private String owner;

    private List<String> numbers;

    public PhoneBook() {}

    public PhoneBook(String owner, List<String> numbers) {
        this.owner = owner;
        this.numbers = numbers;
    }
}
