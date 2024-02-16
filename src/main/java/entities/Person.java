/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Elisa Bothy
 */
public class Person {
    private String name;
    private String forName;
    private LocalDate birthday;

    public Person(String danlta, String alphonse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", forName=").append(forName);
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }

    public Person(String name, String forName, LocalDate birthday) {
        this.name = name;
        this.forName = forName;
        this.birthday = birthday;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.forName);
        hash = 71 * hash + Objects.hashCode(this.birthday);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.forName, other.forName)) {
            return false;
        }
        return Objects.equals(this.birthday, other.birthday);
    }
    
    
}
