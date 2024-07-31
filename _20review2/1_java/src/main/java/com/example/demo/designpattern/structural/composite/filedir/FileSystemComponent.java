package com.example.demo.designpattern.structural.composite.filedir;

import java.util.ArrayList;
import java.util.List;

abstract class FileSystemComponent {
    String name;
    public FileSystemComponent(String name){
        this.name = name;
    }

    public abstract void display(String indent);

}

class File extends FileSystemComponent{
    public File(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name);
    }
}


class Directory extends FileSystemComponent{
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponents(FileSystemComponent component){
        components.add(component);
    }



    public void removeComponents(FileSystemComponent component){
        components.remove(component);
    }


    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name);
        String newIndent = indent + "  ";
        for (FileSystemComponent component : components) {
            component.display(newIndent);
        }
    }

}

class Demo{
    public static void main(String[] args) {
        Directory root = new Directory("💾 Data (D)");
        Directory dirProject = new Directory("📁 01_Project");
        Directory dirArchive = new Directory("📁 04_Archive");
        Directory dirArchive2 = new Directory("🖼️ 02_Picture");
        Directory dirArchive3 = new Directory("🎶 03_music");


        Directory tugasPBO = new Directory("📁 Tugas PBO");
        File file1 = new File("📄 Main.java");
        Directory controller = new Directory("📁 Controller");
        Directory dao = new Directory("📁 dao");
        Directory connection = new Directory("📁 connection");
        Directory model = new Directory("📁 model");

        root.addComponents(dirProject);
        root.addComponents(dirArchive);

        dirProject.addComponents(tugasPBO);
        tugasPBO.addComponents(file1);
        tugasPBO.addComponents(dao);
        tugasPBO.addComponents(controller);
        tugasPBO.addComponents(connection);
        tugasPBO.addComponents(model);

        root.display("*");


    }
}



