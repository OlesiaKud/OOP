package less3.dz.data;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String secondName;

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }


    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    //     toString
    @Override
    public String toString() {
        return "User{" +
                "Фамилия: '" + firstName + '\'' +
                ", Имя: '" + secondName + '\'' +
                '}';
    }
    //    переопределяем равенство
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }

        return getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null;
    }
}
