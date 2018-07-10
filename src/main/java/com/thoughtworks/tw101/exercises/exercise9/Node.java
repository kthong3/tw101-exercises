package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<String> names;

    public Node(String name, List<String> names) {
        this.name = name;
        this.names = names;
    }

    public void add(String nameOfNewNode) {
        if(names.isEmpty()){
            names.add(nameOfNewNode);
        }
        else {
            names.add(nameOfNewNode);
            names = organize(names);
        }
    }

    public List<String> names() {
        return organize(names);
    }

    private List<String> organize(List<String> names){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        List<String> ordered = new ArrayList<>();
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if (names.get(j).charAt(0) == alphabet.charAt(i)){
                    ordered.add(names.get(j));
                }
            }
        }
        return ordered;
    }
}
