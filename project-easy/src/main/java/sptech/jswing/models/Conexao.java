package sptech.jswing.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate connection;
    
    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://svr-projeto-easy.database.windows.net:1433;"
                + "database=bd-projeto-easy;encrypt=true;trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;");
        dataSource.setUsername("");
        dataSource.setPassword("");
        this.connection = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConnection() {
        return connection;
    }
}
