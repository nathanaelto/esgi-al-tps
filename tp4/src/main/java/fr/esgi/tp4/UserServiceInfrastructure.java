package fr.esgi.tp4;

import java.util.Collections;
import java.util.List;

interface UserServiceInfrastructure {
    void save(User user);

    default List<User> findAll() {
        return Collections.emptyList();
    }

    default void delete(String userId) {
    }
}
