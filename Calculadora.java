import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.lang.Math.*;

public class Calculadora extends Frame{

	private float numeroUno = 0, numeroDos = 0;
	double numerotres = 0;
	private String operador = "";

	private Button botom0, botom1, botom2, botom3, botom4, botom5, botom6, botom7, botom8, botom9;
	private Button suma, resta, multiplicacion, divicion, mod, sqrt;
	private Button igual, limpiar, punto, cambioSigno, borrar;
	private TextField Barra;

	public Calculadora(){
		init();

	}

	private void init(){

		setSize(410,400);
		setLayout(null);
		setResizable(false);

		setFont(new Font("Arial", Font.PLAIN, 18));
        setBackground(Color.lightGray);

		setTitle("Calculadora");

		Barra = new TextField(15);
		Barra.setBounds(25,30, 350, 70);
		add(Barra);

		borrar = new Button("<x|");
		borrar.setBounds(330, 130, 80,60);
		add(borrar);
		borrar.addActionListener((ActionEvent e) ->{

			String aux;

			aux = Barra.getText();

			if (aux.length() > 0){
				aux = aux.substring(0, aux.length() -1);
				Barra.setText(aux);
			}

		});

		sqrt = new Button("sqrt");
		sqrt.setBounds(240, 130, 90, 60);
		add(sqrt);
		sqrt.addActionListener((ActionEvent e) -> {
			this.numerotres = Double.parseDouble(this.Barra.getText());
			String total = Double.toString(Math.sqrt(numerotres));
			Barra.setText(total);
		});

		mod = new Button("%");
		mod.setBounds(150,130, 90, 60);
		add(mod);
		mod.addActionListener((ActionEvent e) -> {
			this.numeroUno = Float.parseFloat(this.Barra.getText());
			this.operador = "%";
		  	Barra.setText("");
		});

		limpiar = new Button("C");
		limpiar.setBounds(10, 130, 140, 60);
		add(limpiar);
		limpiar.addActionListener((ActionEvent e) -> {
		  	Barra.setText("  ");
		  	operador = "";
			numeroUno = 0;
			numeroDos = 0;
			numerotres = 0;
		});

		botom7 = new Button("7");
		botom7.setBounds(10, 190, 70, 50);
		add(botom7);
		botom7.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "7");
		});
		
		botom4 = new Button("4");
		botom4.setBounds(10, 240, 70, 50);
		add(botom4);
		botom4.addActionListener((ActionEvent e) -> {
		 	Barra.setText(this.Barra.getText() + "4");
		});

		botom1 = new Button("1");
		botom1.setBounds(10, 290, 70, 50);
		add(botom1);
		botom1.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "1");
		});

		cambioSigno = new Button("+/-");
		cambioSigno.setBounds(10, 340, 70, 50);
		add(cambioSigno);
		cambioSigno.addActionListener((ActionEvent e) -> {
			this.numeroUno = Float.parseFloat(this.Barra.getText());
			this.numeroUno *= -1;
			this.Barra.setText(Float.toString(numeroUno));
			operador = "";
			numeroUno = 0;
			numeroDos = 0;
		});

		botom8 = new Button("8");
		botom8.setBounds(80, 190, 70, 50);
		add(botom8);
		botom8.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "8");
		});
		
		botom5 = new Button("5");
		botom5.setBounds(80, 240, 70, 50);
		add(botom5);
		botom5.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "5");
		});

		botom2 = new Button("2");
		botom2.setBounds(80, 290, 70, 50);
		add(botom2);
		botom2.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "2");
		});

		botom0 = new Button("0");
		botom0.setBounds(80, 340, 70, 50);
		add(botom0);
		botom0.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "0");
		});

		botom9 = new Button("9");
		botom9.setBounds(150, 190, 70, 50);
		add(botom9);
		botom9.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "9");
		});
		
		botom6 = new Button("6");
		botom6.setBounds(150, 240, 70, 50);
		add(botom6);
		botom6.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "6");
		});

		botom3 = new Button("3");
		botom3.setBounds(150, 290, 70, 50);
		add(botom3);
		botom3.addActionListener((ActionEvent e) -> {
		  	Barra.setText(this.Barra.getText() + "3");
		});

		punto = new Button(".");
		punto.setBounds(150, 340, 70, 50);
		add(punto);
		punto.addActionListener((ActionEvent e) ->{
			
			if (!(this.Barra.getText().contains("."))){
				Barra.setText(this.Barra.getText() + ".");
			}

		});

		suma = new Button("+");
		suma.setBounds(225, 200, 90, 60);
		add(suma);
		suma.addActionListener((ActionEvent e) -> {
			this.numeroUno = Float.parseFloat(this.Barra.getText());
			this.operador = "+";
		  	Barra.setText("");
		});

		resta = new Button("-");
		resta.setBounds(225, 260, 90, 60);
		add(resta);
		resta.addActionListener((ActionEvent e) -> {
		  	this.numeroUno = Float.parseFloat(this.Barra.getText());
			this.operador = "-";
		  	Barra.setText("");
		});
		
		multiplicacion = new Button("*");
		multiplicacion.setBounds(320, 200, 90, 60);
		add(multiplicacion);
		multiplicacion.addActionListener((ActionEvent e) -> {
		  	this.numeroUno = Float.parseFloat(this.Barra.getText());
			this.operador = "*";
		  	Barra.setText("");
		});

		divicion = new Button("/");
		divicion.setBounds(320, 260, 90, 60);
		add(divicion);
		divicion.addActionListener((ActionEvent e) -> {
		  	this.numeroUno = Float.parseFloat(this.Barra.getText());
			this.operador = "/";
		  	Barra.setText("");
		});

		igual = new Button("=");
		igual.setBounds(225, 320, 185, 70);
		add(igual);
		igual.addActionListener((ActionEvent e) -> {
			
			float resultado;

			this.numeroDos = Float.parseFloat(this.Barra.getText());

			switch(operador){

				case "+":
					resultado = numeroUno + numeroDos;
					this.Barra.setText(Float.toString(resultado));
					operador = "";
					numeroUno = 0;
					numeroDos = 0;
					numerotres = 0;
				break;

				case "-":
					resultado = numeroUno - numeroDos;
					this.Barra.setText(Float.toString(resultado));
					operador = "";
					numeroUno = 0;
					numeroDos = 0;
					numerotres = 0;
				break;

				case "*":
					resultado = numeroUno * numeroDos;
					this.Barra.setText(Float.toString(resultado));
					operador = "";
					numeroUno = 0;
					numeroDos = 0;
					numerotres = 0;
				break;

				case "/":
					resultado = numeroUno / numeroDos;
					this.Barra.setText(Float.toString(resultado));
					operador = "";
					numeroUno = 0;
					numeroDos = 0;
					numerotres = 0;
				break;

				case "%":
					resultado = numeroUno % numeroDos;
					this.Barra.setText(Float.toString(resultado));
					operador = "";
					numeroUno = 0;
					numeroDos = 0;
					numerotres = 0;
				break;
			}
		});

		addWindowListener(new Cierre());
		setVisible(true);
	}

	class Cierre extends WindowAdapter{

        public void windowClosing (WindowEvent e){

            System.exit(0);
        }
    }
}