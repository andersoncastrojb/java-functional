package org.example.activity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Point01 {

    public static class MutableEmployee {
        private String name;
        private String role;
        private String team;
        private List<String> skills;

        public MutableEmployee(String name, String role, String team, List<String> skills) {
            this.name = name;
            this.role = role;
            this.team = team;
            this.skills = skills;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public List<String> getSkills() {
            return skills;
        }

        public void setSkills(List<String> skills) {
            this.skills = skills;
        }

        @Override
        public String toString() {
            return "MutableEmployee{" +
                    "name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    ", team='" + team + '\'' +
                    ", skills=" + skills +
                    '}';
        }
    }


    public static final class ImMutableEmployee {
        private final String name;
        private final String role;
        private final String team;
        private final List<String> skills;

        public ImMutableEmployee(String name, String role, String team, List<String> skills) {
            this.name = name;
            this.role = role;
            this.team = team;
            this.skills = skills;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public String getTeam() {
            return team;
        }

        public final List<String> getSkills()  {
            return new LinkedList<>(skills);
        }

        @Override
        public String toString() {
            return "InMutableEmployee{" +
                    "name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    ", team='" + team + '\'' +
                    ", skills=" + skills +
                    '}';
        }
    }

    public static void attackFunctionToMutableEmployee(MutableEmployee mutableEmployee) {
        List<String> skills = mutableEmployee.getSkills();
        skills.clear();
        skills.add("Playing Mario Bros");
        skills.add("Cooking");
    }

    public static void attackFunctionToImMutableEmployee(ImMutableEmployee imMutableEmployee) {
        List<String> skills = imMutableEmployee.getSkills();
        skills.clear();
        skills.add("Playing Mario Bros");
        skills.add("Cooking");
    }

    public static void main(String[] args) {
        List<String> skillsOfMutableEmployee = new ArrayList<>();
        skillsOfMutableEmployee.add("Python");
        skillsOfMutableEmployee.add("Java");
        MutableEmployee mutableEmployee = new MutableEmployee("Pepe",
                "Developer",
                "CyberSecurity",
                skillsOfMutableEmployee);


        List<String> skillsOfImMutableEmployee = new ArrayList<>();
        skillsOfImMutableEmployee.add("Python");
        skillsOfImMutableEmployee.add("Java");
        ImMutableEmployee imMutableEmployee = new ImMutableEmployee("Juliana",
                "QA",
                "Testing",
                skillsOfImMutableEmployee);

        System.out.println("Mutable employee " + mutableEmployee.toString());
        System.out.println("Immutable employee " + imMutableEmployee.toString());

        attackFunctionToMutableEmployee(mutableEmployee);
        attackFunctionToImMutableEmployee(imMutableEmployee);

        System.out.println("Mutable employee after attack " + mutableEmployee.toString());
        System.out.println("Immutable employee after attack " + imMutableEmployee.toString());
    }
}
