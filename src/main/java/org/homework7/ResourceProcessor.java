package org.homework7;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;

class ResourceProcessor {
    public void processResource(DataSource ds) {
        try (Connection conn = ds.getConnection();
             InputStream stream = new URL("http://example.com/data.txt").openStream()) {
            // Process conn and stream
            System.out.println("Resource processing completed successfully.");
        } catch (IOException | SQLException e) {
            System.out.println("Exception occurred during resource processing: " + e.getMessage());
        } finally {
            System.out.println("Resource processing cleanup completed.");
        }
    }
}
