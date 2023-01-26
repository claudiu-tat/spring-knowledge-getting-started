package ro.sda.lombok;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserTest {

    @Test
    void testSetFirstNameReflection() throws NoSuchFieldException, IllegalAccessException {

        User user = new User();
        user.setFirstName("Clau");

        Field field = user.getClass().getDeclaredField("firstName"); // here we use the java reflection to see the fields if is private
        field.setAccessible(true);

        assertEquals("Clau", field.get(user));
    }

}