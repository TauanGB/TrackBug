/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author tauan
 */
public class GerenciarDados extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public GerenciarDados() {
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

        PainelCadastro = new javax.swing.JTabbedPane();
        jFuncionario = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        EntryNome = new javax.swing.JTextField();
        LabelCargo = new javax.swing.JLabel();
        EntryCargo = new javax.swing.JTextField();
        LabelDataAdmissaoFunc = new javax.swing.JLabel();
        LabelDiaFunc = new javax.swing.JLabel();
        EntryDiaFunc = new javax.swing.JTextField();
        LabelMesFunc = new javax.swing.JLabel();
        EntryMesFunc = new javax.swing.JTextField();
        LabelAnoFunc = new javax.swing.JLabel();
        EntryAnoFunc = new javax.swing.JTextField();
        Barra4 = new javax.swing.JLabel();
        Barra3 = new javax.swing.JLabel();
        BtAdicionar = new javax.swing.JButton();
        LabelFuncionariosLista = new javax.swing.JLabel();
        ListaFuncionarios = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jEquipamentos = new javax.swing.JPanel();
        jDesricao = new javax.swing.JLabel();
        EntryDescricao = new javax.swing.JTextField();
        LabelPeso = new javax.swing.JLabel();
        EntryPeso = new javax.swing.JTextField();
        LabelLargura = new javax.swing.JLabel();
        EntryLargura = new javax.swing.JTextField();
        LabelComprimento = new javax.swing.JLabel();
        EntryComprimento = new javax.swing.JTextField();
        LabelDataAdmissao = new javax.swing.JLabel();
        LabelDia = new javax.swing.JLabel();
        EntryDia = new javax.swing.JTextField();
        Barra2 = new javax.swing.JLabel();
        LabelMes = new javax.swing.JLabel();
        EntryMes = new javax.swing.JTextField();
        Barra1 = new javax.swing.JLabel();
        LabelAno = new javax.swing.JLabel();
        EntryAno = new javax.swing.JTextField();
        ListaEquipamento = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        LabelEquipamentos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LabelCadastro = new javax.swing.JLabel();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelNome.setText("Nome");

