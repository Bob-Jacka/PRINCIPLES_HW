package ru.netology.stats;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.year = 2001;
        post.birthday.month = 12;
        post.birthday.day = 3;
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
