package com.devkuma.testcotainers;

import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import static org.junit.Assert.assertEquals;

@Testcontainers
public class DockerComposeContainerTest {

    @Container
    static final DockerComposeContainer composeContainer;

    static {
        composeContainer = new DockerComposeContainer(new File("/Users/user/devlop/tidb/tidb-docker-compose/docker-compose.yml"))
                .withExposedService("tidb_1", 4000);
        composeContainer.start();

    }

    @Test
    public void whenSelectQueryExecuted_thenResulstsReturned()
            throws Exception {

        String host = composeContainer.getServiceHost("tidb_1", 4000);
        int port = composeContainer.getServicePort("tidb_1", 4000);

        String jdbcUrl = "jdbc:mysql://" + host + ":" + port + "/";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        ResultSet resultSet = conn.createStatement().executeQuery("SELECT 1");
        resultSet.next();
        int result = resultSet.getInt(1);

//        //Initialize the script runner
//        ScriptRunner sr = new ScriptRunner(conn);
//        //Creating a reader object
//        Reader reader = new BufferedReader(new FileReader("E:\sampleScript.sql"));
//        //Running the script
//        sr.runScript(reader);

        assertEquals(1, result);
    }

}
