package com.example.guilogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;


public class Anonymizer {
    // Generate a unique anonymous role ID
    public String generateRoleID() {
        return UUID.randomUUID().toString();
    }
}

class EffortLogger {
    Anonymizer anonymizer = new Anonymizer();
    HashMap<String, List<String>> effortData = new HashMap<>();
    HashMap<String, String> roleMapping = new HashMap<>();
    HashMap<String, String> usernameMapping = new HashMap<>();
    HashMap<String, String> passwordMapping = new HashMap<>();
    private Random random = new Random();

    // Generate a 5-digit unique username
    private String generateUsername() {
        return String.format("%05d", random.nextInt(100000));
    }

    // Generate a 5-character password with numbers and letters
    private String generatePassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }

    // Set username for a given roleID
    public void setUsername(String roleID) {
            String username = generateUsername();
            usernameMapping.put(roleID, username);
    }

    // Set password for a given roleID
    public void setPassword(String roleID) {
        String password = generatePassword();
        passwordMapping.put(roleID, password);
    }

    public String logEffort(String data) {
        String roleID = anonymizer.generateRoleID();
        List<String> logs = new ArrayList<>();
        logs.add(data);
        effortData.put(roleID, logs);
        return roleID;
    }

    public String logEffort(String data, String roleID) {
        if (effortData.containsKey(roleID)) {
            effortData.get(roleID).add(data);
        } else {
            List<String> logs = new ArrayList<>();
            logs.add(data);
            effortData.put(roleID, logs);
        }
        return roleID;
    }

    // Set role for a given roleID
    public void setRole(String roleID, String roleName) {
        roleMapping.put(roleID, roleName);
    }

    // Get role for a given roleID
    public String getRole(String roleID) {
        return roleMapping.get(roleID);
    }

    // Display data for a given roleID
    public void displayDataForRoleID(String roleID) {
        List<String> logs = effortData.get(roleID);
        if (logs != null && !logs.isEmpty()) {
            System.out.println("Effort Data for RoleID " + roleID + ":");
            for (String log : logs) {
                System.out.println(log);
            }
        } else {
            System.out.println("No data found for RoleID " + roleID);
        }
    }
}
