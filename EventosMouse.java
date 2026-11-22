package eventos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

//importar paquetes adicionales 

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosMouse extends JFrame {

    public EventosMouse() {

        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25, 10, 350, 30);

        JLabel lblInstruccion = new JLabel("Ingresa tu nombre:");
        lblInstruccion.setBounds(25, 165, 200, 30);

        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);

        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30); //setBounds PARA DEFINIR PARAMETROS DE TAMAÑO Y ALTURA

        // Anadir un listener pero de tipo mouse
        // Creamos la clase anonima para implementar la interfaz MouseListener
        MouseListener listener = new MouseListener() {

            //implementar todos los metodos abstractos de la interfaz

            //@Override
            /*public void mouseClicked(MouseEvent e) {
            
            //Primera ejecucion 
                lblSaludo.setText("mouseClicked");
            }
        */
            @Override
            public void mousePressed(MouseEvent e) {
                //Segunda ejecucion

                lblSaludo.setText("mousePressed");
            }
            @Override 
            public void mouseReleased(MouseEvent e) {
                lblSaludo.setText("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblSaludo.setText("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSaludo.setText("mouseExited");
            }
//Septima ejecucion
//Por ejemplo para el evento mouseClicked
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getSource() == campoSaludo) {
                    lblSaludo.setText("MouseClicked dentro de campo saludo");
                }

                if (e.getSource() == boton) {
                    lblSaludo.setText("MouseClicked dentro de boton");
                }
            }
        };

        // Agregar el listener al boton
        boton.addMouseListener(listener);

        // Agregar el listener al campo de texto
        campoSaludo.addMouseListener(listener);

        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        EventosMouse objEventoMouse = new EventosMouse();
    }
}