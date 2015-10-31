
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class QuizForm extends javax.swing.JFrame {

    private final LinkedList<Question> Quiz;
    /**
     * Creates new form QuizForm
     */
    public QuizForm() {
        initComponents();
        this.Quiz = new LinkedList();
        StartQuiz.setVisible(false);
        initProgram();
    }
    
    private void initProgram(){
        QuestionPanel.setVisible(false);
        QuestionFeild.setText(null);
        // initShortAnswer
        ShortAnswerRadio.setSelected(false);
        ShortAnswerPanel.setVisible(false);
        ShortAnswerArea.setText(null);
        // initFillinBlank
        FillinBlankRadio.setSelected(false);
        FillinBlankPanel.setVisible(false);
        FillinBlankFeild.setText(null);
        // initTrueFalse
        TrueFalseRadio.setSelected(false);
        TrueFalsePanel.setVisible(false);
        TrueRadio.setSelected(false);
        FalseRadio.setSelected(false);
        // initMultiple
        MultipleRadio.setSelected(false);
        MultiplePanel.setVisible(false);
        FirstRadio.setSelected(false);
        SecondRadio.setSelected(false);
        ThirdRadio.setSelected(false);
        FirstText.setText(null);
        SecondText.setText(null);
        ThirdText.setText(null);
        // Start Quiz button
        if(!Quiz.isEmpty())
            StartQuiz.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TypeLabel = new javax.swing.JLabel();
        ShortAnswerRadio = new javax.swing.JRadioButton();
        FillinBlankRadio = new javax.swing.JRadioButton();
        TrueFalseRadio = new javax.swing.JRadioButton();
        MultipleRadio = new javax.swing.JRadioButton();
        QuestionPanel = new javax.swing.JPanel();
        QuestionLabel = new javax.swing.JLabel();
        QuestionFeild = new javax.swing.JTextField();
        SubmitQuestion = new javax.swing.JButton();
        ShortAnswerPanel = new javax.swing.JPanel();
        ShotAnswerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShortAnswerArea = new javax.swing.JTextArea();
        FillinBlankPanel = new javax.swing.JPanel();
        FillinBlankLabel = new javax.swing.JLabel();
        FillinBlankFeild = new javax.swing.JTextField();
        TrueFalsePanel = new javax.swing.JPanel();
        TrueFalseLabel = new javax.swing.JLabel();
        TrueRadio = new javax.swing.JRadioButton();
        FalseRadio = new javax.swing.JRadioButton();
        MultiplePanel = new javax.swing.JPanel();
        MultipleLabel = new javax.swing.JLabel();
        FirstText = new javax.swing.JTextField();
        SecondText = new javax.swing.JTextField();
        ThirdText = new javax.swing.JTextField();
        FirstRadio = new javax.swing.JRadioButton();
        SecondRadio = new javax.swing.JRadioButton();
        ThirdRadio = new javax.swing.JRadioButton();
        StartQuiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Quiz");
        setName("QuestionFrame"); // NOI18N
        setResizable(false);

        TypeLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        TypeLabel.setText("Chose Question Type:");

        ShortAnswerRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ShortAnswerRadio.setLabel("Short Answer");
        ShortAnswerRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShortAnswerRadioActionPerformed(evt);
            }
        });

        FillinBlankRadio.setLabel("Fill in Blank");
        FillinBlankRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillinBlankRadioActionPerformed(evt);
            }
        });

        TrueFalseRadio.setLabel("True or False");
        TrueFalseRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrueFalseRadioActionPerformed(evt);
            }
        });

        MultipleRadio.setLabel("Multiple Choice");
        MultipleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleRadioActionPerformed(evt);
            }
        });

        QuestionLabel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        QuestionLabel.setText("Question Text:");

        SubmitQuestion.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        SubmitQuestion.setText("Submit Question");
        SubmitQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitQuestionActionPerformed(evt);
            }
        });

        ShortAnswerPanel.setEnabled(false);

        ShotAnswerLabel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        ShotAnswerLabel.setText("The Answer:");

        ShortAnswerArea.setColumns(20);
        ShortAnswerArea.setRows(5);
        jScrollPane1.setViewportView(ShortAnswerArea);

        javax.swing.GroupLayout ShortAnswerPanelLayout = new javax.swing.GroupLayout(ShortAnswerPanel);
        ShortAnswerPanel.setLayout(ShortAnswerPanelLayout);
        ShortAnswerPanelLayout.setHorizontalGroup(
            ShortAnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShortAnswerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ShotAnswerLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ShortAnswerPanelLayout.setVerticalGroup(
            ShortAnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShortAnswerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShortAnswerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShotAnswerLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FillinBlankPanel.setEnabled(false);

        FillinBlankLabel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        FillinBlankLabel.setText("The Answer:");

        javax.swing.GroupLayout FillinBlankPanelLayout = new javax.swing.GroupLayout(FillinBlankPanel);
        FillinBlankPanel.setLayout(FillinBlankPanelLayout);
        FillinBlankPanelLayout.setHorizontalGroup(
            FillinBlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FillinBlankPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(FillinBlankLabel)
                .addGap(18, 18, 18)
                .addComponent(FillinBlankFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FillinBlankPanelLayout.setVerticalGroup(
            FillinBlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FillinBlankPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FillinBlankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FillinBlankLabel)
                    .addComponent(FillinBlankFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TrueFalsePanel.setEnabled(false);

        TrueFalseLabel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        TrueFalseLabel.setText("The Answer:");

        TrueRadio.setText("True");
        TrueRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrueRadioActionPerformed(evt);
            }
        });

        FalseRadio.setText("False");
        FalseRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FalseRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TrueFalsePanelLayout = new javax.swing.GroupLayout(TrueFalsePanel);
        TrueFalsePanel.setLayout(TrueFalsePanelLayout);
        TrueFalsePanelLayout.setHorizontalGroup(
            TrueFalsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrueFalsePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TrueFalseLabel)
                .addGap(18, 18, 18)
                .addComponent(TrueRadio)
                .addGap(18, 18, 18)
                .addComponent(FalseRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TrueFalsePanelLayout.setVerticalGroup(
            TrueFalsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrueFalsePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TrueFalsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrueFalseLabel)
                    .addComponent(TrueRadio)
                    .addComponent(FalseRadio)))
        );

        MultiplePanel.setEnabled(false);

        MultipleLabel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        MultipleLabel.setText("Check The Correct Answer:");

        FirstText.setToolTipText("");

        FirstRadio.setAlignmentY(0.0F);
        FirstRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstRadioActionPerformed(evt);
            }
        });

        SecondRadio.setAlignmentY(0.0F);
        SecondRadio.setAutoscrolls(true);
        SecondRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondRadioActionPerformed(evt);
            }
        });

        ThirdRadio.setAlignmentY(0.0F);
        ThirdRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MultiplePanelLayout = new javax.swing.GroupLayout(MultiplePanel);
        MultiplePanel.setLayout(MultiplePanelLayout);
        MultiplePanelLayout.setHorizontalGroup(
            MultiplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiplePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(MultipleLabel)
                .addGap(22, 22, 22)
                .addComponent(FirstRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(SecondRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ThirdRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThirdText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MultiplePanelLayout.setVerticalGroup(
            MultiplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiplePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MultiplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ThirdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondRadio)
                    .addComponent(ThirdRadio)
                    .addGroup(MultiplePanelLayout.createSequentialGroup()
                        .addGroup(MultiplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FirstRadio)
                            .addGroup(MultiplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MultipleLabel)
                                .addComponent(FirstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SecondText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QuestionPanelLayout = new javax.swing.GroupLayout(QuestionPanel);
        QuestionPanel.setLayout(QuestionPanelLayout);
        QuestionPanelLayout.setHorizontalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ShortAnswerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FillinBlankPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TrueFalsePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MultiplePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(QuestionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuestionFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(QuestionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SubmitQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuestionPanelLayout.setVerticalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestionFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShortAnswerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FillinBlankPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrueFalsePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MultiplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        StartQuiz.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        StartQuiz.setText("Start Quiz");
        StartQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartQuizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(TypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ShortAnswerRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FillinBlankRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TrueFalseRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MultipleRadio))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(StartQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLabel)
                    .addComponent(ShortAnswerRadio)
                    .addComponent(FillinBlankRadio)
                    .addComponent(TrueFalseRadio)
                    .addComponent(MultipleRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShortAnswerRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShortAnswerRadioActionPerformed
        QuestionPanel.setVisible(true);
        ShortAnswerPanel.setVisible(!ShortAnswerPanel.isVisible());
        FillinBlankPanel.setVisible(false);
        TrueFalsePanel.setVisible(false);
        MultiplePanel.setVisible(false);
        FillinBlankRadio.setSelected(false);
        TrueFalseRadio.setSelected(false);
        MultipleRadio.setSelected(false);
    }//GEN-LAST:event_ShortAnswerRadioActionPerformed

    private void FillinBlankRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillinBlankRadioActionPerformed
        QuestionPanel.setVisible(true);
        ShortAnswerPanel.setVisible(false);
        FillinBlankPanel.setVisible(!FillinBlankPanel.isVisible());
        TrueFalsePanel.setVisible(false);
        MultiplePanel.setVisible(false);
        ShortAnswerRadio.setSelected(false);
        TrueFalseRadio.setSelected(false);
        MultipleRadio.setSelected(false);
    }//GEN-LAST:event_FillinBlankRadioActionPerformed

    private void TrueFalseRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrueFalseRadioActionPerformed
        QuestionPanel.setVisible(true);
        ShortAnswerPanel.setVisible(false);
        FillinBlankPanel.setVisible(false);
        TrueFalsePanel.setVisible(!TrueFalsePanel.isVisible());
        MultiplePanel.setVisible(false);
        FillinBlankRadio.setSelected(false);
        ShortAnswerRadio.setSelected(false);
        MultipleRadio.setSelected(false);
    }//GEN-LAST:event_TrueFalseRadioActionPerformed

    private void MultipleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleRadioActionPerformed
        QuestionPanel.setVisible(true);
        ShortAnswerPanel.setVisible(false);
        FillinBlankPanel.setVisible(false);
        TrueFalsePanel.setVisible(false);
        MultiplePanel.setVisible(!MultiplePanel.isVisible());
        FillinBlankRadio.setSelected(false);
        TrueFalseRadio.setSelected(false);
        ShortAnswerRadio.setSelected(false);
    }//GEN-LAST:event_MultipleRadioActionPerformed

    private void TrueRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrueRadioActionPerformed
        FalseRadio.setSelected(false);
    }//GEN-LAST:event_TrueRadioActionPerformed

    private void FalseRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FalseRadioActionPerformed
        TrueRadio.setSelected(false);
    }//GEN-LAST:event_FalseRadioActionPerformed

    private void ThirdRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdRadioActionPerformed
        SecondRadio.setSelected(false);
        FirstRadio.setSelected(false);
    }//GEN-LAST:event_ThirdRadioActionPerformed

    private void FirstRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstRadioActionPerformed
        SecondRadio.setSelected(false);
        ThirdRadio.setSelected(false);
    }//GEN-LAST:event_FirstRadioActionPerformed

    private void SecondRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondRadioActionPerformed
        ThirdRadio.setSelected(false);
        FirstRadio.setSelected(false);
    }//GEN-LAST:event_SecondRadioActionPerformed

    private void SubmitQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitQuestionActionPerformed
        if(!QuestionFeild.getText().isEmpty()) {
            if(ShortAnswerRadio.isSelected()){
                if(!ShortAnswerArea.getText().isEmpty()){
                    ShortAnswerQuestion Question =
                            new ShortAnswerQuestion(QuestionFeild.getText(), ShortAnswerArea.getText());
                    this.Quiz.add(Question);
                    initProgram();
                }
            }else if(FillinBlankRadio.isSelected()){
                if(!FillinBlankFeild.getText().isEmpty()){
                    FillInBlankQuestion Question =
                            new FillInBlankQuestion(QuestionFeild.getText(), FillinBlankFeild.getText());
                    this.Quiz.add(Question);
                    initProgram();
                }
            }else if(TrueFalseRadio.isSelected()){
                if(TrueRadio.isSelected() || FalseRadio.isSelected()){
                    boolean Answer = false;
                    if(TrueRadio.isSelected()){
                        Answer=true;
                    }else if(FalseRadio.isSelected()){
                        Answer=false;
                    }
                    TrueFalseQuestion Question =
                            new TrueFalseQuestion(QuestionFeild.getText(), Answer);
                    this.Quiz.add(Question);
                    initProgram();
                }
            }else if(MultipleRadio.isSelected()){
                if(!(FirstText.getText().isEmpty() || SecondText.getText().isEmpty() || ThirdText.getText().isEmpty())){
                    if(FirstRadio.isSelected() || SecondRadio.isSelected() || ThirdRadio.isSelected()){
                        MultipleChoiceQuestion Question =
                            new MultipleChoiceQuestion(QuestionFeild.getText());
                        Question.addChoice(FirstText.getText(), FirstRadio.isSelected());
                        Question.addChoice(SecondText.getText(), SecondRadio.isSelected());
                        Question.addChoice(ThirdText.getText(), ThirdRadio.isSelected());
                        this.Quiz.add(Question);
                        initProgram();
                    }
                }
            }
        }
    }//GEN-LAST:event_SubmitQuestionActionPerformed

    private void StartQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartQuizActionPerformed
        TheQuiz Quiz = new TheQuiz(this.Quiz);
        Quiz.setVisible(true);
    }//GEN-LAST:event_StartQuizActionPerformed

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
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new QuizForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FalseRadio;
    private javax.swing.JTextField FillinBlankFeild;
    private javax.swing.JLabel FillinBlankLabel;
    private javax.swing.JPanel FillinBlankPanel;
    private javax.swing.JRadioButton FillinBlankRadio;
    private javax.swing.JRadioButton FirstRadio;
    private javax.swing.JTextField FirstText;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MultipleLabel;
    private javax.swing.JPanel MultiplePanel;
    private javax.swing.JRadioButton MultipleRadio;
    private javax.swing.JTextField QuestionFeild;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JPanel QuestionPanel;
    private javax.swing.JRadioButton SecondRadio;
    private javax.swing.JTextField SecondText;
    private javax.swing.JTextArea ShortAnswerArea;
    private javax.swing.JPanel ShortAnswerPanel;
    private javax.swing.JRadioButton ShortAnswerRadio;
    private javax.swing.JLabel ShotAnswerLabel;
    private javax.swing.JButton StartQuiz;
    private javax.swing.JButton SubmitQuestion;
    private javax.swing.JRadioButton ThirdRadio;
    private javax.swing.JTextField ThirdText;
    private javax.swing.JLabel TrueFalseLabel;
    private javax.swing.JPanel TrueFalsePanel;
    private javax.swing.JRadioButton TrueFalseRadio;
    private javax.swing.JRadioButton TrueRadio;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
