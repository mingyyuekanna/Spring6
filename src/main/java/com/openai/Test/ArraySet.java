package com.openai.Test;

import java.util.Arrays;

public class ArraySet {
    private String[] hobbies;

    private ArraySetFriend[] friends;

    public void setFriends(ArraySetFriend[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "ArraySet{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", friends=" + Arrays.toString(friends) +
                '}';
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
}
