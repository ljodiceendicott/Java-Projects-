/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.endicott.mocean.medievalmarket;

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
            priceStatement="This item is an very expensive, it is a special import as well as in for a limited time\n";
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
    public String getDescript(){
        return descript;
    }
 
}
  
