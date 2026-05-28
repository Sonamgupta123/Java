import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

class JTabbedPanel extends JFrame
{
	JTabbedPanel()
	{
	JTabbedPane jtp=new JTabbedPane();
	jtp.addTab("cities",new CitiesPanel());
	jtp.addTab("colors",new ColorsPanel());
	jtp.addTab("Flavors",new FlavorsPanel());
	add(jtp);
	}
}



class  JTabbedPanelDemo
{
public static void main(String args[])
{
	JTabbedPanel tpd=new JTabbedPanel();
	tpd.setVisible(true);
	tpd.setLayout(new FlowLayout());	
	tpd.setSize(400,300);
	tpd.setLocation(200,200);
}

}

class CitiesPanel extends JPanel implements ActionListener

{
	JLabel lbl;
	JButton b1,b2,b3,b4;
	public CitiesPanel()
	{
	b1=new JButton("New York");
	add(b1);
	b2=new JButton("London");
	add(b2);
	b3=new JButton("Hong Kong");
	add(b3);
	b4=new JButton("Bareli");
	add(b4);
	lbl = new JLabel(new ImageIcon());
	add(lbl);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) 
	{
		ImageIcon ny=new ImageIcon("us.png");
		ImageIcon london =new ImageIcon("britain.png");
		ImageIcon hongkong=new ImageIcon("china.jpg");
		ImageIcon india=new ImageIcon("india.jpg");
		String s = e.getActionCommand();
		if(s.equals("New York"))
		{
			lbl.setIcon(ny );
		}
		if(s.equals("London"))
		{
			lbl.setIcon(london );
		}
		if(s.equals("Hong Kong"))
		{
			lbl.setIcon(hongkong );
			
		}
		if(s.equals("Bareli"))
		{
			lbl.setIcon(india );
			
		}
		
	}
	
}

class ColorsPanel extends JPanel implements ItemListener {
    JRadioButton rb1, rb2, rb3;
    ButtonGroup bg;

    public ColorsPanel() {
        setLayout(new FlowLayout());

        rb1 = new JRadioButton("Red");
        rb2 = new JRadioButton("Green");
        rb3 = new JRadioButton("Blue");

        // ButtonGroup ensures only one radio button can be selected
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        add(rb1);
        add(rb2);
        add(rb3);

        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        JRadioButton selected = (JRadioButton) e.getItem();
        setBackground(Color.yellow);
        String s = selected.getText();
        System.out.println(s);
            if (s.equals("Red")) {
                setBackground(Color.red);
            } 
            if (s.equals("Green")) {
                setBackground(Color.green);
            }
            if (s.equals("Blue")) {
                setBackground(Color.blue);
            }
        }
    }




class FlavorsPanel extends JPanel implements ItemListener
{
	JLabel l1;
	JComboBox jcb;
	public FlavorsPanel()
	{
	jcb=new JComboBox();
	jcb.addItem("Vanilla");
  	jcb.addItem("Chocolate");
	jcb.addItem("strawberry");
	l1 = new JLabel(new ImageIcon());
	jcb.addItemListener(this);
	add(jcb);
	add(l1);
	}

	public void itemStateChanged(ItemEvent e) 
	{
		ImageIcon normal=new ImageIcon("vanila.jpg");
		ImageIcon roll=new ImageIcon("chocolate.jpg");
		ImageIcon selected=new ImageIcon("straw.jpeg");
		String s = (String)jcb.getSelectedItem();
		if(s.equals("Vanilla"))
		{
			l1.setIcon(normal );
		}
		if(s.equals("Chocolate"))
		{
			l1.setIcon(roll );
		}
		if(s.equals("strawberry"))
		{
			l1.setIcon(selected );
			
		}
		
	}
}

	
	