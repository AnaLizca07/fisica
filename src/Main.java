import javax.swing.JOptionPane;

import static java.lang.Float.parseFloat;

public class Main {
    public static void main(String[] args) {
        Cálculos cálculos = new Cálculos();
        cálculos.q1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la primera carga en Coulombs"));
        cálculos.q2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la segunda carga en Coulombs"));
        cálculos.q3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la tercera carga en Coulombs"));
        cálculos.q4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la cuarta carga en Coulombs"));
        cálculos.distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la longitud de los lados del cuadrado"));
        int carga = Integer.parseInt(JOptionPane.showInputDialog("Con respecto a que carga desea saber la fuerza resultante? \n1.Q1\n2.Q2\n3.Q3\n4.Q4"));
        switch (carga){
            case 1 ->{
                cálculos.qp = cálculos.q1;
                cálculos.fuerzas();
                JOptionPane.showMessageDialog(null,"fuerza  1 "+cálculos.f1);
                JOptionPane.showMessageDialog(null,"fuerza 2 "+cálculos.f2);
                JOptionPane.showMessageDialog(null,"fuerza 3 "+cálculos.f3);
                JOptionPane.showMessageDialog(null,"fuerza 4 "+cálculos.f4);
                cálculos.respectQ1();JOptionPane.showMessageDialog(null,"Los componentes del vector fuerza resultante son:\n("+cálculos.frx+","+cálculos.fry+")");
            }
            case 2 ->{
                cálculos.qp = cálculos.q2;
                cálculos.fuerzas();
                cálculos.respectQ2();
                cálculos.respectQ1();JOptionPane.showMessageDialog(null,"Los componentes del vector fuerza resultante son:\n("+cálculos.frx+","+cálculos.fry+")");
            }
            case 3 ->{
                cálculos.qp = cálculos.q3;
                cálculos.fuerzas();
                cálculos.respectQ3();
                cálculos.respectQ1();JOptionPane.showMessageDialog(null,"Los componentes del vector fuerza resultante son:\n("+cálculos.frx+","+cálculos.fry+")");
            }
            case 4 ->{
                cálculos.qp = cálculos.q4;
                cálculos.fuerzas();
                cálculos.respectQ4();
                cálculos.respectQ1();JOptionPane.showMessageDialog(null,"Los componentes del vector fuerza resultante son:\n("+cálculos.frx+","+cálculos.fry+")");
            }
        }

    }
}
