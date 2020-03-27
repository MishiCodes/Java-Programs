package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static <T extends Comparable> T findMax(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentExceptionException("Collection is empty");
        }
        T max = it.next();

        while(it.hasNext()) {
            T current = it.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        Collection<ArrayList> collection = new Collection<ArrayList>() {



























































    }
}
