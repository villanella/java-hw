package org.homework7;

import java.sql.SQLException;

class TextProcessor {
    public void processText() throws AccountUnavailableException {
        try {
            throw new SQLException("Database connection error");
        } catch (SQLException e) {
            throw new AccountUnavailableException("Your account is blocked", e);
        }
    }
}
