/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ljodi937.roomnavigation;

import java.util.Random;

/**
 *
 * @author jodic
 */
public class Room {
   private String name;
   public Room northPoint;
   public Room eastPoint;
   public Room southPoint;
   public Room westPoint;
   private String description;
   protected GameItem item;
   public boolean hasItem;
    Room(String name){
        this.name = name;
        this.item= null;
    }
    public void setDirection(Room n, Room e, Room s, Room w){
        this.eastPoint=e;
        this.westPoint=w;
        this.northPoint=n;
        this.southPoint=s;
        this.hasItem=false;
    }
   public String roomInfo(){
     String north;
     String west;
     String east;
     String south;
     String iteminfo;
        if(this.northPoint==null){
            north="Going to the North is not an option.";
        }
        else{
            north="You are able to go the "+ this.northPoint.name +" to the north.";
        }
        
        if(this.eastPoint==null){
            east="Going to the East is not an option.";
        }
        else{
            east="You are able to go the "+ this.eastPoint.name +" to the east.";
        }
        
        if(this.southPoint==null){
            south="Going to the South is not an option.";
        }
        else{
            south="You are able to go the "+ this.southPoint.name +" to the south.";
        }
        
        if(this.westPoint==null){
            west="Going to the West is not an option.";
        }
        else{
            west="You are able to go the "+ this.westPoint.name +" to the west.";
        }
        
        if(this.hasItem){
            iteminfo="There is a(n) "+ this.item.getName()+" in the room";
        }
        else{
            iteminfo=" ";
        }
            
     
       return this.name +"\n"+north+"\n"+east+"\n"+south+"\n"+west+"\n\n"+iteminfo;            
   }
    public boolean canNorth(){
        return this.northPoint!=null;
    }
    public boolean canEast(){
        return this.eastPoint!=null;
    }
    public boolean canWest(){
        return this.westPoint!=null;
    }
    public boolean canSouth(){
        return this.southPoint!=null;
    }
    }
