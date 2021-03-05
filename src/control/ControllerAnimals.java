
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.logging.Logger;
import modelo.Animals;

public class ControllerAnimals {
     
    public boolean insertAnimal(Animals obA) {
          boolean t = false;
        FileInputStream fis=null;
        File file = new File(obA.getPhotoAnimals());
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ex.toString());
        }
        t = obA.insertAnimal(obA, fis, file);
        return t;

    }
     
      public boolean insertAnimal(LinkedList<Animals> ListAnimals) {
        boolean t = false;
        FileInputStream fis=null;
        Animals objE=new Animals();
        for (int i = 0; i < ListAnimals.size(); i++) {
         
        File file = new File(ListAnimals.get(i).getPhotoAnimals());
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ex.toString());
        }
        t = objE.insertAnimal(ListAnimals.get(i),fis,file);
        }
        return t;
    }
         
     
}
