package r.esgi.tp5;

class JdbcUserServiceInfrastructure implements UserRepository {
    @Override
    public void save(User user) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public User byId(UserId userId) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public UserId nextId() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
}
