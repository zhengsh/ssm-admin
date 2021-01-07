package cn.edu.cqvie.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
   
   private List<Observer> observers
      = new ArrayList<>();
   private int state;
 
   public int getState() {
      return state;
   }
 
   public void setState(int state) {
      this.state = state;
      notifyAllObservers(state);
   }
 
   public void attach(Observer observer){
      observers.add(observer);      
   }
 
   public void notifyAllObservers(int state){
      for (Observer observer : observers) {
         if (state == observer.careNumber) {
            observer.update();
         }
      }
   }  
}