package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>(){
        {
            add(0, new ForumUser(1, "BigBoi", 'M',
                    2003, 8, 11, 10));
            add(1, new ForumUser(2, "SmolBoi", 'F',
                    1996, 9, 21, 0));
            add(2, new ForumUser(3, "DaBoi", 'M',
                    1989, 8, 31, 0));
            add(3, new ForumUser(4, "YourBoi", 'F',
                    2017, 1, 1, 1));
            add(4, new ForumUser(5, "DasBoi", 'M',
                    2008, 8, 22, 0));
            add(5, new ForumUser(6, "HerrBoi", 'F',
                    2001, 7, 22, 3));
            add(6, new ForumUser(7, "FemBoi", 'F',
                    1966, 11, 5, 5));
            add(7, new ForumUser(8, "Jeffrey Bezos", 'M',
                    1964, 1, 12, 150));
        }
    };

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
