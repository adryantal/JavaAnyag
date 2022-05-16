package vezerlok;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.ListModel;

public class Felepites extends javax.swing.JFrame {

    public Felepites() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pswJelszo = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnMutat = new javax.swing.JButton();
        txtJelszo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        chbHozzafuz = new javax.swing.JCheckBox();
        btnListbe = new javax.swing.JButton();
        rdbEleje = new javax.swing.JRadioButton();
        rdbVege = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtujSzak = new javax.swing.JTextField();
        btnFelvesz = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuKilep = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vezérlők");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButton1.setText("fejlécet NEM");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kérdések"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nő");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Nem adom meg");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("hírlevél");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Férfi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap())
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        pswJelszo.setText("jPasswordField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- szak választó --", "Szoftverfejlesztő", "Rendszergazda", "Grafikus" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setText("jelszó:");

        btnMutat.setText("jelszót mutat");
        btnMutat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswJelszo)
                    .addComponent(jLabel2)
                    .addComponent(btnMutat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJelszo))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pswJelszo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMutat)
                                .addGap(18, 18, 18)
                                .addComponent(txtJelszo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Beállítások", jPanel2);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Üzenet");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Elküld");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Üzenet", jPanel3);

        jButton2.setText("jButton2");
        jPanel5.add(jButton2);

        jButton3.setText("jButton3");
        jPanel5.add(jButton3);

        jButton4.setText("jButton4");
        jPanel5.add(jButton4);

        jButton5.setText("jButton5");
        jPanel5.add(jButton5);

        jButton6.setText("jButton6");
        jPanel5.add(jButton6);

        jTabbedPane1.addTab("Elrendezések", jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dinamikus tartalom"));

        chbHozzafuz.setText("hozzáfűz");
        chbHozzafuz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbHozzafuzStateChanged(evt);
            }
        });

        btnListbe.setText("Combo Tartalmát Listbe");
        btnListbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListbeActionPerformed(evt);
            }
        });

        buttonGroup3.add(rdbEleje);
        rdbEleje.setSelected(true);
        rdbEleje.setText("elejére");

        buttonGroup3.add(rdbVege);
        rdbVege.setText("végére");
        rdbVege.setEnabled(false);

        jLabel3.setText("Új szak:");

        txtujSzak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtujSzakKeyReleased(evt);
            }
        });

        btnFelvesz.setText("Felvesz");
        btnFelvesz.setEnabled(false);
        btnFelvesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFelveszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbHozzafuz)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListbe, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtujSzak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rdbEleje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbVege))
                    .addComponent(btnFelvesz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbHozzafuz)
                    .addComponent(btnListbe)
                    .addComponent(rdbEleje)
                    .addComponent(rdbVege))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtujSzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFelvesz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        jMenuItem1.setText("Új");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Mentés");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        mnuKilep.setText("Kilépés");
        mnuKilep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKilepActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKilep);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Szerkesztés");

        jMenu3.setText("jMenu3");

        jMenuItem4.setText("jMenuItem4");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu3.add(jMenuItem6);

        jMenu2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        jMenu4.add(jCheckBoxMenuItem1);

        buttonGroup2.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jMenu4.add(jRadioButtonMenuItem1);

        buttonGroup2.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");
        jMenu4.add(jRadioButtonMenuItem2);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMutatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutatActionPerformed
        char[] jsz = pswJelszo.getPassword(); //karaktertömbbe mentjük, mivel a getPassword() által visszaadott érték is karaktertömb; ezt pedig be tudjuk járni
        String psw = "";
        /* saját kóddal: */
        for (char c : jsz) {
            psw += c;
        }
        
        /* Java API használattal: */
        psw = String.valueOf(jsz);
        
        txtJelszo.setText(psw);
    }//GEN-LAST:event_btnMutatActionPerformed

    
    /*ÁNTÉZVE*/
    private void btnFelveszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFelveszActionPerformed
        ujSzakotFelvesz(); //a Felvesz gombra kattintva meghívódik az ujSzakotFelvesz fv.
    }//GEN-LAST:event_btnFelveszActionPerformed

    private void btnListbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListbeActionPerformed
        //a szakválasztós combomboxban kiválasztott szakot a lista elejére v. végére pakolja a "Combo tartalmát listbe" gombra kattintva
        
        int ind = jComboBox1.getSelectedIndex(); //kiválasztunk egy szakot, amelynek lekérjük az indexét
        if (jToggleButton1.isSelected() || (!jToggleButton1.isSelected() && ind > 0)) { //ha a FEJLÉCET NEM gomb be van nyomva, vagy nincs benyomva, és a legelső opció van kiválasztva a szakválasztós listából
            String szak = jComboBox1.getItemAt(ind); //lekérjük a szak nevét az index alapján
            DefaultListModel dlm = new DefaultListModel(); //DefaultListModel<E> extends AbstractListModel<E> ill. class AbstractListModel<E> implements ListModel<E>
            
            //<editor-fold defaultstate="collapsed" desc="próbálkozás">
//            ListModel<String> listModel = jList1.getModel();
//
//            DefaultListModel dlm = new DefaultListModel();
//            dlm.addElement(szak);
//            dlm.add(0, "első");
//            jList1.setModel(dlm);
//</editor-fold>

/*Saját megj.: a DefaultListModel őse az AbstractListModel, amely megvalósítja a ListModel interfészt -> A DefaultListModel is megval. a ListModel interfészt,
 következésképp "tud ListModelként viselkedni", "rendelkezik a ListModelben felsorolt képességekkel".
A DefaultListModelnek adott a addElement(E element) metódusa, ahol E generikus, tehát bármely típusú elem lehet. A ListModel interfésznek nincs ilyen metódusa.
Ezért ha elemeket akarunk addolni, akkor mindenképp ügyesen be kell vonni a DefaultListModel-t.

*/
            //
            if(chbHozzafuz.isSelected()){ //ha a Hozzáfűz checkbox ki van pipálva
                ListModel<String> listModel = jList1.getModel(); //lekérjük a lista "tartalmát" a modelljén keresztül
                for (int i = 0; i < listModel.getSize(); i++) { //véegigiterálunk a lista tartalmán a modell segítségével
                    dlm.addElement(listModel.getElementAt(i)); //a ListModel elemeiből "másolatot" készítünk a a dlm-ben
                }
                if(rdbEleje.isSelected()){ //ha az "eleje" rádiógomb ki van jelölve, a dlm 0. indexére, azaz a legelejére kerül a szak
                    dlm.add(0, szak);
                }else{
                    dlm.addElement(szak); //különben a végére
                }    
            }else{
                dlm.addElement(szak); //ha a Hozzáfűz checkbox nincs kipipálva, akkor törlődik a lista addigi tartalma, és csak a kiv. szak kerül be
            }
            jList1.setModel(dlm); //végül átállítjuk a lista modelljét, és felülírjuk a dlm-mel a tartalmat
        } else {
            //System.out.println("Szakot kell választani");
            JOptionPane.showMessageDialog(rootPane, "Szakot kell választani!");
        }
    }//GEN-LAST:event_btnListbeActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        JToggleButton g = jToggleButton1; //FEJLÉCET NEM gomb beállítása
        g.setText("Fejlécet NEM"); //alapértelmezett szöveg
        if(g.isSelected()){  //ha benyomjuk, akkor változik a szöveg a gombon
            g.setText("Fejlécet enged");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void chbHozzafuzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbHozzafuzStateChanged
        if(chbHozzafuz.isSelected()){
            rdbVege.setEnabled(true); //ha a Hozzáfűz checkbox ki van pipálva, akkor a "végére" rádiógomb legyen kijelölve 
        }else{
            rdbVege.setEnabled(false); //ha a Hozzáfűz checkbox nincs kipipálva, akkor az "eleje" rádiógomb legyen kijelölve 
            rdbEleje.setSelected(true);
        }
    }//GEN-LAST:event_chbHozzafuzStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (jComboBox1.getSelectedIndex() > 0) { //ha a "szakválasztós" combo boxnak nem az első (default) opciója van kiválasztva
            pswJelszo.setText(jComboBox1.getSelectedItem() + ""); //akkor a jelszó boxba kerüljön bele a kiválasztott szak (ellenőrizni tudjuk a jelszót mutat gombra kattintva)
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void txtujSzakKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtujSzakKeyReleased
        if (!txtujSzak.getText().isEmpty()) {//ha beleírtunk valamit az "Új szak" melletti szövegmezőbe,
            btnFelvesz.setEnabled(true); //akkor aktiválja a Felvesz gombot
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //ha entert nyomunk, felveszi a szakot a "szakválasztós" combo boxba
                ujSzakotFelvesz();
            }
        } else {
            btnFelvesz.setEnabled(false); //egyéb esetben deaktiválja a gombot, tehát nem tudunk "üres" szakot felvenni
        }
    }//GEN-LAST:event_txtujSzakKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes(); // x gomb
    }//GEN-LAST:event_formWindowClosing

    private void mnuKilepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKilepActionPerformed
        kilepes(); //fenti menüsor --> Program -> Kilépés gomb
    }//GEN-LAST:event_mnuKilepActionPerformed

    private void kilepes() {
        
        // src/vezerlok alatt található a projekt --> src/vezerlok/Felepites.java;  a src/vezerlok alá kell egy 'kepek' mappa, abba helyezni a képfájlt, 
        //és akkor az alábbi módon elérhetővé válik
        Icon icon = new ImageIcon(this.getClass().getResource("kepek/emo.jpg"));
        int gomb = JOptionPane.showConfirmDialog(rootPane, "Biztos kilép?", "KILÉPÉS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon);
        if (gomb == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }
    
    private void ujSzakotFelvesz() {
        String szak = txtujSzak.getText(); //az "Új szak" melletti szövegmező értékét változóba mentjük
        jComboBox1.addItem(szak); // a "szakválasztós" combo boxhoz hozzáadjuk új itemként a változó értékét
        txtujSzak.setText(""); //az "Új szak" melletti szövegmezőt ürítjük
    }
        
    

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
            java.util.logging.Logger.getLogger(Felepites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Felepites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Felepites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Felepites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Felepites().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFelvesz;
    private javax.swing.JButton btnListbe;
    private javax.swing.JButton btnMutat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox chbHozzafuz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem mnuKilep;
    private javax.swing.JPasswordField pswJelszo;
    private javax.swing.JRadioButton rdbEleje;
    private javax.swing.JRadioButton rdbVege;
    private javax.swing.JTextField txtJelszo;
    private javax.swing.JTextField txtujSzak;
    // End of variables declaration//GEN-END:variables
}
