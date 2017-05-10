/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpartialexam;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class SecondPartialExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         IVehicle[] myArray = new IVehicle[5];

      myArray[0] = new Jeep("Fred's Jeep");
      myArray[1] = new Jeep("Frank's Jeep");
      myArray[2] = new Hovercraft("Sue's Hover-craft");
      myArray[3] = new Frigate("Money Waster");
      myArray[4] = new PoliceCar("Rum Rum");

      for (int i=0; i<myArray.length; i++) {

         System.out.println(myArray[i].getName());

         if (myArray[i] instanceof ILandVehicle) {
            ILandVehicle lv = (ILandVehicle)myArray[i];
            lv.drive();
         }
      }
      System.out.println("");//Solo es para dar espacio porque se veia feo y no me entendia.
      for (int i=0; i<myArray.length; i++) {//Loop for de IEmergency

         System.out.println(myArray[i].getName());

         if (myArray[i] instanceof IEmergency) {
            IEmergency lv = (IEmergency)myArray[i];
            lv.soundSiren();
         }
      }
      //Coleecion de objetos
      Jeep n1 = new Jeep("Fred´s Jeep");
      Jeep n2 = new Jeep("Frank´s Jeep");
      Hovercraft n3 = new Hovercraft("Sue's Hover-craft");
      Frigate n4 = new Frigate("Money Waster");
      PoliceCar n5 = new PoliceCar("Rum Rum");
     //Lista
      List<IVehicle> myVehicles = new LinkedList<>();
      myVehicles.add(n1);
      myVehicles.add(n2);
      myVehicles.add(n3);
      myVehicles.add(n4);
      myVehicles.add(n5);
      //Ciclo for
      System.out.println("");//Solo es para dar espacio porque se veia feo y no me entendia.
      for(IVehicle temp: myVehicles){
          System.out.println(temp.getName());
          if(temp instanceof ILandVehicle){//Si es que mi objeto es parte de ILandVehicle tiene que manejar.
              ((ILandVehicle) temp).drive();
          }
      }
        System.out.println("");//Solo es para dar espacio porque se veia feo y no me entendia.
      for(IVehicle temp: myVehicles){
          System.out.println(temp.getName());
          if(temp instanceof IEmergency){//Si es que mi objeto es parte de ILandVehicle tiene que manejar.
              ((IEmergency) temp).soundSiren();
          }
      }     
    }
    
}
