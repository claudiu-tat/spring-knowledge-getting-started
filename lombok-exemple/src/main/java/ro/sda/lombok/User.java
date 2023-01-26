package ro.sda.lombok;

import lombok.*;

// @Data -> is a shortcut for @ToString @EqualsAndHashCode, @Getter, @Setter
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;

    //ctrl + shift + t for creating a test

}
