package com.company;

public class TV {
    public int channel;
    public int volumeLevel;
    public boolean on;

    public TV(){

    }
    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel) {
        if(newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        } else{
            System.out.println("Not valid channel");
        }
    }

    public void setVolume(int newVolumeLevel) {
        if(newVolumeLevel >= 1 && newVolumeLevel <= 7){
            volumeLevel = newVolumeLevel;
        } else{
            System.out.println("Not valid volume level");
        }
    }

    public void channelUp(){
        if(channel < 120){
            channel++;
        } else {
            System.out.println("It is maximum channel");
        }
    }

    public void channelDown(){
        if(channel > 1){
            channel--;
        } else {
            System.out.println("It is minimum channel");
        }
    }

    public void volumeUp(){
        if(volumeLevel < 7){
            volumeLevel++;
        } else {
            System.out.println("It is maximum volume level");
        }
    }

    public void volumeDown(){
        if(volumeLevel > 1){
            volumeLevel--;
        } else {
            System.out.println("It is minimum volume level");
        }
    }

    public int getChannel(){
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void printTV(){
        System.out.println("TV state is :" + on + "\nTV channel is : " + channel + "\nTV volume level is : " + volumeLevel);
    }
}
