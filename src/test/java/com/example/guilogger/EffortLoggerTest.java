package com.example.guilogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EffortLoggerTest {
    private EffortLogger effortLogger;
    @BeforeEach
    void setUp() {
        effortLogger = new EffortLogger();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setUsername() {
        String roleID = effortLogger.anonymizer.generateRoleID();
        effortLogger.setUsername(roleID);
        assertNotNull(effortLogger.usernameMapping.get(roleID));
        assertTrue(effortLogger.usernameMapping.get(roleID).matches("\\d{5}"));
    }

    @Test
    void setPassword() {
        String roleID = effortLogger.anonymizer.generateRoleID();
        effortLogger.setPassword(roleID);
        assertNotNull(effortLogger.passwordMapping.get(roleID));
        assertTrue(effortLogger.passwordMapping.get(roleID).matches("[A-Z0-9]{5}"));
    }


    @Test
    void logEffort() {
        String roleID = effortLogger.logEffort("Test Data");
        assertNotNull(effortLogger.effortData.get(roleID));
        assertFalse(effortLogger.effortData.get(roleID).isEmpty());
        assertEquals("Test Data", effortLogger.effortData.get(roleID).get(0));
    }

    @Test
    void testLogEffort() {
        String roleID = effortLogger.logEffort("Initial Data");
        effortLogger.logEffort("Additional Data", roleID);
        assertEquals(2, effortLogger.effortData.get(roleID).size());
        assertEquals("Additional Data", effortLogger.effortData.get(roleID).get(1));
    }


    @Test
    void setRole() {
        String roleID = effortLogger.anonymizer.generateRoleID();
        effortLogger.setRole(roleID, "Developer");
        assertEquals("Developer", effortLogger.roleMapping.get(roleID));
    }

    @Test
    void getRole() {
        String roleID = effortLogger.anonymizer.generateRoleID();
        effortLogger.setRole(roleID, "Tester");
        assertEquals("Tester", effortLogger.getRole(roleID));
    }

    @Test
    void displayDataForRoleID() {
        String roleID = effortLogger.logEffort("Test Log");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        effortLogger.displayDataForRoleID(roleID);

        String expectedOutput = "Effort Data for RoleID " + roleID + ":\nTest Log\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}