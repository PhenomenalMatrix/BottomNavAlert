package com.example.bottomnav.data;

import com.example.bottomnav.R;
import com.example.bottomnav.models.Character;

import java.util.ArrayList;

public class CharacterClient {

    private ArrayList<Character> list = new ArrayList<>();

    public ArrayList<Character> getList() {
        list.add(new Character("Sanchez Rick", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Rick Sanchez", R.drawable.ic_launcher_foreground));
        list.add(new Character("Sanchez Rick", R.drawable.ic_launcher_background));
        return list;
    }
}
