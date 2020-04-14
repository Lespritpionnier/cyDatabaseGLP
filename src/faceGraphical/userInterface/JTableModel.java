package faceGraphical.userInterface;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class JTableModel extends AbstractTableModel{
	  private String[][] data;
	  private String[] title;

	  //Constructeur
	  public JTableModel(String[][] data, String[] title){
	    this.data = data;
	    this.title = title;
	  }

	  //Retourne le nombre de colonnes
	  public int getColumnCount() {
	    return this.title.length;
	  }

	  //Retourne le nombre de lignes
	  public int getRowCount() {
	    return this.data.length;
	  }

	  //Retourne la valeur ? l'emplacement sp�cifi?
	  public Object getValueAt(int row, int col) {
	    return this.data[row][col];
	  }            
	  
	  //Retourne le titre de la colonne ? l'indice sp�cifi?
	  public String getColumnName(int col){
		  return this.title[col];
	  }
	  
	  //Retourne la classe de la donn�e de la colonne
	  public Class getColumnClass(int col){
		  //On retourne le type de la cellule ? la colonne demand�e
		  //On se moque de la puisque les types de donn�e sont les m�me 
		  //quelle que soit la ligne
		  //On choisit donc la premi�re ligne
		  return this.data[0][col].getClass();
	  }
	  
	  //Retourne vrai si la cellule est &ditable: celle-ci sera donc editable
	  public boolean isCellEditable(int row, int col){
		  //On appelle la methode getValueAt qui retourne la valeur d'une cellule
		  //Et on effectue un traitement sp�cifique si c'est un JButton
		  if(getValueAt(0, col) instanceof JButton)
			 return false;
			  return true;
	  }
	}

