package manager;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ManagerStudent implements IManager<Student> {
    Map<Integer, Student> list;

    public ManagerStudent() {
        this.list = new HashMap<>();
    }

    @Override
    public void add(int key, Student student) {
        list.put(key, student);
    }

    @Override
    public void delete(int id) {
        list.remove(id);
    }

    @Override
    public void update(int id, Student student) {
        list.put(id, student);
    }

    public Student searchById(int id) {
        return list.get(id);
    }

    @Override
    public Map<Integer, Student> findListName(String name) {
        Map<Integer, Student> newList = new HashMap<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
//                newList.put(i, list.get(i));
//            }
//        }
        for (Integer key : list.keySet()
        ) {
            if (list.get(key).getName().toLowerCase().contains(name.toLowerCase())) {
                newList.put(key, list.get(key));
            }

        }
        return newList;
    }

    @Override
    public double averageClass() {
        double sum = 0;
        for (Integer key : list.keySet()
        ) {
            sum += list.get(key).average();
        }
        return sum / list.size();
    }


    @Override
    public Map<Integer, Student> findall() {
        return list;
    }
}

