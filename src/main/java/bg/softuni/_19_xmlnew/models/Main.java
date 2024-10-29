package bg.softuni._19_xmlnew.models;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(PersonDTO.class);
//        Marshaller marshaller = jaxbContext.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//        AddressDTO addressDTO = new AddressDTO("Bulgaria", "Sofia");

//        PersonDTO personDTO = new PersonDTO("Petya", "Bogoeva", 31, addressDTO);
//        marshaller.marshal(personDTO, System.out);


//        JAXBContext jaxbContext1 = JAXBContext.newInstance(PhoneBook.class);
//        Marshaller marshaller1 = jaxbContext1.createMarshaller();
//        marshaller1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        PhoneBook phoneBook = new PhoneBook("Pesho", List.of("First", "Second", "Third"));
//        marshaller1.marshal(phoneBook, System.out);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
         PersonDTO personDTO = (PersonDTO) unmarshaller.unmarshal(System.in);
    }
}
