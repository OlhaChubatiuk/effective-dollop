/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ольга
 */
public class sortApproach3 {

    
    private List<String> stringlist;
    private List<Integer> intlist;

    public List<String> getUnsortedStringList() {
        return stringlist;
    }

    public List<Integer> getUnsortedIntList() {
        return intlist;
    }

    public List<Integer> mergeLists(List<Integer> integerlist1, List<Integer> integerlist2) {//злиття
        List<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < integerlist1.size() || i2 < integerlist2.size()) {
            if (!(i1 < integerlist1.size())) {
                result.add(integerlist2.get(i2));
                i2++;
            } else if (!(i2 < integerlist2.size())) {
                result.add(integerlist1.get(i1));
                i1++;
            } else {
                if (integerlist1.get(i1) <= integerlist2.get(i2)) {
                    result.add(integerlist1.get(i1));
                    i1++;
                } else {
                    result.add(integerlist2.get(i2));
                    i2++;
                }
            }
        }
        return result;
    }

    public List<String> mergeLists_2(List<String> stringlist1, List<String> stringlist2) {
        List<String> result = new ArrayList<>();
        int s1 = 0;
        int s2 = 0;

        while (s1 < stringlist1.size() || s2 < stringlist2.size()) {
            if (!(s1 < stringlist1.size())) {
                result.add(stringlist2.get(s2));
                s2++;
            } else if (!(s2 < stringlist2.size())) {
                result.add(stringlist1.get(s1));
                s1++;
            } else {
                if (stringlist1.get(s1).compareTo(stringlist2.get(s2)) >= 0) {
                    result.add(stringlist1.get(s1));
                    s1++;
                } else {
                    result.add(stringlist2.get(s2));
                    s2++;
                }
            }
        }
        return result;
    }
    

    public List<Integer> sortApproach3_int() { //пошук
        int p, q, r, t; //p q r t
        List<Integer> result = new ArrayList<>();
        result.addAll(intlist);

        int n = result.size() - 1;
        int k = 1;
        while (k < n) {
            List<Integer> tempList = new ArrayList<>(); //тимчасовий лист
            t = 0;
            while (t < t + 1) {
                p = t; //початок масиву
                q = t + k; //середина
                if (q > n + 1) {
                    q = n + 1;
                }
                r = t + 2 * k; //кінець
                if (r > n + 1) {
                    r = n + 1;
                }
                t = r;
                tempList.addAll(mergeLists(result.subList(p, q), result.subList(q, r)));
            }
            result = tempList;
            k *= 2;
        }
        return result;
    }

    public List<String> sortApproach3_string() {
        int p, q, r, t;
        List<String> result = new ArrayList<>();
        result.addAll(stringlist);

        int n = result.size() - 1;
        int k = 1;
        while (k < n) {
            List<String> tempList = new ArrayList<>();
            t = 0;
            while (t < t + 1) {
                p = t;
                q = t + k;
                if (q > n + 1) {
                    q = n + 1;
                }
                r = t + 2 * k;
                if (r > n + 1) {
                    r = n + 1;
                }
                t = r;
                tempList.addAll(mergeLists_2(result.subList(p, q), result.subList(q, r)));
            }
            result = tempList;
            k *= 2;
        }
        return result;
    }
}
