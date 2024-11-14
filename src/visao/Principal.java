/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import controladores.ControladorEmprestimo;
import controladores.ControladorEquipamento;
import controladores.ControladorFuncionario;
import controladores.MenuControll;
import java.util.List;
import java.time.LocalDate;
import modelo.Emprestimo;
import modelo.Equipamento;
import modelo.Funcionario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tauan
 */
public class Principal extends javax.swing.JFrame {
    public ControladorEmprestimo emprestimoController = new ControladorEmprestimo();
    public ControladorEquipamento equipamentoController = new ControladorEquipamento();
    public ControladorFuncionario funcionarioController = new ControladorFuncionario();
    public MenuControll menuController = new MenuControll();

    /**
     * Creates new form Principal
     */
    public Principal() {
        carregarDadosDeSer();
        System.out.println(emprestimoController.listarEmprestimos());
        System.out.println(equipamentoController.listarEquipamentos());
        System.out.println(funcionarioController.listarFuncionarios());
        
        initComponents();
        
        LocalDate dataAtual = LocalDate.now();
        
        for (Emprestimo classe : emprestimoController.listarEmprestimos()) {
            if(dataAtual.isAfter(classe.getdataHoraRetorno())){
                classe.setStatus("ATRASADO");
                }
            }


        
        String[] colunas = {"Funcionario", "Equipamentos", "Status","Descrição"};
        DefaultTableModel model3 = new DefaultTableModel(colunas, 0);
        
        for (Emprestimo classe : emprestimoController.listarEmprestimos()) {
            Object[] linha = {classe.getFuncionario().getNome(),classe.getEquipamento().getDescricao(),classe.getStatus(),classe.getObservacoes()};
            
            model3.addRow(linha);
        }
        
        jTable1.setModel(model3);
        
        
        
        DefaultListModel<String> model = new DefaultListModel<>();
        DefaultListModel<String> model2 = new DefaultListModel<>();


        for (Funcionario classe : funcionarioController.listarFuncionarios()) {
            String nomeSimples = classe.getNome();
            model.addElement(nomeSimples);
        }

        jList2.setModel(model);

        for (Equipamento classe : equipamentoController.listarEquipamentos()) {
            String nomeSimples = classe.getDescricao();
            model2.addElement(nomeSimples);
        }

        jList1.setModel(model2);
        
    }

    public boolean dataPrevistaExcedida(LocalDate dataPrevista) {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.isAfter(dataPrevista);
    }

        
    public boolean VerifFuncioDup(String nome,String cargo){
        for (Funcionario classe : funcionarioController.listarFuncionarios()) {
            System.out.println();
            if (classe.getNome().equals(nome) || classe.getCargo().equals(cargo)) {
                return true;
            }
        }
        return false;
        
    }
    
    public void atualizarTabela() {
        String[] colunas = {"Equipamento", "Funcionario", "Status","Novo"};
        DefaultTableModel model3 = new DefaultTableModel(colunas, 0);
        
        for (Emprestimo classe : emprestimoController.listarEmprestimos()) {
            Object[] linha = {classe.getFuncionario(),classe.getEquipamento(),classe.getStatus(),classe.getObservacoes()};
            
            model3.addRow(linha);
        }
        jTable1.setModel(model3);
    }
    
    public void atualizarListaEquip() {
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Equipamento classe : equipamentoController.listarEquipamentos()) {
            String nomeSimples = classe.getDescricao();
            model.addElement(nomeSimples);
        }

