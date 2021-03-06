/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sfey
 */
public class hauptseite extends javax.swing.JFrame {

    HashMap<Integer,String> kommentare;
    /**
     * Creates new form hauptseite
     */
    public hauptseite() {
        initComponents();  
        databaseexecutes dbverbindung= new  databaseexecutes();
        dbverbindung.DatabaseConnection();
        //Set Username in Mainpage
        String sql_username="SELECT login_name FROM login WHERE login_id='"+user.GetInstance().getUser_id()+"'";
        ResultSet rs_username=dbverbindung.SQLQuerry(sql_username);
        try {
            while(rs_username.next()){
                f_username.setText(rs_username.getString("login_name"));
            }
            //TopTen initialisieren
              ArrayList<String> top=getTopTenFilme();
            for (Object topTenFilme : getTopTenFilme()) {
                f_topten.setListData(top.toArray());
            }
        } catch (SQLException ex) {
            Logger.getLogger(hauptseite.class.getName()).log(Level.SEVERE, null, ex);
        } 
        s_filter.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(s_filter.getText().length()%3==0 && s_filter.getText().length()!=0){
                    btn_search.doClick();
            }}

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        s_filter = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        f_topten = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        f_beschreibung = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        k_text = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        f_wertung = new javax.swing.JLabel();
        b_wert = new javax.swing.JTextField();
        f_titel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        f_komentar = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        f_username = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        f_genrelist = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_search.setText("Film suchen");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        f_topten.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(f_topten);

        jLabel2.setText("Top Ten Filme");

        f_beschreibung.setEditable(false);
        f_beschreibung.setColumns(20);
        f_beschreibung.setRows(5);
        jScrollPane2.setViewportView(f_beschreibung);

        jLabel4.setText("Wertung:");

        k_text.setColumns(20);
        k_text.setRows(5);
        jScrollPane3.setViewportView(k_text);

        jButton2.setText("Absenden");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Wertung 1-10");

        jLabel1.setText("Kommerntare:");

        jScrollPane5.setViewportView(f_komentar);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Benutzername");

        jLabel7.setText("Genre:");

        f_genrelist.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane4.setViewportView(f_genrelist);

