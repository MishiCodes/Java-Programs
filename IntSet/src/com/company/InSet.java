package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class InSet {
    ArrayList<Integer> data;
    public InSet() {
        data = new ArrayList<Integer>();
    }
    public boolean contains(Integer value) {
        for (Integer i : data) {
            if (i == value) return true;
        }
        return false;
    }
    public void add(Integer value) {
        if (contains(value)) return;
        data.add(value);
    }
    public int size() {
        return data.size();
    }
    public void remove(Integer value) {
        if (!contains(value)) {
            throw new NoSuchElementException();
        }
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == value) {
                data.remove(i);
                return;
            }
        }
    }

}