        jList1.setModel(model);
    }
    
    
    public void atualizarListaFunc() {
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Funcionario classe : funcionarioController.listarFuncionarios()) {
            String nomeSimples = classe.getNome();
            model.addElement(nomeSimples);
        }

        jList2.setModel(model);
    }
    
    
    
    private void carregarDadosDeSer() {
        try (FileInputStream fis = new FileInputStream("Dados.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

           // Lê cada lista do arquivo
           funcionarioController.carregarDados((List<Funcionario>) ois.readObject());
           equipamentoController.carregarDados((List<Equipamento>) ois.readObject());
           emprestimoController.carregarDados((List<Emprestimo>) ois.readObject());

           System.out.println("Dados carregados com sucesso de " + "Dados.ser");
        } catch (IOException | ClassNotFoundException e) {
            salvarDadosDeSer();
            System.err.println("Erro ao carregar os dados: " + e.getMessage());
        }
	}

    public void salvarDadosDeSer(){
        try (FileOutputStream fos = new FileOutputStream("Dados.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

           List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();



           // Escreve cada lista no arquivo
           oos.writeObject(funcionarios);
           oos.writeObject(equipamentoController.listarEquipamentos());
           oos.writeObject(emprestimoController.listarEmprestimos());

        } catch (IOException e) {
                System.err.println("Erro ao salvar os dados: " + e.getMessage());
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        LabelEmprestimos = new javax.swing.JLabel();
        LabelEquipamentos = new javax.swing.JLabel();
        ScrollEquipamentos = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        LabelFuncio = new javax.swing.JLabel();
        ScrollFuncio = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastrar = new javax.swing.JMenu();
        jmEquipamento = new javax.swing.JMenuItem();
        jmFnucionario = new javax.swing.JMenuItem();
        jmEmprestimo = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrackBug Emprestimos");
        setPreferredSize(new java.awt.Dimension(958, 500));
        setResizable(false);

        LabelEmprestimos.setText("EMPRESTIMOS PENDENTES");

        LabelEquipamentos.setText("EQUIPAMENTOS DISPONIVEIS");

        ScrollEquipamentos.setViewportView(jList1);

        LabelFuncio.setText("FUNCIONARIOS DISPONIVEIS");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollFuncio.setViewportView(jList2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.setLayer(LabelEmprestimos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelEquipamentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ScrollEquipamentos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelFuncio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ScrollFuncio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEmprestimos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(LabelEquipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65))
                    .addComponent(ScrollEquipamentos)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addGap(275, 275, 275))
                    .addComponent(ScrollFuncio))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmprestimos)
                    .addComponent(LabelEquipamentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(ScrollEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelFuncio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jmCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Adicionar.png"))); // NOI18N
        jmCadastrar.setText("Cadastro");

        jmEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Equipamento.png"))); // NOI18N
        jmEquipamento.setText("Equipamento");
        jmEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEquipamentoActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmEquipamento);

        jmFnucionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Funcionario.png"))); // NOI18N
        jmFnucionario.setText("Funcionario");
        jmFnucionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFnucionarioActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmFnucionario);

        jMenuBar1.add(jmCadastrar);

        jmEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Emprestimo.png"))); // NOI18N
        jmEmprestimo.setText("Emprestimo");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/add.png"))); // NOI18N
        jMenuItem4.setText("Criar Novo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmEmprestimo.add(jMenuItem4);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Atualizar.png"))); // NOI18N
        jMenuItem3.setText("Atualizar");
        jmEmprestimo.add(jMenuItem3);

        jMenuBar1.add(jmEmprestimo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEquipamentoActionPerformed
    // TODO add your handling code here:
        FormEquipamento tela_Equip = new FormEquipamento(this);
        jDesktopPane1.add(tela_Equip);
        tela_Equip.setVisible(true);
      
    }//GEN-LAST:event_jmEquipamentoActionPerformed

    private void jmFnucionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFnucionarioActionPerformed
        // TODO add your handling code here:
        FormFuncionario tela = new FormFuncionario(this);
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmFnucionarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FormEmprestimo tela = new FormEmprestimo(this);
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmprestimos;
    private javax.swing.JLabel LabelEquipamentos;
    private javax.swing.JLabel LabelFuncio;
    private javax.swing.JScrollPane ScrollEquipamentos;
    private javax.swing.JScrollPane ScrollFuncio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmEmprestimo;
    private javax.swing.JMenuItem jmEquipamento;
    private javax.swing.JMenuItem jmFnucionario;
    // End of variables declaration//GEN-END:variables
}
