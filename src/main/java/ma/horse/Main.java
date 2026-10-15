package ma.horse;

import ma.horse.composant.Boisson;
import ma.horse.composant.Sumatra;
import ma.horse.decorator.Caramel;
import ma.horse.decorator.Chocolat;


public class Main {
    public static void main(String[] args) {
        Boisson boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-------------------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}