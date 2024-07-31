package com.example.demo.designpattern.structural.composite.task;

import java.util.ArrayList;
import java.util.List;

abstract class TaskComponent {
    String name;
    public TaskComponent(String name){
        this.name = name;
    }

    public abstract void display(String indent);

}

class Task extends TaskComponent {
    public Task(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Task: " + name);
    }
}


class Project extends TaskComponent {
    private List<TaskComponent> components = new ArrayList<>();

    public Project(String name) {
        super(name);
    }

    public void addComponents(TaskComponent component){
        components.add(component);
    }

    public void addComponents(List<TaskComponent> components) {
        this.components.addAll(components);
    }

    public void removeComponents(TaskComponent component){
        components.remove(component);
    }


    @Override
    public void display(String indent) {
        System.out.println(indent + "Project: " + name);
        String newIndent = indent + "  ";
        for (TaskComponent component : components) {
            component.display(newIndent);
        }
    }

}

class Demo{
    public static void main(String[] args) {
            Project projectATS = new Project("Applicant Tracker System");
            Project atsCandidate = new Project("ATS Candidate");
            Task task = new Task("Task a");
            Task task2 = new Task("Task b");
            Task task3 = new Task("Task c");

            projectATS.addComponents(atsCandidate);
            atsCandidate.addComponents(task);
            projectATS.addComponents(task2);
            projectATS.addComponents(task3);

            projectATS.display("*");

    }
}



