package Default;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainForm extends JFrame
{
    private final JButton b1,b2,b3,b4;
    GridLayout layout;    
    public MainForm()
    {
       super("Main Form");
       Container container=getContentPane();
       layout=new GridLayout(4,1,5,5);
       container.setLayout( layout );
       b1=new JButton("Add Contacts");
       container.add(b1);
       b2=new JButton("Delete/Update Contacts");
       container.add(b2);
       b3=new JButton("Search Contact");
       container.add(b3);
       b4=new JButton("Logout");
       container.add(b4);
       
       ButtonHandler handle=new ButtonHandler();
       b1.addActionListener(handle);
       b2.addActionListener(handle);
       b3.addActionListener(handle);
       b4.addActionListener(handle);
       setSize(400,300);
       setVisible( true );
    }
    public static void main(String[] args)
    {
        MainForm mainform=new MainForm();
        mainform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
    //Inner class to handle buttons
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if((event.getActionCommand()).equals("Add Contacts"))
            {
                AddForm ob =new AddForm();
                ob.setVisible(true);
                setVisible(false);
            }
            else if((event.getActionCommand()).equals("Delete/Update Contacts"))
            {
                Update ob =new Update();
                ob.setVisible(true);
                setVisible(false);
            }
            else if((event.getActionCommand()).equals("Search Contact"))
            {
                Search ob=new Search();
                ob.setVisible(true);
                setVisible(false);
            }
            else if((event.getActionCommand()).equals("Logout"))
           {
               Login ob =new Login();
               ob.setVisible(true);
               setVisible(false);
               
           }
        }
    }
}
