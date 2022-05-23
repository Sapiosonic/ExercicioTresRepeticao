package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	double v1=0, v2=0, res=0;
	String ope=" ";
	String op="";
		while(!(op.equals("n"))){
			v1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1: "));
			ope = JOptionPane.showInputDialog(" + - * / ");
			v2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2: "));
			if(ope.equals("+")){
				res=v1+v2;
			}else if(ope.equals("-")){
				res=v1-v2;
			}else if (ope.equals("*")){
				res=v1*v2;
			}else if (ope.equals("/")){
				res=v1/v2;
			}
			JOptionPane.showMessageDialog(null,"O resultado é: "+res);
			op = JOptionPane.showInputDialog("Deseja continuar? S/N").toLowerCase();
			if (op.equals("n")){
				JOptionPane.showMessageDialog(null,"Obrigado!");
			}
		}

	}
}

