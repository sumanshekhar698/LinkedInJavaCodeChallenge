package com.sumanshekhar.challenges.noob;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentVolunteers {

    public static void main(String[] args) {

        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");


        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market",
                                                            List.of("Sally", "Polly"),
                                                            "Car Wash Fundraiser",
                                                            List.of("Molly", "Tony", "Polly"),
                                                            "Cooking Workshop",
                                                            List.of("Sally", "Molly", "Polly"),
                                                            "Midnight Breakfast",
                                                            List.of("Polly", "Molly")
                                                            ,"Garden Cleaning",
                                                            List.of("Ben", "Molly")
        );


        System.out.println(findWithIncompleteEvents(students,
                attendeesMapping));

    }

    static List<String> findWithIncompleteEvents(List<String> students, Map<String, List<String>> attendeesMapping) {

        Map<String, Integer> studentEventCount = students.stream().collect(Collectors.toMap(s->s,v->0));

        attendeesMapping.values().forEach(list -> list.stream().
                filter(studentEventCount::containsKey).
                forEach(filteredStudent -> studentEventCount.
                        put(filteredStudent,studentEventCount.get(filteredStudent)+1)
                )
        );

        return studentEventCount.entrySet().stream().filter(entry->entry.getValue()<2).map(Map.Entry::getKey).collect(Collectors.toList());

//        return List.of();
    }
}
