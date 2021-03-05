package modelo;

import control.ConnectDBAnimalsZoo;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;

public class Animals {

    private int idAnimal, Weight;
    private String BirthDayAnimals, NameAnimal;
    private String PhotoAnimals;

    public Animals() {
    }

    public Animals(int idAnimal, String NameAnimal, String BirthDayAnimals, int Weight) {
        this.idAnimal = idAnimal;
        this.Weight = Weight;
        this.BirthDayAnimals = BirthDayAnimals;
        this.NameAnimal = NameAnimal;
    }

    public Animals(String NameAnimal, String BirthDayAnimals, int Weight, String PhotoAnimals) {
        this.Weight = Weight;
        this.BirthDayAnimals = BirthDayAnimals;
        this.NameAnimal = NameAnimal;
        this.PhotoAnimals = PhotoAnimals;
    }

    public Animals(int idAnimal, String NameAnimal, String BirthDayAnimals, int Weight, String PhotoAnimals) {
        this.idAnimal = idAnimal;
        this.Weight = Weight;
        this.BirthDayAnimals = BirthDayAnimals;
        this.NameAnimal = NameAnimal;
        this.PhotoAnimals = PhotoAnimals;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getBirthDayAnimals() {
        return BirthDayAnimals;
    }

    public void setBirthDayAnimals(String BirthDayAnimals) {
        this.BirthDayAnimals = BirthDayAnimals;
    }

    public String getNameAnimal() {
        return NameAnimal;
    }

    public void setNameAnimal(String NameAnimal) {
        this.NameAnimal = NameAnimal;
    }

    public String getPhotoAnimals() {
        return PhotoAnimals;
    }

    public void setPhotoAnimals(String PhotoAnimals) {
        this.PhotoAnimals = PhotoAnimals;
    }

    @Override
    public String toString() {
        return "Animales " + " idAnimal: " + idAnimal + "  Weight: " + Weight + "  BirthDayAnimals: " + BirthDayAnimals + " NameAnimal: " + NameAnimal + "  PhotoAnimals: " + PhotoAnimals + '}';
    }

    public boolean insertAnimal(Animals obA, FileInputStream fis, File f) {

        boolean t = false;
        PreparedStatement ps = null;
        ConnectDBAnimalsZoo objC = new ConnectDBAnimalsZoo();
        String sql = "insert into Animales values(?,?,?,?,?)";
        try {
            if (objC.crearConexion()) {
                objC.getConexion().setAutoCommit(false);

                ps = objC.getConexion().prepareStatement(sql);
                ps.setInt(1, obA.getIdAnimal());
                ps.setInt(2, obA.getWeight());
                ps.setString(3, obA.getBirthDayAnimals());
                ps.setString(4, obA.getNameAnimal());
                ps.setBinaryStream(5, fis, (int) f.length());

                ps.executeUpdate();
                objC.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            t = false;
            System.out.println("Error " + ex.toString());
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {

                System.out.println("Error " + ex.toString());
            }
        }

        return t;

    }

}
