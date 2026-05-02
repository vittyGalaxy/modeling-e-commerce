package com.vittorio.ecommerce;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void userNameSurnameRoleCorrectly() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User u = new User("Vittorio", "Tiozzo", date,new Role(RoleType.client));
        assertThat(u.getName()).isEqualTo("Vittorio");
        assertThat(u.getSurname()).isEqualTo("Tiozzo");
        Date dateTest = sdf.parse("02-02-2005");
        assertThat(u.getDate()).isEqualTo(dateTest);
        assertThat(u.getRole()).isEqualTo(RoleType.client);
    }

    @Test
    void setterNameSurnameRoleTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User u = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));
        u.setRole(new Role(RoleType.catalogManager));
        assertThat(u.getRole()).isEqualTo(RoleType.catalogManager);
        u.setName("Name");
        assertThat(u.getName()).isEqualTo("Name");
        u.setSurname("Surname");
        assertThat(u.getSurname()).isEqualTo("Surname");
        date = sdf.parse("1-05-2005");
        u.setDate(date);
        assertThat(u.getDate()).isEqualTo(date);
    }

    @Test
    void initializePhoneTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));

        // empty    
        assertThat(user.getListPhone()).isEqualTo(new ArrayList<String>());
    }

    @Test
    void addPhoneTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));
       
        String number1          = "1111111111";
        String number2          = "2222222222";
        String number3          = "3333333333";
        List<String> expectedListPhone  = new ArrayList<String>();
        List<String> actualListPhone    = new ArrayList<String>();

        // only one 
        user.addPhoneNumber(number1);
        expectedListPhone.add(number1);
        actualListPhone = user.getListPhone();
        assertThat(actualListPhone).isEqualTo(expectedListPhone);

        // add more elements ...
        user.addPhoneNumber(number2);
        expectedListPhone.add(number2);
        actualListPhone = user.getListPhone();
        assertThat(actualListPhone).isEqualTo(expectedListPhone);
        
        user.addPhoneNumber(number3);
        expectedListPhone.add(number3);
        actualListPhone = user.getListPhone();
        assertThat(actualListPhone).isEqualTo(expectedListPhone);
    }

    @Test
    void removePhoneTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));
        List<String> expectedListPhone  = new ArrayList<String>();
        List<String> actualListPhone    = new ArrayList<String>();

        String number1 = "1111111111";
        String number2 = "2222222222";
        String number3 = "3333333333";

        // add
        user.addPhoneNumber(number1);
        user.addPhoneNumber(number2);
        user.addPhoneNumber(number3);

        actualListPhone = user.getListPhone();

        expectedListPhone.add(number1);
        expectedListPhone.add(number2);
        expectedListPhone.add(number3);

        assertThat(actualListPhone).isEqualTo(expectedListPhone);

        // remove
        user.removePhoneNumber(number1);
        expectedListPhone.remove(number1);
        actualListPhone = user.getListPhone();
        assertThat(actualListPhone).isEqualTo(expectedListPhone);
        
        user.removePhoneNumber(number2);
        expectedListPhone.remove(number2);
        actualListPhone = user.getListPhone();
        assertThat(actualListPhone).isEqualTo(expectedListPhone);
    }

    @Test
    void badCase() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));
        List<String> expectedListPhone  = new ArrayList<String>();
        List<String> actualListPhone    = new ArrayList<String>();

        user.removePhoneNumber("9999999999999999999999999");
        actualListPhone = user.getListPhone();
        assertThat(actualListPhone).isEqualTo(expectedListPhone);
    }

    @Test
    void getListAddressesTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));

        List<Address> expectedListAddress    = new ArrayList<Address>();
        List<Address> actualListAddress      = new ArrayList<Address>();

        user.addAddress(new Address("Via Roma", 300, 12345, "Vittoria"), AddressType.shipping);
        user.addAddress(new Address("Via Milano", 350, 12345, "Vittoria"), AddressType.billing);

        actualListAddress = user.getListAddresses();
        expectedListAddress.add(new Address("Via Roma", 300, 12345, "Vittoria"));
        expectedListAddress.add(new Address("Via Milano", 350, 12345, "Vittoria"));
        assertThat(actualListAddress).isEqualTo(expectedListAddress);
    }

    @Test
    void getListAddressesShippingTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));

        List<Address> expectedListAddress    = new ArrayList<Address>();
        List<Address> actualListAddress      = new ArrayList<Address>();

        user.addAddress(new Address("Via Roma", 300, 12345, "Vittoria"), AddressType.shipping);
        user.addAddress(new Address("Via Milano", 350, 12345, "Vittoria"), AddressType.billing);

        actualListAddress = user.getListShipping();
        expectedListAddress.add(new Address("Via Roma", 300, 12345, "Vittoria"));
        assertThat(actualListAddress).isEqualTo(expectedListAddress);
    }

    void getListAddressesBillingTest() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("02-02-2005");
        User user = new User("Vittorio", "Tiozzo", date, new Role(RoleType.client));

        List<Address> expectedListAddress    = new ArrayList<Address>();
        List<Address> actualListAddress      = new ArrayList<Address>();

        user.addAddress(new Address("Via Roma", 300, 12345, "Vittoria"), AddressType.shipping);
        user.addAddress(new Address("Via Milano", 350, 12345, "Vittoria"), AddressType.billing);

        actualListAddress = user.getListBilling();
        expectedListAddress.add(new Address("Via Milano", 350, 12345, "Vittoria"));
        assertThat(actualListAddress).isEqualTo(expectedListAddress);
    }
}
