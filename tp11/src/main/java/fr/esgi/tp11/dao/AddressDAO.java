package fr.esgi.tp11.dao;

import fr.esgi.tp11.Address;

public interface AddressDAO {

    void createAddress(Address address);

    void deleteAddress(int addressId);

    void modifyAddress(int addressId, Address address);
}
