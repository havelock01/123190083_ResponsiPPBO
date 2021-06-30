/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipe;

import javax.swing.JOptionPane;
import koneksiDb.EditDB;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class SetPrototipe {
    EditDB film;
    Object[][] films = new Object[50][4];
    public SetPrototipe(EditDB editDB) {
        this.film = editDB;
    }

    public Object[][] index(){
       films = film.getEditDB();
       return films;
   }
    
    public void box(String judul, double alur, double penokohan, double akting){
        boolean filmada = false;
        for (int i = 0; films[i][0] != null; i++) {
            if(films[i][0].toString().equals(judul)){
                filmada = true;
                break;
            }
        }
        if(filmada){
            JOptionPane.showMessageDialog(null,"Film have done in DB!!!");
        } else {
            if(alur > 5.0 || penokohan > 5.0 || akting > 5.0){
               JOptionPane.showMessageDialog(null,"Maks. alur, penokohan, dan akting adalah 5!"); 
            } else if(alur < 0 || penokohan < 0 || akting < 0){
                JOptionPane.showMessageDialog(null,"Min. alur, penokohan, dan akting adalah 0!");
            } else{
                film.input(judul, alur, penokohan, akting);
                JOptionPane.showMessageDialog(null,"Success add Film");
            }
        }
    }

    public void update(String judul, double alur, double penokohan, double akting) {
        boolean find = false;
        int index = -1;
        for (int i = 0; films[i][0] != null; i++) {
            if(films[i][0].toString().equals(judul)){
                index = i;
                find = true;
                break;
            }
        }
        if(find){
            if(alur > 5.0 || penokohan > 5.0 || akting > 5.0){
               JOptionPane.showMessageDialog(null,"Mak. alur, penokohan, dan akting adalah 5!"); 
            } else if(alur < 0 || penokohan < 0 || akting < 0){
                JOptionPane.showMessageDialog(null,"Min. alur, penokohan, dan akting adalah 0!");
            } else{
                film.update(films[index][0].toString(), alur, penokohan, akting);
                JOptionPane.showMessageDialog(null,"UPDATE DONE :) !!!!");
            }
        }else{
           JOptionPane.showMessageDialog(null,"Not Found -_-"); 
        }
    }

    public void delete(String judul) {
        boolean find = false;
        int index = -1;
        for (int i = 0; films[i][0] != null; i++) {
            if(films[i][0].toString().equals(judul)){
                index = i;
                find = true;
                break;
            }
        }
        if(find){
            film.delete(films[index][0].toString());
            JOptionPane.showMessageDialog(null,"Done to delete :) ");
        }else{
           JOptionPane.showMessageDialog(null,"Not Found -_-"); 
        }
    }
}
