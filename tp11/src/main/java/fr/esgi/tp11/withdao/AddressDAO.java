package fr.esgi.tp11.withdao;

import fr.esgi.tp11.Address;

public interface AddressDAO {

    void createAddress(Address address);

    void deleteAddress(int addressId);

    void modifyAddress(int addressId, Address address);
}
