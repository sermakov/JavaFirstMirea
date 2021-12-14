package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {
    private User user;
    private User user1;
    private User user2;
    private User userNotAdd;
    private User userNotAdd1;

    @Before
    public void setUp() throws Exception {
        user = new User("Evgeniy", 35, Sex.Male);
        user1 = new User("Marina", 34, Sex.Female);
        user2 = new User("Alina", 7, Sex.Female);

        userNotAdd = new User("", 0, null);
        userNotAdd1 = new User(null, 0, null);


    }

    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
        System.out.println("Test 1 passed");
    }

    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);

        System.out.println("Test 2 passed");
    }

    @Test
    public void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Sex.Male);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);

        System.out.println("Test 3 passed");
    }

    @Test
    public void getAllUsers_MALE_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers(Sex.Male);
        Assert.assertNotNull(expected);

        System.out.println("Test 4 passed");
    }

    @Test
    public void getAllUsers_FEMALE() {
        List<User> expected = User.getAllUsers(Sex.Female);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);

        System.out.println("Test 5 passed");
    }

    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers(Sex.Female);
        Assert.assertNotNull(expected);

        System.out.println("Test 6 passed");
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 7 passed");
    }

    @Test
    public void getHowManyUsers_MALE() {
        int expected = User.getHowManyUsers(Sex.Male);

        int actual = 1;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 8 passed");
    }

    @Test
    public void getHowManyUsers_FEMALE() {
        int expected = User.getHowManyUsers(Sex.Female);

        int actual = 2;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 9 passed");
    }

    @Test
    public void GetAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 35 + 34 + 7;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 10 passed");
    }

    @Test
    public void getAllAgeUsers_MALE() {
        int expected = User.getAllAgeUsers(Sex.Male);

        int actual = 35;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 11 passed");
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        int expected = User.getAllAgeUsers(Sex.Female);

        int actual = 34 + 7;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 12 passed");
    }

    @Test
    public void getAverageAgeOfAllUsers() {
        int expected = User.getAverageAgeOfAllUsers();

        int actual = (35 + 34 + 7) / 3;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 13 passed");
    }

    @Test
    public void getAverageAgeOfAllUsers_MALE() {
        int expected = User.getAverageAgeOfAllUsers(Sex.Male);

        int actual = 35 / 1;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 14 passed");
    }

    @Test
    public void getAverageAgeOfAllUsers_FEMALE() {
        int expected = User.getAverageAgeOfAllUsers(Sex.Female);

        int actual = (34 + 7) / 2;

        Assert.assertEquals(expected, actual);

        System.out.println("Test 15 passed");
    }

    @Test
    public void newUser_EMPTY_NAME() {
        for (User user : User.getAllUsers()){
            if (user.getName() != null && user.getName().isEmpty()) {
                Assert.fail("Попытка создания пользователя с пустым именем");
            }
        }

        System.out.println("Test 16 passed");
    }

    @Test
    public void newUser_AGE_ZERO() {
        for (User user : User.getAllUsers()) {
            if (user.getAge() <= 0) {
                Assert.fail("Попытка создания пользователя c не допустимым возрастом");
            }
        }

        System.out.println("Test 17 passed");
    }

    @Test
    public void newUser_SEX_NO_NULL() {
        for (User user : User.getAllUsers()) {
            if (user.getSex() == null) {
                Assert.fail("Попытка создания пользователя с указанием пола = null");
            }
        }

        System.out.println("Test 18 passed");
    }
}