package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public void insertUserTrans(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public List<User> selectAllUsersStore();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public boolean updateUserStore(User user) throws SQLException;

    public List<User> selectAllUsersSortedByName() ;

    public List<User> selectAllUsersSortedByNameStore() ;

    public List <User>  selectUserByCountry(String country);

    User selectUserStore(int id);

    boolean deleteUserStore(int id);

    void insertUserStore(User user) throws SQLException;

    public void insertUpdateWithoutTransaction();
}

