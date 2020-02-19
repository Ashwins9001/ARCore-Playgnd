package com.example.retrofittest;

import java.util.ArrayList;

//Class used to collect stations
//Routes are embedded inside of an array within it, ref it to another class
public class Books {
   private String name;
   private Routes[] routes;
   public Books(String name){
      this.name = name;
   }
   public String getName(){return name;}
   public Routes[] getRoutes() { return routes; }
}