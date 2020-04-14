package faceGraphical.userInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import mainStructures.dataFramework.TableArchetype;
import mainStructures.unitStockpile.CyDatabase;
import mainStructures.toolsModule.textAnalysis.SyntaxHandling;


public class Fenetre extends JFrame {
private JTable tableau;
private JButton btnValid = new JButton("Valid");



private JButton save = new JButton("save");
private JButton importer = new JButton("importer");

JTextArea textArea = new JTextArea();


public Fenetre(){
  this.setLocationRelativeTo(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("JTable");
  this.setSize(800, 500);
  
  CyDatabase myDB = new CyDatabase();
  	

	  JPanel pan = new JPanel();
	
	  
	  pan.add(save);
	  pan.add(importer);
	  pan.add(btnValid);
	  pan.add(new JScrollPane(textArea));
	  textArea.setColumns(30);
	  textArea.setPreferredSize( new Dimension( 500, 100 ) );
	  
	  tableau = new JTable();
	  tableau.setDefaultRenderer(JButton.class, new TableComponent());
	  tableau.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//	  System.out.println("Nombre de colonne : " + model.getColumnCount());
//	  System.out.println("Nombre de ligne : " + model.getRowCount());
	  
	  this.getContentPane().add(pan, BorderLayout.SOUTH);
	  
	  JButton ajouter = new JButton("Ajouter une ligne");
	  this.getContentPane().add(ajouter, BorderLayout.NORTH);
	  
	  ///affiche le tableau au centre
	  this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
	  //affiche le scroll horizontal

	  this.setVisible(true);

	  
	  class ValidAction implements ActionListener {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			  String requis = textArea.getText();
			  SyntaxHandling synSQL = new SyntaxHandling(myDB.getMyTables(),requis);
			  TableArchetype pre = synSQL.makeNodes();
			  
		  	  String[][] data = pre.toJTable();
			  String[] title = pre.getTitle();
			  JTableModel model = new JTableModel(data, title);
			  tableau.setModel(model);
			  
		  }
		  
	  }
	  btnValid.addActionListener(new ValidAction());
	  
	}
}





