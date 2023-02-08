package ru.yandex.practicum.catsgram.manualJdbcConnectService;

//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class ManualJdbcConnectService {
    /*
     * Альтернативный механизм подключения
     * Описанный выше способ подключения не единственный. Часто нужно задать сразу несколько подключений к нескольким базам одновременно. Сделать это в файле application.properties с помощью одного URL не получится.
     * Допустим, вы хотите скачать данные из MySQL базы allcats в PostgreSQL базу cats вашего проекта. Потребуется два подключения к БД. Если одно из них уже настроено с помощью Spring Boot, второе можно сконфигурировать вручную через объекты DataSource (англ. «источник данных»). Эти объекты предоставляют прямой доступ к драйверу JDBC и параметрам подключения.
     * Для реализации альтернативного способа объявим тестовый класс ManualJdbcConnectService и отметим его аннотацией @Component.
     *
     * В конце необходимо подключить новый JdbcTemplate к источнику данных. Дальнейшая работа с кодом будет происходить точно так же, как если бы был использован способ подключения через Spring.
     */



//    public static final String JDBC_URL="jdbc:mysql://cat.world:3306/allcats";
//    public static final String JDBC_USERNAME="iamacat";
//    public static final String JDBC_PASSWORD="iamapet";
//    public static final String JDBC_DRIVER="org.mysql.jdbc.Driver";

//    public JdbcTemplate getTemplate() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(JDBC_DRIVER);
//        dataSource.setUrl(JDBC_URL);
//        dataSource.setUsername(JDBC_USERNAME);
//        dataSource.setPassword(JDBC_PASSWORD);
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        return jdbcTemplate;
//    }

}