import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

// declaring 
public class DeliveryService2 extends JFrame implements ActionListener  {// creating the class name as DeliverService1

private JLabel fullNameLabel, genderLabel1, genderLabel2, genderlabel3;
private JButton go, reset;
private ButtonGroup genderGroup ;
private JRadioButton maleButton, femaleButton;
//private JLabel LastNameLabel1;
private JTextField fullNameTextField;
private JPanel northPanel,westPanel, westPanel2, southPanel, centerPanel, westPanel3;
private JCheckBox ensurance;


// initilization of the data.
public  DeliveryService2() ////creating the constructor similar name to class name.
{
  fullNameLabel = new JLabel("Enter Weight in Pound:");//  // creating a new object for FullNameLabel
  fullNameTextField = new JTextField (10);
  northPanel = new JPanel();  
  northPanel.add(fullNameLabel);
  northPanel.add(fullNameTextField);
  add(northPanel, BorderLayout.NORTH);
 
  genderLabel1=new JLabel("Types Of Delievery:");
  genderLabel2 = new JLabel(" "); // 
   genderlabel3 = new JLabel(" ");// barkhari add gareko
  //genderLabel4 = new JLabel(" ");
  maleButton = new JRadioButton (" Local ");
  femaleButton =new JRadioButton(" Long Distance ");
  genderGroup = new ButtonGroup();
  genderGroup.add(maleButton);
  genderGroup.add(femaleButton);
  westPanel = new JPanel();
  westPanel.setLayout( new GridLayout(2,3)); // two rows three coloumn. 
  westPanel.add(genderLabel1);
  westPanel.add(maleButton);
  westPanel.add(femaleButton);
  
ensurance = new JCheckBox ("Insurance");
westPanel2 = new JPanel();
westPanel.add(ensurance);
westPanel.add(genderLabel2);// to maintain the gape between the westPanel
westPanel.add(genderlabel3);// to maintain the gape between the westPanel
westPanel2.add(westPanel); // add
add(westPanel2 , BorderLayout.CENTER);

go = new JButton("Go");
go.addActionListener(this);

reset = new JButton("Reset");
reset.addActionListener(this);

southPanel = new JPanel();
southPanel.add(go);
southPanel.add(reset);
add(southPanel , BorderLayout.SOUTH);
   
setVisible(true);// making our GUI visible
setSize(400, 400); // setting the length and breadth of GUI
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent event) 

{
  
  if(event.getSource()==go) {
      String fullName=fullNameTextField.getText();
     // String ensurance=
      double b2 = Double.parseDouble(fullName); // convert String into Integer     
    
      String insurance = "No";
      if(ensurance.isSelected()){
      insurance ="Yes"; //if checked
      }
        
    String  genderGroup = " " ;  // declared part in the top
    if (maleButton.isSelected()){
      genderGroup = "Local";
      }
     
   else if (femaleButton.isSelected()){  // declared part in the private on top
      genderGroup ="Long Distance";
   }
     
  String output = "Delivery Information " +
            "\nWeight: "+   fullName +
         "\nType Of delivery :"+genderGroup+
           "\nInsurance: " + insurance ;
       
   
  JOptionPane.showMessageDialog(null,output);

}
 else if(event.getSource()== reset) {
 fullNameTextField.setText(""); //reset Jtextfield to blank
  //genderGroup.setSelected(false);
 ensurance.setSelected(false);
 genderGroup.clearSelection();//uncheck types of delivery
}
}
 
public static void main (String[]args)// creating the method
{
DeliveryService2 app = new DeliveryService2 ();// execute DeliveryService1Example
}// end of main method.
} //end of the class GuiExample.

