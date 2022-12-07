package com.example.vistaraemployeemanager.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class Datasource {

    //TODO: This Configuration must take from a text file
    
    public static DataSource getDatasource() {
        var config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/employeesdb");
        config.setUsername("root");
        config.setPassword("***REMOVED***");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        return new HikariDataSource(config);
    }
}