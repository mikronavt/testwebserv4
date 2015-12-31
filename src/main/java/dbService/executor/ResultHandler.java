package dbService.executor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 30.12.2015.
 */
public interface ResultHandler<T> {
    T handle(ResultSet resultSet) throws SQLException;
}
