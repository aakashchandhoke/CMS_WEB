package Default;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aakash
 */
public class Update extends JFrame
{
 
    private final JButton b1,b2,b3,b4,b5,b6,b7;
    GridLayout layout;
    public Update()
    {
       super("Update Delete Form");
       Container container=getContentPane();
       layout=new GridLayout(7,1,5,5);
       container.setLayout( layout );
       b1=new JButton("Update/Delete Address");
       container.add(b1);
       b2=new JButton("Update/Delete Phone No.");
       container.add(b2);
       b3=new JButton("Update/Delete E-mail Id");
       container.add(b3);
       b4=new JButton("Update/Delete Birthday");
       container.add(b4);
       b5=new JButton("Update/Delete Anniversary");
       container.add(b5);
       b6=new JButton("Update/Delete Reminder");
       container.add(b6);
       b7=new JButton("Back");
       container.add(b7);
       
       ButtonHandler handle=new ButtonHandler();
       b1.addActionListener(handle);
       b2.addActionListener(handle);
       b3.addActionListener(handle);
       b4.addActionListener(handle);
       b5.addActionListener(handle);
       b6.addActionListener(handle);
       b7.addActionListener(handle);
       setSize(300,400);
       setVisible( true );
    }
    
    //Inner class to handle buttons
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
           if((event.getActionCommand()).equals("Update/Delete Address"))
           {
               AddressUpdate ob=new AddressUpdate();
               ob.setVisible(true);
               setVisible(false);
           }
           else if((event.getActionCommand()).equals("Update/Delete Phone No."))
           {
               PhoneUpdate ob=new PhoneUpdate();
               ob.setVisible(true);
               setVisible(false);
           }
           else if((event.getActionCommand()).equals("Update/Delete E-mail Id"))
           {

               EmailUpdate ob=new EmailUpdate();
               ob.setVisible(true);
               setVisible(false);
           }
           else if((event.getActionCommand()).equals("Update/Delete Birthday"))
           {
               BirthdayUpdate ob=new BirthdayUpdate();
               ob.setVisible(true);
               setVisible(false);
           }
           else if((event.getActionCommand()).equals("Update/Delete Anniversary"))
           {
               AnniversaryUpdate ob=new AnniversaryUpdate();
               ob.setVisible(true);
               setVisible(false);
           }
           else if((event.getActionCommand()).equals("Update/Delete Reminder"))
           {
               ReminderUpdate ob=new ReminderUpdate();
               ob.setVisible(true);
               setVisible(false);
           }
           else if((event.getActionCommand()).equals("Back"))
           {
               MainForm ob=new MainForm();
               ob.setVisible(true);
               setVisible(false);
           }
        }
    }
    public static void main(String args[])
    {
        Update ob=new Update();
        ob.setVisible(true);
    }
}


