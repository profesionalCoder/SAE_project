/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import com.sun.glass.ui.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sfey
 */
public class hauptseite extends javax.swing.JFrame {

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
        jList1 = new javax.swing.JList();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        f_kommentar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Film suchen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Top Ten Filme");

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

        f_kommentar.setColumns(20);
        f_kommentar.setRows(5);
        jScrollPane4.setViewportView(f_kommentar);

        jLabel1.setText("Kommerntare");

        jLabel6.setText("User-Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(f_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f_wertung, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_filter, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(b_wert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(f_titel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_wert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(f_wertung, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Connection dbprojekt;
       Statement statement;
       ResultSet beschreibung;
       ResultSet rank;
       ResultSet komi;
       
       try{
           Class.forName("org.postgresql.Driver").newInstance();
              dbprojekt = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projekt","postgres","123");
              statement = dbprojekt.createStatement();
              String film_name=s_filter.getText();
              String suche="SELECT * FROM film WHERE titel='"+film_name+"'";
              String beschr="SELECT beschreibung FROM film";            
              String sql_wertung="SELECT COUNT(bewertung) FROM bewertung";
              //String sql_wertung="SELECT AVG(bewertung) FROM bewertung";             
              String kommentar="SELECT kommentar FROM bewertung";
              if (statement.executeQuery(suche).next()){
              f_titel.setText(film_name);
              beschreibung=statement.executeQuery(beschr);
              while (beschreibung.next()){
              f_beschreibung.setText(beschreibung.getString("beschreibung"));
              }
              rank=statement.executeQuery(sql_wertung); 
              int ergebnis=0;
              while (rank.next()){
                  int speicher=Integer.parseInt(rank.getString("bewertung"));
                  for (int i=0;i<rank.getLong(sql_wertung);i++){
                  int zwspeicher=speicher;
                  ergebnis=(speicher+zwspeicher)/i;
              }
              }
              Integer test= new Integer (ergebnis);
              String s=test.toString();
              f_wertung.setText(s);
                  System.out.println(rank);
              
              komi=statement.executeQuery(kommentar);
              while(komi.next()){
                  f_kommentar.setText(komi.getString("kommentar"));
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
        ResultSet film_id;
                       
        try{
            Class.forName("org.postgresql.Driver").newInstance();
              dbprojekt = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projekt","postgres","123");
              statement = dbprojekt.createStatement();
              //Film ID für den aktuell ausgewählten Film hohlen
              String sql_film_id="SELECT film_id FROM film WHERE titel='"+this.s_filter.getText()+"'";
              film_id=statement.executeQuery(sql_film_id);
              int test=0;
              while(film_id.next()){
              test=Integer.parseInt(film_id.getString("film_id"));
              }
              //Bewertung und Kommentar in DB schreiben wenn noch kein Eintrag für diesen Benutzer vorliegt              
              String sql_bewerten="INSERT INTO bewertung (fk_film_id,fk_login_id,bewertung,kommentar) VALUES ('"+test+"','"+user.GetInstance().getUser_id()+"','"+this.b_wert.getText()+"','"+this.k_text.getText()+"')";
              statement.executeUpdate(sql_bewerten);
              
        } catch (Exception ex){  
            //Logger.getLogger(Filmehinzufügen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Bewertung für diesen Benutzer schon vorhaneden");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_wert;
    private javax.swing.JTextArea f_beschreibung;
    private javax.swing.JTextArea f_kommentar;
    private javax.swing.JLabel f_titel;
    private javax.swing.JLabel f_wertung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea k_text;
    private javax.swing.JTextField s_filter;
    private javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}