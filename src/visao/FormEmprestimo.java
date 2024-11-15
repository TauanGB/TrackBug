/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

import modelo.Funcionario;
import modelo.Equipamento;
import modelo.Emprestimo;
import modelo.Emprestimo;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *
 * @author tauan
 */
public class FormEmprestimo extends javax.swing.JInternalFrame {
    Principal master;

    /**
     * Creates new form FormFuncionario
     */
    public FormEmprestimo(Principal master) {
        initComponents();
        this.master = master;
        
        
        DefaultListModel<String> model = new DefaultListModel<>();
        DefaultListModel<String> model2 = new DefaultListModel<>();
        
        for (Funcionario classe : master.funcionarioController.listarFuncionarios()) {
            String nomeSimples = classe.getNome();
            for (Emprestimo classe2 : master.emprestimoController.listarEmprestimos()) {
                if(classe2.getFuncionario().getNome().equals(nomeSimples)){
                    continue;
                }
                else{
                    model.addElement(nomeSimples);
                }
            }
            
        }

        ListFunc.setModel(model);

        for (Equipamento classe : master.equipamentoController.listarEquipamentos()) {
            if(classe.status.equals("Disponivel")){
                String nomeSimples = classe.getDescricao();
                model2.addElement(nomeSimples);
            }
        }

        ListEquip.setModel(model2);
        
    }
    public static LocalDate converterParaLocalDate(JTextField txtDia, JTextField txtMes, JTextField txtAno) {
        try {
            int dia = Integer.parseInt(txtDia.getText());
            int mes = Integer.parseInt(txtMes.getText());
            int ano = Integer.parseInt(txtAno.getText());


            // Validar a data (opcional)
            // ...

            return LocalDate.of(ano, mes, dia);
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter para LocalDate: " + e.getMessage());
            return LocalDate.of(2000, 1, 1); // Ou lançar uma exceção personalizada
        }
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
        BtSalvar = new javax.swing.JButton();
        BtFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListFunc = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListEquip = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        EntryDtSaidaAno = new javax.swing.JFormattedTextField();
        LbDtAdmissao3 = new javax.swing.JLabel();
        LbDtAdmissao2 = new javax.swing.JLabel();
        EntryDtSaidaMes = new javax.swing.JFormattedTextField();
        EntryDtSaidaDia = new javax.swing.JFormattedTextField();
        LbDtAdmissao1 = new javax.swing.JLabel();
        LbDtAdmissao = new javax.swing.JLabel();
        LbDtAdmissao4 = new javax.swing.JLabel();
        LbDtAdmissao5 = new javax.swing.JLabel();
        EntryDtpvAno = new javax.swing.JFormattedTextField();
        LbDtAdmissao6 = new javax.swing.JLabel();
        LbDtAdmissao7 = new javax.swing.JLabel();
        EntryDtpvMes = new javax.swing.JFormattedTextField();
        EntryDtPvDia = new javax.swing.JFormattedTextField();
        EntryObs = new javax.swing.JTextField();
        LbDtAdmissao8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Atualizar.png"))); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        BtFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Fechar.png"))); // NOI18N
        BtFechar.setText("Cancelar");
        BtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalvar)
                    .addComponent(BtFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ListFunc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListFunc);

        jLabel1.setText("Funcionarios disponiveis");

        ListEquip.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListEquip);

        jLabel2.setText("Equipamentos disponiveis");

        EntryDtSaidaAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryDtSaidaAnoActionPerformed(evt);
            }
        });

        LbDtAdmissao3.setText("Ano");

        LbDtAdmissao2.setText("Mês");

        LbDtAdmissao1.setText("Dia");

        LbDtAdmissao.setText("Data de Saida");

        LbDtAdmissao4.setText("Dia");

        LbDtAdmissao5.setText("Data Prevista de volta");

        EntryDtpvAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryDtpvAnoActionPerformed(evt);
            }
        });

        LbDtAdmissao6.setText("Ano");

        LbDtAdmissao7.setText("Mês");

        LbDtAdmissao8.setText("Observações");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LbDtAdmissao1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EntryDtSaidaDia))
                        .addComponent(LbDtAdmissao)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LbDtAdmissao2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EntryDtSaidaMes))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LbDtAdmissao3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EntryDtSaidaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LbDtAdmissao4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EntryDtPvDia))
                        .addComponent(LbDtAdmissao5)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LbDtAdmissao7)
                                .addComponent(LbDtAdmissao6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EntryDtpvAno)
                                .addComponent(EntryDtpvMes)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbDtAdmissao8)
                    .addComponent(EntryObs, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LbDtAdmissao5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntryDtPvDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDtAdmissao4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntryDtpvMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDtAdmissao7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EntryDtpvAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDtAdmissao6)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbDtAdmissao)
                            .addComponent(LbDtAdmissao8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntryDtSaidaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDtAdmissao1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntryDtSaidaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDtAdmissao2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntryDtSaidaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDtAdmissao3)))
                            .addComponent(EntryObs, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        // TODO add your handling code here:
        Funcionario functemp;
        Equipamento equiptemp;
        functemp = null;
        equiptemp = null;
        
        LocalDate localdatemtp = converterParaLocalDate(EntryDtSaidaDia,EntryDtSaidaMes,EntryDtSaidaAno);
        LocalDate localdatemtp2 = converterParaLocalDate(EntryDtPvDia,EntryDtpvMes,EntryDtpvAno);
        
        for (Funcionario fun: master.funcionarioController.listarFuncionarios()) {
            if(fun.getNome().equals(ListFunc.getSelectedValue())){
                functemp = fun;
            }
        }
        
        for (Equipamento equip: master.equipamentoController.listarEquipamentos()) {
            if(equip.getDescricao().equals(ListEquip.getSelectedValue()) && equip.status.equals("Disponivel")){
                equiptemp = equip;
                equiptemp.setStatus("Indisponivel");
            }
        }
        
        

        
        
        master.emprestimoController.adicionarEmprestimo(localdatemtp,functemp,equiptemp,EntryObs.getText(),localdatemtp2);
        master.salvarDadosDeSer();
        master.atualizarTabela();
        this.dispose();
        

    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtFecharActionPerformed

    private void EntryDtSaidaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryDtSaidaAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryDtSaidaAnoActionPerformed

    private void EntryDtpvAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryDtpvAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryDtpvAnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtFechar;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JFormattedTextField EntryDtPvDia;
    private javax.swing.JFormattedTextField EntryDtSaidaAno;
    private javax.swing.JFormattedTextField EntryDtSaidaDia;
    private javax.swing.JFormattedTextField EntryDtSaidaMes;
    private javax.swing.JFormattedTextField EntryDtpvAno;
    private javax.swing.JFormattedTextField EntryDtpvMes;
    private javax.swing.JTextField EntryObs;
    private javax.swing.JLabel LbDtAdmissao;
    private javax.swing.JLabel LbDtAdmissao1;
    private javax.swing.JLabel LbDtAdmissao2;
    private javax.swing.JLabel LbDtAdmissao3;
    private javax.swing.JLabel LbDtAdmissao4;
    private javax.swing.JLabel LbDtAdmissao5;
    private javax.swing.JLabel LbDtAdmissao6;
    private javax.swing.JLabel LbDtAdmissao7;
    private javax.swing.JLabel LbDtAdmissao8;
    private javax.swing.JList<String> ListEquip;
    private javax.swing.JList<String> ListFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
