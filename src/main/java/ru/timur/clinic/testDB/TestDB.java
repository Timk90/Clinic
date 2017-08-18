package main.java.ru.timur.clinic.testDB;


import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.service.ClinicService;
import main.java.ru.timur.clinic.service.ClinicServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;
import java.util.List;


/**
 * Created by Tester on 17/08/2017.
 */
public class TestDB {


    void createAndPopulateTable(){
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");

            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/clinic","SA", "");

            Statement stm = connection.createStatement();
            stm.execute("DROP TABLE clients IF EXISTS ");


            stm.execute("CREATE  TABLE clients ( id INTEGER IDENTITY, firstname VARCHAR(45) NOT NULL, " +
                    " surename VARCHAR(45) NOT NULL, " +
                    " patronim VARCHAR(45) , " +
                    " phone VARCHAR(45), " +
                    " enabled TINYINT NOT NULL, " +
                    " PRIMARY KEY (firstname));");

            System.out.println("table created");
            stm.close();

            stm = connection.createStatement();
            stm.execute("INSERT INTO clients (FIRSTNAME, SURENAME, PHONE, ENABLED)\n" +
                    "VALUES ('Timur', 'Burganov', '8493829849', 1);\n" +
                    "INSERT INTO clients (FIRSTNAME, SURENAME, PHONE, ENABLED)\n" +
                    "VALUES ('Bambr', 'Bambridze', '8493829849', 1);\n" +
                    "INSERT INTO clients (FIRSTNAME, SURENAME, PHONE, ENABLED)\n" +
                    "VALUES ('Max', 'IneMax', '8493829849', 1);"+
                    "INSERT INTO clients (FIRSTNAME, SURENAME, PATRONIM, PHONE, ENABLED)\n" +
                    "VALUES ('Сыктывкар', 'Урюков',  'Бабуанович', '8493829849', 2);");
            stm.close();

            System.out.println("users added");

            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM clients");
            ResultSet results = stmt.executeQuery();
            while(results.next()){
                System.out.println(
                        "Id: "+results.getInt(1) +
                                " Name: "+results.getString(2) +
                                " Surename: " +results.getString(3)+
                                " Phone: "+results.getString(5)+
                                " Enabled: "+results.getInt(6)
                );
            }
            results.close();
            stmt.close();

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //new TestDB().createAndPopulateTable();

        //ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("main/webapp/WEB-INF/spring-config.xml");
        ClinicServiceImp service  = (ClinicServiceImp)ctx.getBean("service");
        System.out.println("------Clients List------");
        List<Client> clients = service.getAllClients();
        for(Client client: clients){
            System.out.println(
                    "id: "+client.getId()+
                    " firstname: "+client.getFirstname()+
                    " surename: " +client.getSurename()+
                    " patronim: "+client.getPatronim()+
                    " phone: "+client.getPhoneNumber()+
                    " enabled: "+client.getEnabled()

            );
        }

    }
}
