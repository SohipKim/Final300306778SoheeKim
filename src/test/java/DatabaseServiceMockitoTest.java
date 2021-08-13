import com.example.final300306778soheekim.Connection123;
import com.example.final300306778soheekim.DatabaseService;
import com.example.final300306778soheekim.User;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseServiceMockitoTest {

    @InjectMocks
    private DatabaseService databseService;

    @Mock
    private Connection123 connection;

    @Mock
    private ResultSet resultSet;

    @Mock
    private PreparedStatement preparedStatement;

    @Mock
    private Connection123 connection123;

    User user;


}
