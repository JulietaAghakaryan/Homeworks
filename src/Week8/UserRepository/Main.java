package Week8.UserRepository;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5434/aca");
        dataSource.setUser("postgres");
        dataSource.setPassword("postgres");


        UserRepository userRepository=new JDBCUserRepository(dataSource);
        User user = new User();
        user.setAge(12);
        user.setName("hakob");

        userRepository.save(user);

    }
}