        jButton3.setText("bearbeiten");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Film erstellen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(s_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_search)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_username, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(b_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(f_wertung, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 66, Short.MAX_VALUE))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2)
                                            .addComponent(jLabel1))
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(f_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(f_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                            .addComponent(f_wertung, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b_wert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       ResultSet rs_titel;
       ResultSet rs_beschreibung;
       ResultSet rs_rank;
       ResultSet rs_user_wertung;
       ResultSet rs_user_kritik;
       
       try{
              databaseexecutes dbverbindung = new databaseexecutes();
              dbverbindung.DatabaseConnection();              
              String film_name=s_filter.getText();              
              String sql_suche="SELECT * FROM film WHERE UPPER(titel)=Upper('"+film_name+"') OR UPPER(titel) like UPPER('%"+film_name+"%')";
              String sql_beschr="SELECT beschreibung FROM film WHERE UPPER(titel)=UPPER('"+film_name+"') OR UPPER(titel) like UPPER('%"+film_name+"%')"; 
              //String sql_wertung="SELECT AVG(bewertung) AS wertung FROM film INNER JOIN bewertung ON film.film_id=bewertung.fk_film_id WHERE bewertung.fk_film_id=(SELECT film_id FROM film WHERE UPPER(titel)=UPPER('"+film_name+"') OR UPPER(titel) LIKE UPPER('%"+film_name+"%'))";
              //String sql_user_wertung="SELECT bewertung FROM bewertung WHERE fk_film_id = (SELECT film_id FROM film WHERE UPPER(titel)=Upper('"+film_name+"') OR UPPER(titel) LIKE UPPER('%"+film_name+"%')) AND fk_login_id = '"+user.GetInstance().getUser_id()+"'";
              //String sql_kritik="SELECT kommentar FROM bewertung WHERE fk_film_id = (SELECT film_id FROM film WHERE UPPER(titel)=Upper('"+film_name+"') OR UPPER(titel) LIKE UPPER('%"+film_name+"%')) AND fk_login_id = '"+user.GetInstance().getUser_id()+"'";
              rs_titel=dbverbindung.SQLQuerry(sql_suche);
              if (rs_titel.next()){
                  f_titel.setText(rs_titel.getString("titel"));
                  rs_beschreibung=dbverbindung.SQLQuerry(sql_beschr);
                  while(rs_beschreibung.next()){
                      f_beschreibung.setText(rs_beschreibung.getString("beschreibung"));
                  }
              String sql_wertung="SELECT AVG(bewertung) AS wertung FROM film INNER JOIN bewertung ON film.film_id=bewertung.fk_film_id WHERE bewertung.fk_film_id=(SELECT film_id FROM film WHERE titel='"+f_titel.getText()+"')";
              //Bewertungsdurchschnitt ausrechen
              rs_rank=dbverbindung.SQLQuerry(sql_wertung);
              while(rs_rank.next()){
              f_wertung.setText(rs_rank.getString("wertung"));
              }
              //Genre ausgeben              
              ArrayList<String> genre = getGenre();
              for (Object Genre : getGenre()){
                  f_genrelist.setListData(genre.toArray());
              }
              //Kommentare hohlen und in Liste schreiben
              ArrayList<String>  komi = getKommentarFilm();
                  for (Object kommentarFilm : getKommentarFilm()) {
                      f_komentar.setListData(komi.toArray());
                  }
              String sql_user_wertung="SELECT bewertung FROM bewertung WHERE fk_film_id = (SELECT film_id FROM film WHERE titel='"+f_titel.getText()+"') AND fk_login_id = '"+user.GetInstance().getUser_id()+"'";    
              //Benutzer spezifische Wertung hohlen
                  b_wert.setText("");
                  rs_user_wertung=dbverbindung.SQLQuerry(sql_user_wertung);
                  while(rs_user_wertung.next()){
                      b_wert.setText(rs_user_wertung.getString("bewertung"));
                  }
              String sql_kritik="SELECT kommentar FROM bewertung WHERE fk_film_id = (SELECT film_id FROM film WHERE titel='"+f_titel.getText()+"') AND fk_login_id = '"+user.GetInstance().getUser_id()+"'";    
              //Benutzer spezifische Kritik hohlen
                  k_text.setText("");
                  rs_user_kritik=dbverbindung.SQLQuerry(sql_kritik);
                  while(rs_user_kritik.next()){
                      k_text.setText(rs_user_kritik.getString("kommentar"));
                  }
              } else {
                  JOptionPane.showMessageDialog(this, "Film nicht in der Datenbank vorhanden");
              }
       } catch (Exception ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection dbprojekt;
        Statement statement;
                       
        try{
            databaseexecutes dbverbindung=new databaseexecutes();
            dbverbindung.DatabaseConnection();
            String sql_film_id="SELECT film_id FROM film WHERE titel='"+this.f_titel.getText()+"'";           
              //Film ID für den aktuell ausgewählten Film hohlen              
              int aktuellerfilm_id=0;
              ResultSet rs_film_id=dbverbindung.SQLQuerry(sql_film_id);
              while(rs_film_id.next()){
              aktuellerfilm_id=Integer.parseInt(rs_film_id.getString("film_id"));
              }
              //Bewertung und Kommentar in DB schreiben wenn noch kein Eintrag für diesen Benutzer vorliegt
              String sql_entrycheck="SELECT bewertung,kommentar FROM bewertung WHERE fk_login_id='"+user.GetInstance().getUser_id()+"' AND fk_film_id='"+aktuellerfilm_id+"'";
              String sql_datainsert="INSERT INTO bewertung (fk_login_id,fk_film_id,bewertung, kommentar) VALUES ('"+user.GetInstance().getUser_id()+"','"+aktuellerfilm_id+"','"+b_wert.getText()+"','"+k_text.getText()+"')";
              String sql_update="UPDATE bewertung SET bewertung='"+b_wert.getText()+"',kommentar='"+k_text.getText()+"' WHERE fk_login_id='"+user.GetInstance().getUser_id()+"'";
             //dbverbindung.SQLQuerry(sql_upsert);
              ResultSet rs_entrycheck=dbverbindung.SQLQuerry(sql_entrycheck);
              if(rs_entrycheck.next()){
                  dbverbindung.SQLUpdate(sql_update);
              } else {
                  dbverbindung.SQLQuerry(sql_datainsert);
              }
              //TopTen neu aufbauen
              ArrayList<String> top=getTopTenFilme();
            for (Object topTenFilme : getTopTenFilme()) {
                f_topten.setListData(top.toArray());
                }
        } catch (Exception ex){  
            Logger.getLogger(hauptseite.class.getName()).log(Level.SEVERE, null, ex);            
         }                   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new userdelete().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new filmerstellen().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hauptseite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hauptseite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hauptseite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hauptseite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hauptseite().setVisible(true);
            }
        });
    }
    private ArrayList getKommentarFilm() throws SQLException{
        databaseexecutes dbverbindung=new databaseexecutes();
        dbverbindung.DatabaseConnection();
        String sql_komi="SELECT kommentar AS komi FROM film INNER JOIN bewertung ON film.film_id=bewertung.fk_film_id WHERE bewertung.fk_film_id=(select film_id from film WHERE titel='"+this.f_titel.getText()+"')";
        ResultSet rs_komi=dbverbindung.SQLQuerry(sql_komi);
        ArrayList<String> kommentar = new ArrayList<> ();
        
        while (rs_komi.next()){
            kommentar.add(rs_komi.getString("komi"));
        }
        return kommentar;
    }
    private ArrayList getTopTenFilme() throws SQLException{
        databaseexecutes dbverbindung=new databaseexecutes();
        dbverbindung.DatabaseConnection();
        String sql_topten="SELECT titel, (summe / anzahl) AS topten FROM film WHERE summe != 0 ORDER BY topten DESC";
        ResultSet rs_topten=dbverbindung.SQLQuerry(sql_topten);
        ArrayList<String> topten = new ArrayList<>();
        while(rs_topten.next()){
            topten.add(rs_topten.getString("titel"));
        }
        return topten;
    }
    private ArrayList getGenre()throws SQLException{
        databaseexecutes dbverbindung= new databaseexecutes();
        dbverbindung.DatabaseConnection();
        String sql_genre="SELECT genre_name AS filmgenre FROM genre INNER JOIN genre_film ON genre.genre_id=genre_film.fk_genre_id WHERE fk_film_id=(SELECT film_id FROM film WHERE titel='"+this.f_titel.getText()+"')";
        ResultSet rs_genre=dbverbindung.SQLQuerry(sql_genre);
        ArrayList<String> genre=new ArrayList<>();
        while(rs_genre.next()){
            genre.add(rs_genre.getString("filmgenre"));
        }
        return genre;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_wert;
    private javax.swing.JButton btn_search;
    private javax.swing.JTextArea f_beschreibung;
    private javax.swing.JList f_genrelist;
    private javax.swing.JList f_komentar;
    private javax.swing.JLabel f_titel;
    private javax.swing.JList f_topten;
    private javax.swing.JLabel f_username;
    private javax.swing.JLabel f_wertung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea k_text;
    private javax.swing.JTextField s_filter;
    // End of variables declaration//GEN-END:variables
}
