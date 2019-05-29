package zaposleni.ui;  
    
  import java.awt.Color;  
  import java.util.List;  
  import java.util.Vector;  
  import javax.swing.table.DefaultTableModel;  
  import org.hibernate.HibernateException;  
  import org.hibernate.Query;  
  import org.hibernate.Session;  
  import zaposleni.entity.Zaposleni;  
  import zaposleni.util.HibernateUtil;  
    

  public class PrikazFrame extends javax.swing.JFrame {  

    public PrikazFrame() {  
      initComponents();  
    }  

    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">               
    private void initComponents() {  
    
      jScrollPane1 = new javax.swing.JScrollPane();  
      tabela = new javax.swing.JTable();  
      povratakBtn = new javax.swing.JButton();  
      jLabel1 = new javax.swing.JLabel();  
      jLabel2 = new javax.swing.JLabel();  
      jLabel3 = new javax.swing.JLabel();  
      jLabel4 = new javax.swing.JLabel();  
      imeTf = new javax.swing.JTextField();  
      godineTf = new javax.swing.JTextField();  
      adresaTf = new javax.swing.JTextField();  
      dohodakTf = new javax.swing.JTextField();  
      imeBtn = new javax.swing.JButton();  
      godineBtn = new javax.swing.JButton();  
      adresaBtn = new javax.swing.JButton();  
      dohodakBtn = new javax.swing.JButton();  
      jButton1 = new javax.swing.JButton();  
    
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
      setTitle("Prikaz zaposlenih");  
      addWindowListener(new java.awt.event.WindowAdapter() {  
        public void windowOpened(java.awt.event.WindowEvent evt) {  
          formWindowOpened(evt);  
        }  
      });  
    
      jScrollPane1.setBackground(new java.awt.Color(0, 59, 70));  
      jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Zaposleni:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(196, 223, 230))); // NOI18N  
    
      tabela.setForeground(new java.awt.Color(90, 78, 77));  
      tabela.setModel(new javax.swing.table.DefaultTableModel(  
        new Object [][] {  
          {null, null, null, null},  
          {null, null, null, null},  
          {null, null, null, null},  
          {null, null, null, null}  
        },  
        new String [] {  
          "Title 1", "Title 2", "Title 3", "Title 4"  
        }  
      ));  
      jScrollPane1.setViewportView(tabela);  
      if (tabela.getColumnModel().getColumnCount() > 0) {  
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);  
        tabela.getColumnModel().getColumn(0).setMaxWidth(70);  
      }  
    
      povratakBtn.setBackground(new java.awt.Color(126, 103, 94));  
      povratakBtn.setForeground(java.awt.Color.white);  
      povratakBtn.setText("Povratak u Meni");  
      povratakBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
         
       }  
      });  
    
      jLabel1.setForeground(java.awt.Color.white);  
      jLabel1.setText("Ime i prezime");  
    
      jLabel2.setForeground(java.awt.Color.white);  
      jLabel2.setText("Godine");  
    
      jLabel3.setForeground(java.awt.Color.white);  
      jLabel3.setText("Adresa");  
    
      jLabel4.setForeground(java.awt.Color.white);  
      jLabel4.setText("Dohodak");  
    
      imeBtn.setBackground(new java.awt.Color(126, 103, 94));  
      imeBtn.setForeground(java.awt.Color.white);  
      imeBtn.setText("Prikaži");  
      imeBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          imeBtnActionPerformed(evt);  
        }  
      });  
    
      godineBtn.setBackground(new java.awt.Color(126, 103, 94));  
      godineBtn.setForeground(java.awt.Color.white);  
      godineBtn.setText("Prikaži");  
      godineBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          godineBtnActionPerformed(evt);  
        }  
      });  
    
      adresaBtn.setBackground(new java.awt.Color(126, 103, 94));  
      adresaBtn.setForeground(java.awt.Color.white);  
      adresaBtn.setText("Prikaži");  
      adresaBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          adresaBtnActionPerformed(evt);  
        }  
      });  
    
      dohodakBtn.setBackground(new java.awt.Color(126, 103, 94));  
      dohodakBtn.setForeground(java.awt.Color.white);  
      dohodakBtn.setText("Prikaži");  
      dohodakBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          dohodakBtnActionPerformed(evt);  
        }  
      });  
    
      jButton1.setBackground(new java.awt.Color(126, 103, 94));  
      jButton1.setForeground(java.awt.Color.white);  
      jButton1.setText("Svi zaposleni");  
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
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)  
          .addContainerGap())  
        .addGroup(layout.createSequentialGroup()  
          .addGap(33, 33, 33)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
            .addGroup(layout.createSequentialGroup()  
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
                .addComponent(jLabel1)  
                .addComponent(jLabel2)  
                .addComponent(jLabel3)  
                .addComponent(jLabel4))  
              .addGap(45, 45, 45)  
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)  
                .addComponent(imeTf)  
               .addComponent(godineTf)  
                .addComponent(adresaTf)  
                .addComponent(dohodakTf, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))  
              .addGap(30, 30, 30)  
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
                .addComponent(imeBtn)  
                .addComponent(godineBtn)  
                .addComponent(adresaBtn)  
                .addComponent(dohodakBtn))  
              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
            .addGroup(layout.createSequentialGroup()  
              .addComponent(jButton1)  
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
              .addComponent(povratakBtn)  
              .addGap(20, 20, 20))))  
      );  
      layout.setVerticalGroup(  
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
       .addGroup(layout.createSequentialGroup()  
          .addGap(23, 23, 23)  
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)  
          .addGap(28, 28, 28)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel1)  
            .addComponent(imeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(imeBtn))  
          .addGap(16, 16, 16)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel2)  
            .addComponent(godineTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(godineBtn))  
          .addGap(16, 16, 16)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
           .addComponent(jLabel3)  
            .addComponent(adresaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(adresaBtn))  
          .addGap(16, 16, 16)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel4)  
            .addComponent(dohodakTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(dohodakBtn))  
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)  
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(povratakBtn)  
            .addComponent(jButton1))  
          .addGap(20, 20, 20))  
      );  
    
      pack();  
    }// </editor-fold>              
    
    // HQL  
      
    private static String upitNaOsnovuImena = "from Zaposleni z where z.ime like '";  
    private static String upitNaOsnovuGodina = "from Zaposleni z where z.godine like '";  
    private static String upitNaOsnovuAdrese = "from Zaposleni z where z.adresa like '";  
    private static String upitNaOsnovuDohotka = "from Zaposleni z where z.dohodak like '";  
    private static String prikazSvihZaposlenih = "from Zaposleni";  
      
    private void izvrsiHQL(String hql) {  
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
        Query q = s.createQuery(hql);  
        List listaRezultata = q.list();  
        prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
      } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
    }  
      
    private void prikaziRezultat(List listaRezultata) {  
      Vector<String> nasloviKolona = new Vector<>();  
      Vector podaci = new Vector();  
        
      nasloviKolona.add("ID");  
      nasloviKolona.add("Ime i Prezime");  
      nasloviKolona.add("Godine");  
      nasloviKolona.add("Adresa");  
      nasloviKolona.add("Dohodak");  
        
      for(Object o : listaRezultata) {  
        Zaposleni zaposleni = (Zaposleni)o;  
        Vector<Object> red = new Vector<>();  
        red.add(zaposleni.getZaposleni_id());  
        red.add(zaposleni.getIme());  
        red.add(zaposleni.getGodine());  
        red.add(zaposleni.getAdresa());  
        red.add(zaposleni.getDohodak());  
        podaci.add(red);  
      }  
        
      tabela.setModel(new DefaultTableModel(podaci,nasloviKolona));  
    }  
      
                          
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                       
      izvrsiHQL(prikazSvihZaposlenih);  
    }                      
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                   
      izvrsiHQL(prikazSvihZaposlenih);  
    }                   
    
    private void imeBtnActionPerformed(java.awt.event.ActionEvent evt) {                      
      izvrsiHQL(  
      upitNaOsnovuImena + imeTf.getText() + "%'"  
      );  
      imeTf.setText("");  
    }                     
    
    private void godineBtnActionPerformed(java.awt.event.ActionEvent evt) {                       
      izvrsiHQL(  
      upitNaOsnovuGodina + godineTf.getText() + "%'"  
      );  
      godineTf.setText ("");  
    }                       
    
    private void adresaBtnActionPerformed(java.awt.event.ActionEvent evt) {                       
      izvrsiHQL(  
      upitNaOsnovuAdrese + adresaTf.getText() + "%'"  
     );  
      adresaTf.setText("");  
    }                       
    
    private void dohodakBtnActionPerformed(java.awt.event.ActionEvent evt) {                        
      izvrsiHQL(  
      upitNaOsnovuDohotka + dohodakTf.getText() + "%'"  
      );  
      dohodakTf.setText("");  
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
        java.util.logging.Logger.getLogger(PrikazFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (InstantiationException ex) {  
        java.util.logging.Logger.getLogger(PrikazFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (IllegalAccessException ex) {  
        java.util.logging.Logger.getLogger(PrikazFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {  
        java.util.logging.Logger.getLogger(PrikazFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      }  
      //</editor-fold>  
    
      /* Create and display the form */  
      java.awt.EventQueue.invokeLater(new Runnable() {  
        public void run() {  
          new PrikazFrame().setVisible(true);  
        }  
      });  
    }  
    
                
    private javax.swing.JButton adresaBtn;  
    private javax.swing.JTextField adresaTf;  
    private javax.swing.JButton dohodakBtn;  
    private javax.swing.JTextField dohodakTf;  
    private javax.swing.JButton godineBtn;  
    private javax.swing.JTextField godineTf;  
    private javax.swing.JButton imeBtn;  
    private javax.swing.JTextField imeTf;  
    private javax.swing.JButton jButton1;  
    private javax.swing.JLabel jLabel1;  
    private javax.swing.JLabel jLabel2;  
    private javax.swing.JLabel jLabel3;  
    private javax.swing.JLabel jLabel4;  
    private javax.swing.JScrollPane jScrollPane1;  
    private javax.swing.JButton povratakBtn;  
    private javax.swing.JTable tabela;  
    // End of variables declaration            
  }  
   