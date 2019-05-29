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
   import javax.swing.JFrame;
 
 public class IzmenaFrame extends javax.swing.JFrame {  
    
 
    public IzmenaFrame() {  
      initComponents();  
    }  

    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">               
    private void initComponents() {  
    
      jScrollPane1 = new javax.swing.JScrollPane();  
      tabela = new javax.swing.JTable();  
      povratakBtn = new javax.swing.JButton();  
      jLabel1 = new javax.swing.JLabel();  
      idTf = new javax.swing.JTextField();  
      jLabel2 = new javax.swing.JLabel();  
      jLabel3 = new javax.swing.JLabel();  
      jLabel4 = new javax.swing.JLabel();  
      jLabel5 = new javax.swing.JLabel();  
      imeTf = new javax.swing.JTextField();  
      godineTf = new javax.swing.JTextField();  
      adresaTf = new javax.swing.JTextField();  
      dohodakTf = new javax.swing.JTextField();  
      imeBtn = new javax.swing.JButton();  
      godineBtn = new javax.swing.JButton();  
      adresaBtn = new javax.swing.JButton();  
      dohodakBtn = new javax.swing.JButton();  
      prikazBtn = new javax.swing.JButton();  
    
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
      setTitle("Izmena podataka zaposlenih");  
      addWindowListener(new java.awt.event.WindowAdapter() {  
        public void windowOpened(java.awt.event.WindowEvent evt) {  
          formWindowOpened(evt);  
        }  
      });  
    
      jScrollPane1.setBackground(new java.awt.Color(0, 59, 70));  
      jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Zaposleni:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(196, 223, 230))); // NOI18N  
    
      tabela.setBorder(null);  
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
   
     povratakBtn.setBackground(new java.awt.Color(126, 103, 94));  
      povratakBtn.setForeground(java.awt.Color.white);  
      povratakBtn.setText("Povratak u Meni");  
      povratakBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
       
        }  
      });  
    
      jLabel1.setForeground(java.awt.Color.white);  
      jLabel1.setText("ID zaposlenog");  
    
      jLabel2.setForeground(java.awt.Color.white);  
      jLabel2.setText("Ime i prezime");  
    
      jLabel3.setForeground(java.awt.Color.white);  
      jLabel3.setText("Godine");  
    
      jLabel4.setForeground(java.awt.Color.white);  
      jLabel4.setText("Adresa");  
    
      jLabel5.setForeground(java.awt.Color.white);  
      jLabel5.setText("Dohodak");  
    
     imeBtn.setBackground(new java.awt.Color(126, 103, 94));  
      imeBtn.setForeground(java.awt.Color.white);  
      imeBtn.setText("Izmeni");  
      imeBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          imeBtnActionPerformed(evt);  
        }  
      });  
    
      godineBtn.setBackground(new java.awt.Color(126, 103, 94));  
      godineBtn.setForeground(java.awt.Color.white);  
      godineBtn.setText("Izmeni");  
      godineBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          godineBtnActionPerformed(evt);  
        }  
      });  
    
      adresaBtn.setBackground(new java.awt.Color(126, 103, 94));  
      adresaBtn.setForeground(java.awt.Color.white);  
      adresaBtn.setText("Izmeni");  
      adresaBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          adresaBtnActionPerformed(evt);  
        }  
      });  
    
      dohodakBtn.setBackground(new java.awt.Color(126, 103, 94));  
      dohodakBtn.setForeground(java.awt.Color.white);  
      dohodakBtn.setText("Izmeni");  
      dohodakBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          dohodakBtnActionPerformed(evt);  
        }  
      });  
    
      prikazBtn.setBackground(new java.awt.Color(126, 103, 94));  
      prikazBtn.setForeground(java.awt.Color.white);  
      prikazBtn.setText("Prikaz svih zaposlenih");  
      prikazBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          prikazBtnActionPerformed(evt);  
        }  
      });  
    
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
      getContentPane().setLayout(layout);  
      layout.setHorizontalGroup(  
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
        .addGroup(layout.createSequentialGroup()  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)  
            .addGroup(layout.createSequentialGroup()  
              .addContainerGap()  
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))  
           .addGroup(layout.createSequentialGroup()  
              .addGap(33, 33, 33)  
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
                .addGroup(layout.createSequentialGroup()  
                 .addComponent(jLabel1)  
                  .addGap(45, 45, 45)  
                        .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))  
               .addGroup(layout.createSequentialGroup()  
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
                   .addComponent(jLabel2)  
                    .addComponent(jLabel3)  
                   .addComponent(jLabel4)  
                   .addComponent(jLabel5))  
                  .addGap(48, 48, 48)  
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)  
                    .addComponent(imeTf)  
                    .addComponent(godineTf)  
                    .addComponent(adresaTf)  
                   .addComponent(dohodakTf, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))  
                  .addGap(30, 30, 30)  
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
                    .addComponent(imeBtn)  
                    .addComponent(adresaBtn)  
                    .addComponent(dohodakBtn)  
                    .addComponent(godineBtn)))  
                .addGroup(layout.createSequentialGroup()  
                  .addComponent(prikazBtn)  
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                  .addComponent(povratakBtn)  
                  .addGap(11, 11, 11)))))  
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
      );  
      layout.setVerticalGroup(  
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
       .addGroup(layout.createSequentialGroup()  
          .addGap(23, 23, 23)  
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)  
          .addGap(23, 23, 23)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel1)  
                  .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  
          .addGap(23, 23, 23)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel2)  
            .addComponent(imeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(imeBtn))  
          .addGap(16, 16, 16)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel3)  
            .addComponent(godineTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(godineBtn))  
          .addGap(16, 16, 16)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel4)  
            .addComponent(adresaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
            .addComponent(adresaBtn))  
          .addGap(16, 16, 16)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(jLabel5)  
            .addComponent(dohodakTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
           .addComponent(dohodakBtn))  
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
            .addComponent(povratakBtn)  
            .addComponent(prikazBtn))  
               .addGap(20, 20, 20))  
      );  
    
      pack();  
    }// </editor-fold>              
       
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
        
                       
    
    private void imeBtnActionPerformed(java.awt.event.ActionEvent evt) {                      
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
        Query q = s.createQuery("update Zaposleni z set z.ime='"+imeTf.getText()+"' where z.zaposleni_id='" +idTf.getText()+"'");  
        q.executeUpdate();  
        Query q2 = s.createQuery("from Zaposleni z where z.zaposleni_id='" + idTf.getText()+"'");  
        List listaRezultata = q2.list();  
        prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
      } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
        
        
      imeTf.setText("");  
      idTf.setText("");  
    }                     
    
    private void prikazBtnActionPerformed(java.awt.event.ActionEvent evt) {                       
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
       Query q = s.createQuery("from Zaposleni");  
        List listaRezultata = q.list();  
        prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
     } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
    }                       
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                   
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
        Query q = s.createQuery("from Zaposleni");  
        List listaRezultata = q.list();  
        prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
      } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
      
    }                   
    
    private void godineBtnActionPerformed(java.awt.event.ActionEvent evt) {                       
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
       Query q = s.createQuery("update Zaposleni z set z.godine='"+godineTf.getText()+"' where z.zaposleni_id='" +idTf.getText()+"'");  
        q.executeUpdate();  
        Query q2 = s.createQuery("from Zaposleni z where z.zaposleni_id='" + idTf.getText()+"'");  
        List listaRezultata = q2.list();  
       prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
      } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
        
      godineTf.setText("");  
     idTf.setText("");  
    }                       
    
    private void adresaBtnActionPerformed(java.awt.event.ActionEvent evt) {                       
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
        Query q = s.createQuery("update Zaposleni z set z.adresa='"+adresaTf.getText()+"' where z.zaposleni_id='" +idTf.getText()+"'");  
        q.executeUpdate();  
        Query q2 = s.createQuery("from Zaposleni z where z.zaposleni_id='" + idTf.getText()+"'");  
        List listaRezultata = q2.list();  
        prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
      } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
        
      adresaTf.setText("");  
      idTf.setText("");  
    }                       
    
    private void dohodakBtnActionPerformed(java.awt.event.ActionEvent evt) {                        
      try{  
        Session s = HibernateUtil.getSessionFactory().openSession();  
        s.beginTransaction();  
        Query q = s.createQuery("update Zaposleni z set z.dohodak='"+dohodakTf.getText()+"' where z.zaposleni_id='" +idTf.getText()+"'");  
        q.executeUpdate();  
        Query q2 = s.createQuery("from Zaposleni z where z.zaposleni_id='" + idTf.getText()+"'");  
        List listaRezultata = q2.list();  
        prikaziRezultat(listaRezultata);  
        s.getTransaction().commit();  
          
      } catch (HibernateException e) {System.out.println("GRESKA! :" + e.getMessage());}  
        
        
      dohodakTf.setText("");  
     idTf.setText("");  
    }                       
  
    public static void main(String args[]) {  

      try {  
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {  
          if ("Nimbus".equals(info.getName())) {  
            javax.swing.UIManager.setLookAndFeel(info.getClassName());  
            break;  
          }  
       }  
      } catch (ClassNotFoundException ex) {  
        java.util.logging.Logger.getLogger(IzmenaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (InstantiationException ex) {  
       java.util.logging.Logger.getLogger(IzmenaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (IllegalAccessException ex) {  
        java.util.logging.Logger.getLogger(IzmenaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {  
        java.util.logging.Logger.getLogger(IzmenaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      }  
      //</editor-fold>  
    
      /* Create and display the form */  
      java.awt.EventQueue.invokeLater(new Runnable() {  
        public void run() {  
          new IzmenaFrame().setVisible(true);  
       }  
      });  
    }  
    
    // Variables declaration - do not modify             
    private javax.swing.JButton adresaBtn;  
    private javax.swing.JTextField adresaTf;  
    private javax.swing.JButton dohodakBtn;  
    private javax.swing.JTextField dohodakTf;  
    private javax.swing.JButton godineBtn;  
    private javax.swing.JTextField godineTf;  
    private javax.swing.JTextField idTf;  
    private javax.swing.JButton imeBtn;  
    private javax.swing.JTextField imeTf;  
    private javax.swing.JLabel jLabel1;  
    private javax.swing.JLabel jLabel2;  
    private javax.swing.JLabel jLabel3;  
    private javax.swing.JLabel jLabel4;  
    private javax.swing.JLabel jLabel5;  
    private javax.swing.JScrollPane jScrollPane1;  
    private javax.swing.JButton povratakBtn;  
    private javax.swing.JButton prikazBtn;  
    private javax.swing.JTable tabela;  
    // End of variables declaration            
  }  