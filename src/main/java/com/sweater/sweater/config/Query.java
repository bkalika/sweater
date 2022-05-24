package com.sweater.sweater.config;

/**
 * @author @bkalika
 * Created on 13.05.2022 12:26 AM
 */
public enum Query {

    SELECT_USER_BY_NAME("SELECT name, password, active FROM usr WHERE name = ?"),
    SELECT_USER_ROLES_BY_USER_NAME("SELECT u.name, ur.roles FROM usr u " +
            "INNER JOIN user_role ur ON u.id = ur.user_id WHERE u.name = ?");

    private final String query;

    Query(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    @Override
    public String toString() {
        return "Query{" +
                "query='" + query + '\'' +
                '}';
    }
}
