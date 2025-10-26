package org.shyam;

public class Student {
    StudentData db = new StudentData();

    public void add(int id, String name, String surname, String email, String phone, String branch, String joiningYear) {
        try {
            db.add(id, name, surname, email, phone, branch, joiningYear);
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            db.delete(id);
            System.out.println("Student deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, String column, String value) {
        try {
            db.update(id, column, value);
            System.out.println("Student updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void fetch(int id) {
        try{
            db.fetch(id);
            System.out.println("Student fetched successfully.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void fetchAll() {
        try{
            db.fetchAll();
            System.out.println("Student fetched successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
