package hw3;

import java.util.*;

public class TelephoneBook {

    Map<String, List<String>> book = new HashMap<>();

    public static void main(String[] args) {
        TelephoneBook book = new TelephoneBook();
        book.add("Иванов", "1324564");
        book.add("Петров", "2345677");
        book.add("Петров", "2345678");
        book.add("Иванов", "2324564");
        book.add("Сидоров", "3324564");
        book.add("Иваненко", "4324564");
        book.add ("Иванов", "6324564");
        book.get("Петров");
        book.get("Иванов");
        book.print();
    }

    public List<String> get(String name) {
        return book.getOrDefault(name, new ArrayList<>());
    }

    public void add(String name, String telephone) {
        List<String> phones = this.get(name);
        phones.add(telephone);
        book.put(name, phones);
    }

    public void print() {
        book.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }

}

