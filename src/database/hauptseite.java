/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

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
        jButton1 = new javax.swing.JButton();
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

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Film suchen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jLabel4.setText("Wertung");

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

        jLabel1.setText("Kommerntare");

        f_komentar.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(f_komentar);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(259, 259, 259))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f_wertung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2))
                                        .addGap(146, 146, 146))
                                    .addComponent(jScrollPane3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(f_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_wert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 5, Short.MAX_VALUE)))
                                .addGap(232, 232, 232))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(f_wertung, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ResultSet rs_titel;
       ResultSet rs_beschreibung;
       ResultSet rs_rank;
       ResultSet rs_komi;
       ResultSet rs_anzahl;
       
       try{
           Class.forName("org.postgresql.Driver").newInstance();
              databaseexecutes dbverbindung = new databaseexecutes();
              dbverbindung.DatabaseConnection();              
              String film_name=s_filter.getText();
              String sql_suche="SELECT * FROM film WHERE UPPER(titel)=Upper('"+film_name+"')";
              String sql_beschr="SELECT beschreibung FROM film WHERE UPPER(titel)=UPPER('"+film_name+"')";            
              String sql_wertung="select avg(bewertung) as wertung from film inner join bewertung on film.film_id=bewertung.fk_film_id where bewertung.fk_film_id=(SELECT film_id from film where titel='"+film_name+"')";
              rs_titel=dbverbindung.SQLQuerry(sql_suche);
              if (rs_titel.next()){
                  f_titel.setText(rs_titel.getString("titel"));
                  rs_beschreibung=dbverbindung.SQLQuerry(sql_beschr);
                  while(rs_beschreibung.next()){
                      f_beschreibung.setText(rs_beschreibung.getString("beschreibung"));
                  }
              //Bewertungsdurchschnitt ausrechen
              rs_rank=dbverbindung.SQLQuerry(sql_wertung);
              while(rs_rank.next()){
              f_wertung.setText(rs_rank.getString("wertung"));
              }
              /*rs_rank=statement.executeQuery(sql_wertung); 
              int i=0;     
              float Speicher1=0;
              float zwergebnis=0;
              while (rs_rank.next()){
                  float speicher=Integer.parseInt(rs_rank.getString("bewertung"));
                  i ++;
                  zwergebnis=zwergebnis+speicher;     
                  Speicher1=zwergebnis;
              }   
              float ergebnis=(Speicher1)/i;
              ergebnis=Math.round(ergebnis);
              Double avg= new Double (ergebnis);
              String s=avg.toString();
              f_wertung.setText(s);  */               
              //Kommentare hohlen und in Liste schreiben
              ArrayList<String>  komi = getKommentarFilm();
              for (int j=0;j<getKommentarFilm().size();j++){
                  f_komentar.setListData(komi.toArray());
              }
              //TopTen initialisieren
              ArrayList<String> top=getTopTenFilme();
              for(int j=0;j<getTopTenFilme().size();j++){
                  f_topten.setListData(top.toArray());
              }
              } else {
                  JOptionPane.showMessageDialog(this, "Film nicht in der Datenbank vorhanden");
              }
       } catch (Exception ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection dbprojekt;
        Statement statement;
                       
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            databaseexecutes dbverbindung=new databaseexecutes();
            dbverbindung.DatabaseConnection();
            String sql_film_id="SELECT film_id FROM film WHERE titel='"+this.s_filter.getText()+"'";
            dbverbindung.SQLQuerry(sql_film_id);            
              //Film ID für den aktuell ausgewählten Film hohlen              
              int test=0;
              ResultSet rs_film_id=dbverbindung.SQLQuerry(sql_film_id);
              while(rs_film_id.next()){
              test=Integer.parseInt(rs_film_id.getString("film_id"));
              }
              //Bewertung und Kommentar in DB schreiben wenn noch kein Eintrag für diesen Benutzer vorliegt              
              String sql_bewerten="INSERT INTO bewertung (fk_film_id,fk_login_id,bewertung,kommentar) VALUES ('"+test+"','"+user.GetInstance().getUser_id()+"','"+this.b_wert.getText()+"','"+this.k_text.getText()+"')";
              dbverbindung.SQLUpdate(sql_bewerten);
              
        } catch (Exception ex){  
            //Logger.getLogger(Filmehinzufügen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Bewertung für diesen Benutzer schon vorhanden");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

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
        String sql_komi="select kommentar as komi from film inner join bewertung on film.film_id=bewertung.fk_film_id where bewertung.fk_film_id=(select film_id from film where titel='"+this.f_titel.getText()+"')";
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
        String sql_topten="select titel, (summe / anzahl) as topten from film WHERE summe != 0 ORDER BY topten DESC";
        ResultSet rs_topten=dbverbindung.SQLQuerry(sql_topten);
        ArrayList<String> topten = new ArrayList<>();
        while(rs_topten.next()){
            topten.add(rs_topten.getString("titel"));
        }
        return topten;
    }
    /*
    private HashMap<Integer,String> getKommentareFilm() throws SQLException{
        String sql_komi="SELECT * FROM bewertung";
        databaseexecutes dbverbindung=new databaseexecutes();
        dbverbindung.DatabaseConnection();
        ResultSet rs_komi=dbverbindung.SQLQuerry(sql_komi);
        
        HashMap<Integer,String> kommentare=new HashMap<>();
        
        while (rs_komi.next()){
            int id=Integer.parseInt(rs_komi.getString(sql_komi));
            String komi=rs_komi.getString("kommentar");
            kommentare.put(id, "kommentar");
        }
        return kommentare;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_wert;
    private javax.swing.JTextArea f_beschreibung;
    private javax.swing.JList f_komentar;
    private javax.swing.JLabel f_titel;
    private javax.swing.JList f_topten;
    private javax.swing.JLabel f_wertung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea k_text;
    private javax.swing.JTextField s_filter;
    // End of variables declaration//GEN-END:variables
}
