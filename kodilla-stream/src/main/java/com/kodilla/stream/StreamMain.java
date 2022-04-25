package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecrator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        // Poem Beautifier
        PoemBeautifier beauty = new PoemBeautifier();
        beauty.beautify("na górze róże, na dole mech, kto Cię nie kocha, bodaj by zdechł",
                (poem) -> "Xx " + poem + " xX");
        beauty.beautify("Erika.", poem -> "und das heißt: " + poem);
        beauty.beautify("muda muda muda muda", muda -> muda.toUpperCase());
        beauty.beautify("PROSZE NIE KRZYCZEC W BIBLIOTECE", poem -> poem.toLowerCase());

        // ForumUser
        Forum theForumUsers = new Forum();
        Map<Integer, ForumUser> primeUsers = theForumUsers.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(ForumUser::isOfAge)
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println(primeUsers);

    }
}