        EntryNome.setPreferredSize(new java.awt.Dimension(250, 22));
        EntryNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryNomeActionPerformed(evt);
            }
        });

        LabelCargo.setText("Cargo");

        EntryCargo.setPreferredSize(new java.awt.Dimension(250, 22));

        LabelDataAdmissaoFunc.setText("Data de admissão");

        LabelDiaFunc.setText("Dia");

        EntryDiaFunc.setPreferredSize(new java.awt.Dimension(40, 22));

        LabelMesFunc.setText("Mês");

        EntryMesFunc.setMaximumSize(new java.awt.Dimension(50, 22));
        EntryMesFunc.setMinimumSize(new java.awt.Dimension(40, 22));
        EntryMesFunc.setPreferredSize(new java.awt.Dimension(50, 22));
        EntryMesFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryMesFuncActionPerformed(evt);
            }
        });

        LabelAnoFunc.setText("Ano");

        EntryAnoFunc.setMaximumSize(new java.awt.Dimension(50, 22));
        EntryAnoFunc.setMinimumSize(new java.awt.Dimension(40, 22));
        EntryAnoFunc.setPreferredSize(new java.awt.Dimension(50, 22));

        Barra4.setText("/");

        Barra3.setText("/");

        BtAdicionar.setText("Alterar");

        LabelFuncionariosLista.setText("Funcionarios Ja existentes");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaFuncionarios.setViewportView(jList2);

        javax.swing.GroupLayout jFuncionarioLayout = new javax.swing.GroupLayout(jFuncionario);
        jFuncionario.setLayout(jFuncionarioLayout);
        jFuncionarioLayout.setHorizontalGroup(
            jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ListaFuncionarios)
                    .addComponent(LabelFuncionariosLista, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNome)
                    .addComponent(BtAdicionar)
                    .addComponent(EntryCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCargo)
                    .addComponent(EntryNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDiaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntryDiaFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addComponent(Barra3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EntryAnoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Barra4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EntryMesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addComponent(LabelMesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelAnoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(LabelDataAdmissaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jFuncionarioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EntryCargo, EntryNome, LabelCargo, LabelNome});

        jFuncionarioLayout.setVerticalGroup(
            jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(LabelFuncionariosLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                        .addComponent(EntryNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntryCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelDataAdmissaoFunc)
                        .addGap(5, 5, 5)
                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addComponent(LabelMesFunc)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jFuncionarioLayout.createSequentialGroup()
                                .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDiaFunc)
                                    .addGroup(jFuncionarioLayout.createSequentialGroup()
                                        .addComponent(LabelAnoFunc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(EntryDiaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EntryMesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EntryAnoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Barra4)
                                            .addComponent(Barra3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(BtAdicionar))))
                    .addComponent(ListaFuncionarios))
                .addContainerGap())
        );

        PainelCadastro.addTab("Funcionarios", jFuncionario);

        jDesricao.setText("Descrição");

        EntryDescricao.setPreferredSize(new java.awt.Dimension(250, 22));
        EntryDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryDescricaoActionPerformed(evt);
            }
        });

        LabelPeso.setText("Peso");

        EntryPeso.setPreferredSize(new java.awt.Dimension(250, 22));

        LabelLargura.setText("Largura");

        EntryLargura.setPreferredSize(new java.awt.Dimension(250, 22));

        LabelComprimento.setText("Comprimento");

        EntryComprimento.setPreferredSize(new java.awt.Dimension(250, 22));

        LabelDataAdmissao.setText("Data de admissão");

        LabelDia.setText("Dia");

        Barra2.setText("/");

        LabelMes.setText("Mês");

        EntryMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryMesActionPerformed(evt);
            }
        });

        Barra1.setText("/");

        LabelAno.setText("Ano");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaEquipamento.setViewportView(jList1);

        LabelEquipamentos.setText("Equipamentos Ja existentes");

        jButton2.setText("Alterar");

        javax.swing.GroupLayout jEquipamentosLayout = new javax.swing.GroupLayout(jEquipamentos);
        jEquipamentos.setLayout(jEquipamentosLayout);
        jEquipamentosLayout.setHorizontalGroup(
            jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEquipamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListaEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(EntryDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesricao)
                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                        .addComponent(EntryDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Barra1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelMes)
                            .addGroup(jEquipamentosLayout.createSequentialGroup()
                                .addComponent(EntryAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Barra2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAno)
                            .addComponent(EntryMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPeso)
                            .addComponent(EntryPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLargura)
                            .addComponent(EntryLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelComprimento)
                            .addComponent(EntryComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LabelDataAdmissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jEquipamentosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EntryDescricao, jDesricao});

        jEquipamentosLayout.setVerticalGroup(
            jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEquipamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDesricao)
                    .addComponent(LabelEquipamentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jEquipamentosLayout.createSequentialGroup()
                                .addComponent(EntryDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                                        .addComponent(LabelPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EntryPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                                        .addComponent(LabelLargura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EntryLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jEquipamentosLayout.createSequentialGroup()
                                .addComponent(LabelComprimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EntryComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelDataAdmissao)
                        .addGap(5, 5, 5)
                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEquipamentosLayout.createSequentialGroup()
                                .addComponent(LabelMes)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jEquipamentosLayout.createSequentialGroup()
                                .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                                        .addComponent(LabelDia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EntryDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jEquipamentosLayout.createSequentialGroup()
                                        .addComponent(LabelAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jEquipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(EntryMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EntryAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Barra2)
                                            .addComponent(Barra1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addComponent(ListaEquipamento))
                .addContainerGap())
        );

        PainelCadastro.addTab("Equipamentos", jEquipamentos);

        LabelCadastro.setText("GERENCIAR DADOS");

        BtVoltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCadastro)
                    .addComponent(BtVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelCadastro.getAccessibleContext().setAccessibleName("Tabelas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntryMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryMesActionPerformed

    private void EntryDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryDescricaoActionPerformed

    private void EntryMesFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryMesFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryMesFuncActionPerformed

    private void EntryNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barra1;
    private javax.swing.JLabel Barra2;
    private javax.swing.JLabel Barra3;
    private javax.swing.JLabel Barra4;
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JTextField EntryAno;
    private javax.swing.JTextField EntryAnoFunc;
    private javax.swing.JTextField EntryCargo;
    private javax.swing.JTextField EntryComprimento;
    private javax.swing.JTextField EntryDescricao;
    private javax.swing.JTextField EntryDia;
    private javax.swing.JTextField EntryDiaFunc;
    private javax.swing.JTextField EntryLargura;
    private javax.swing.JTextField EntryMes;
    private javax.swing.JTextField EntryMesFunc;
    private javax.swing.JTextField EntryNome;
    private javax.swing.JTextField EntryPeso;
    private javax.swing.JLabel LabelAno;
    private javax.swing.JLabel LabelAnoFunc;
    private javax.swing.JLabel LabelCadastro;
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelComprimento;
    private javax.swing.JLabel LabelDataAdmissao;
    private javax.swing.JLabel LabelDataAdmissaoFunc;
    private javax.swing.JLabel LabelDia;
    private javax.swing.JLabel LabelDiaFunc;
    private javax.swing.JLabel LabelEquipamentos;
    private javax.swing.JLabel LabelFuncionariosLista;
    private javax.swing.JLabel LabelLargura;
    private javax.swing.JLabel LabelMes;
    private javax.swing.JLabel LabelMesFunc;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelPeso;
    private javax.swing.JScrollPane ListaEquipamento;
    private javax.swing.JScrollPane ListaFuncionarios;
    private javax.swing.JTabbedPane PainelCadastro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jDesricao;
    private javax.swing.JPanel jEquipamentos;
    private javax.swing.JPanel jFuncionario;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    // End of variables declaration//GEN-END:variables
}
