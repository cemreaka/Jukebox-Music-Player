/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aynur Cemre Aka
 */
public class SearchSong extends javax.swing.JFrame {
    Db db;
    Customer c;
    /**
     * Creates new form SearchSong
     */
    public SearchSong() {
        db=new Db();
        initComponents();
    }
    public SearchSong(Customer c) {
        this.c=c;
        db=new Db();
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

        jPanel1 = new javax.swing.JPanel();
        addplaylistButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        deleteSelectedButton = new javax.swing.JButton();
        mainmenuButton = new javax.swing.JButton();
        listSongsButton = new javax.swing.JButton();
        listArtistButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        genreList = new javax.swing.JComboBox<>();
        artistList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        songTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Song");

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        addplaylistButton.setBackground(new java.awt.Color(126, 87, 194));
        addplaylistButton.setForeground(new java.awt.Color(255, 255, 255));
        addplaylistButton.setText("Add Song to the Playlist");
        addplaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addplaylistButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(126, 87, 194));
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        deleteSelectedButton.setBackground(new java.awt.Color(126, 87, 194));
        deleteSelectedButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteSelectedButton.setText("Delete Selected Song from the System");
        deleteSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedButtonActionPerformed(evt);
            }
        });

        mainmenuButton.setBackground(new java.awt.Color(126, 87, 194));
        mainmenuButton.setForeground(new java.awt.Color(255, 255, 255));
        mainmenuButton.setText("Main Menu");
        mainmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuButtonActionPerformed(evt);
            }
        });

        listSongsButton.setBackground(new java.awt.Color(126, 87, 194));
        listSongsButton.setForeground(new java.awt.Color(255, 255, 255));
        listSongsButton.setText("List Songs");
        listSongsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSongsButtonActionPerformed(evt);
            }
        });

        listArtistButton.setBackground(new java.awt.Color(126, 87, 194));
        listArtistButton.setForeground(new java.awt.Color(255, 255, 255));
        listArtistButton.setText("List Artists");
        listArtistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listArtistButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Genre:");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Artist:");

        genreList.setForeground(new java.awt.Color(57, 113, 177));
        genreList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Rock", "Dance", "Jazz" }));

        artistList.setForeground(new java.awt.Color(57, 113, 177));
        artistList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistListActionPerformed(evt);
            }
        });

        songTable.setBackground(new java.awt.Color(126, 87, 194));
        songTable.setForeground(new java.awt.Color(255, 255, 255));
        songTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(songTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(listArtistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listSongsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genreList, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addplaylistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteSelectedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(artistList, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreList, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artistList, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listArtistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listSongsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(deleteSelectedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addplaylistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listArtistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listArtistButtonActionPerformed
        db = new Db();
        artistList.removeAllItems();
        db.searchGenre(genreList.getSelectedItem().toString(), artistList);
    }//GEN-LAST:event_listArtistButtonActionPerformed

    private void listSongsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSongsButtonActionPerformed
        db= new Db();
        String[] tableColumnsName = {"Name","Genre","Artist","Path"}; 
        DefaultTableModel modelTable = (DefaultTableModel) songTable.getModel();
        modelTable.setColumnIdentifiers(tableColumnsName);
        int rows = modelTable.getRowCount(); 
        for(int i = 0; i<rows; i++)
        {
          modelTable.removeRow(i);
        }
        db.searchArtist(artistList.getSelectedItem().toString(), genreList.getSelectedItem().toString(), songTable, modelTable);
    
    }//GEN-LAST:event_listSongsButtonActionPerformed

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        int column = 3;
        int row = songTable.getSelectedRow();
        String path;
        try {
            path=songTable.getModel().getValueAt(row, column).toString();
            new PlaySong(path).setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(SearchSong.this, "No song is selected!");
            return;
        }
        this.dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    private void addplaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addplaylistButtonActionPerformed
        String name=""; //Otherwise in second catch, name is not initialized.
        String genre;
        String artist;
        String path;
        try{ 
            name+=songTable.getModel().getValueAt(songTable.getSelectedRow(),0).toString();
            genre=songTable.getModel().getValueAt(songTable.getSelectedRow(),1).toString();
            artist=songTable.getModel().getValueAt(songTable.getSelectedRow(),2).toString();
            path=songTable.getModel().getValueAt(songTable.getSelectedRow(),3).toString();           
            db.addSong(c.getUserName(),name,genre,artist,path);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(SearchSong.this, "No song is selected!");
            return;
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(SearchSong.this, "You already have: "+name);
           return;
        }
        JOptionPane.showMessageDialog(SearchSong.this, "Successfully added to playlist: "+name);
        new SearchSong(c).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addplaylistButtonActionPerformed

    private void deleteSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedButtonActionPerformed
        String name;
        try{ 
            name=songTable.getModel().getValueAt(songTable.getSelectedRow(),0).toString();
            db.deleteSong(name);
        } catch(Exception e)
        {
           JOptionPane.showMessageDialog(SearchSong.this, "No song is selected!");
           return; 
        }
        JOptionPane.showMessageDialog(SearchSong.this, "Successfully deleted from the playlist: "+name);
        new SearchSong(c).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteSelectedButtonActionPerformed

    private void artistListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistListActionPerformed

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
            java.util.logging.Logger.getLogger(SearchSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchSong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addplaylistButton;
    private javax.swing.JComboBox<String> artistList;
    private javax.swing.JButton deleteSelectedButton;
    private javax.swing.JComboBox<String> genreList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listArtistButton;
    private javax.swing.JButton listSongsButton;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JButton playButton;
    private javax.swing.JTable songTable;
    // End of variables declaration//GEN-END:variables
}
