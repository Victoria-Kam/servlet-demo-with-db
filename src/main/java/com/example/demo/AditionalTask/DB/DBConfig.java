package com.example.demo.AditionalTask.DB;

public abstract class DBConfig {
    static final String URL ="jdbc:postgresql://localhost:5432/postgres";
    static final String NAME = "postgres";
    static final String PASSWORD ="!012345D";

    protected String getUrl() {
        return URL;
    }

    protected String getName() {
        return NAME;
    }

    protected String getPassword() {
        return PASSWORD;
    }
}
