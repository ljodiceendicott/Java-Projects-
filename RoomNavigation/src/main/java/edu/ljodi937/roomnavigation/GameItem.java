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
public class GameItem {
    private String name;
    private String descript;
    private int price;
    private int hpMod;
    
    public GameItem(String name, int price, int hpMod, String flavText){
        this.name = name;
        this.price = price;
        this.hpMod =hpMod;
        this.descript= makeDescript() + flavText;
    }
    //This is the gameitem for the room nav:
    public GameItem(String name, String itusage){
        this.name= name;
        this.descript= getGameDescript(itusage);
        this.hpMod = 0;
        this.price= 0;
    }
 
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getHpMod(){
        return hpMod;
    }
    public String getShort(){
        return this.name+"("+getPrice()+")Gold";
    }
    private String makeDescript(){
        String priceStatement;
        String healthMod;
        if(this.price>200){
            priceStatement="This item is an very expensive, This item has been around for a very long time since before anyone you know\n";
            }
        else if(this.price>= 25){
            priceStatement="This item is commercially avaliable, mass-produced, but great quality\n";
            }
            else{
            priceStatement="This item is dirt cheap, even a begger could buy this\n";
            }
        
        if(this.hpMod>0){
            healthMod= this.name+ " has been seen to be quite nutritious. The merchant recommends eating this item\n";
            }
        else if(this.hpMod==0){
            healthMod= this.name + " is not very good for you, But it wont kill you.\n The merchant recommends not eating this item, it may be useful elsewhere besides your stomach \n"; 
            }
        else{
            healthMod= this.name+ " is gross. Could be used to hurt yourself or others.......\n Merchant recommends this item to be weaponized\n";
        }
        
        descript= this.name + ":\n\n" + priceStatement+ healthMod; 
        return descript;
    }
    private String getGameDescript(String whenUse){
        String itemcond;
        Random rand = new Random();
        int randcon = rand.nextInt(101);
        if(randcon>=90){
            itemcond= this.name+ " has been barely used.It appears to be brand new to your eyes.";
            descript = itemcond+ whenUse;
        }
        else if(randcon>=50){
            itemcond= this.name+ " has been used a decent amount of times. It still appears to be in decent condition.";
            descript = itemcond+ whenUse;
        }
        else if(randcon>=30){
            itemcond= this.name+ " has been through some tough times but will still get you out of a pickle if you needed it to.";
            descript = itemcond+ whenUse;
        }
        else{
            itemcond="You may only have one or two uses with this item unless you are super duper carful.";
            descript = itemcond+ whenUse;
        }
        return descript;
    }
    public String getDescript(){
        return descript;
    }
    @Override
    public String toString(){
     return this.name;   
    }
 
}
  
