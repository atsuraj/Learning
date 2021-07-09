package com.grocery.controller;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CostCalculate {
    private int s;

    class Project {
        ArrayList<Project> children = new ArrayList<Project>();
        HashMap<String, Project> nameMap = new HashMap<String,Project>();
        int dependencies;
        String name;
        public Project(String name) {
            this.name = name;
        }
        public void addDependency(Project node) {
            if (!nameMap.containsKey(node.name)) {
                children.add(node);
                dependencies++;
            }
        }
    }
     class Graph {
        ArrayList<Project> nodes = new ArrayList<Project>();
        HashMap<String, Project> nameMap = new HashMap<String, Project>();
        public void addEdge(String start, String end) {
            Project startProject = getOrCreateNode(start);
            Project endProject = getOrCreateNode(end);
            startProject.addDependency(endProject);
        }
        public Project getOrCreateNode(String name) {
            if (!nameMap.containsKey(name)) {
                Project newProject = new Project(name);
                nameMap.put(name, newProject);
                nodes.add(newProject);
            }
            return nameMap.get(name);
        }
    }
     class Solution {
        public void buildGraph(String[] projects, String[][] dependencies) {
            Graph graph = new Graph();
            for (String project : projects) graph.getOrCreateNode(project);
            for (String[] dependency : dependencies) {
                graph.addEdge(dependency[0],dependency[1]);
            }
        }

    }


         public static void main(String[] args) throws IOException
        {

            File file = new File("C:\\Users\\kumar-suraj\\Downloads\\output-onlinetexttools.txt");


            FileInputStream fileStream = new FileInputStream(file);
            InputStreamReader input = new InputStreamReader(fileStream);
            BufferedReader reader = new BufferedReader(input);

            FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);


            String line;

            HashMap<String,Integer> hmap = new HashMap<>();
            // Reading line by line from the
            // file until a null is returned
            while((line = reader.readLine()) != null)
            {




                // \\s+ is the space delimiter in java
                    line= line.replaceAll("[^a-zA-Z0-9]", " ");
                    line= line.trim();
                    List<String> wordList = Arrays.stream(line.split("\\s+")).map(s1 -> s1.trim()).collect(Collectors.toList());
                   wordList.forEach(s->{
                           if(!s.trim().equals("")){
                               s= s.toLowerCase();

                               if(hmap.containsKey(s)){
                                   hmap.put(s,hmap.get(s)+1);
                               }else{
                                   hmap.put(s,1);
                               }
                           }
                    });

                }


            HashMap<String, Integer> temp
                    = hmap.entrySet()
                    .stream()
                    .sorted((i1, i2)
                            -> i2.getValue().compareTo(
                            i1.getValue()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1, LinkedHashMap::new));


            int i =1;
            for(Map.Entry map : temp.entrySet()){
                System.out.println(map.getKey()+" :" + map.getValue());
                if(i==20){
                    break;
                }
                i++;
            }


    }
}

