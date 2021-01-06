package es.studium.tema4.ejercicio4;

import java.awt.*;

public class ejercicio4 extends Frame
{
	private static final long serialVersionUID = 1L;
	//CREAMOS ETIQUETAS
	Label lblMotor = new Label("¿Tipo de motorización?");
	Label lblPuertas = new Label("¿Número de puertas?");
	Label lblPintura = new Label("¿Pintura Metalizada?");
	
	//DEFINIMOS GRUPOS
	CheckboxGroup chkGrupoMotor = new CheckboxGroup();
	CheckboxGroup chkGrupoPuertas = new CheckboxGroup();
	CheckboxGroup chkGrupoPintura = new CheckboxGroup();
		
	//Creamos los checkboxes indicando la etiqueta, si esta o no activo, y el grupo al que pertence
	//CHECKBOXES MOTORIZACION
	Checkbox chkGasolina = new Checkbox("Gasolina",false,chkGrupoMotor);
	Checkbox chkDiesel = new Checkbox("Opción dos",false,chkGrupoMotor);
	Checkbox chkHibrido = new Checkbox("Hibrido",false,chkGrupoMotor);
	Checkbox chkElectrico = new Checkbox("Eléctrico",false,chkGrupoMotor);
	Checkbox[] motor = {chkGasolina, chkDiesel, chkHibrido, chkElectrico};
		
	//CHECKBOXES PUERTAS
	Checkbox chk3P = new Checkbox("3 puertas",false,chkGrupoPuertas);
	Checkbox chk4P = new Checkbox("4 puertas",false,chkGrupoPuertas);
	Checkbox chk5P = new Checkbox("5 puertas",false,chkGrupoPuertas);
		
	//CHECKBOXES PINTURA
	Checkbox chkMsi = new Checkbox("si",false,chkGrupoPintura);
	Checkbox chkMno = new Checkbox("no",false,chkGrupoPintura);
	
	//CREAMOS BOTON
		Button btn = new Button("Calcular Presupuesto");
		
	public ejercicio4() {
		setLayout(new FlowLayout());
		setTitle("Vehículos");
		setSize(450,200);
		add(lblMotor);
		for (Checkbox checkbox : motor)
		{
			add(checkbox);
		}
		
		add(lblPuertas);
		add(chk3P);
		add(chk4P);
		add(chk5P);
		
		add(lblPintura);
		add(chkMsi);
		add(chkMno);
		add(btn);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ejercicio4();
	}

}
