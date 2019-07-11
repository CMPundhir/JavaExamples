/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorandcomparabaledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cm
 */
public class ComparatorAndComparabaleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> rankingList = new ArrayList<>();
        rankingList.add(23);
        rankingList.add(2);
        rankingList.add(43);
        rankingList.add(86);
        rankingList.add(8);
        rankingList.add(89);
        rankingList.add(65);
        rankingList.add(265);
        Collections.sort(rankingList);
        //System.out.println(rankingList);
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Rinku",100));
        list.add(new Student(2,"Piyush",10));
        list.add(new Student(4,"Ramu",60));
        list.add(new Student(5,"Ashna",80));
        list.add(new Student(3,"Sanyam",22));
        list.add(new Student(6,"Tushar",1));
        MarksComparator marksComparator = new MarksComparator();
        Collections.sort(list,marksComparator);
        System.out.println(list);
    }
    
}
