/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorandcomparabaledemo;

import java.util.Comparator;

/**
 *
 * @author cm
 */
public class MarksComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks()>o2.getMarks()){
            return -1;
        }else if(o1.getMarks()==o2.getMarks()){
            return 0;
        }else{
            return 1;
        }
    }
    
}
