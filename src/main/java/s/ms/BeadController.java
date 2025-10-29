package s.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class BeadController {

    @GetMapping("/")
    public String home(){
        return "Hehehehehe";
    }


    //тестирование бд
    @Autowired
    private DataSource dataSource;
    @GetMapping("/db-test")
    public String testConnection() {
        try (Connection conn = dataSource.getConnection()) {
            return "✅ Подключение к PostgreSQL успешно! База: " + conn.getMetaData().getDatabaseProductName();
        } catch (SQLException e) {
            return "❌ Ошибка подключения: " + e.getMessage();
        }
    }
}
