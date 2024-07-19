import java.awt.*;
import java.awt.event.*;
 

class LenCon extends Frame{

	//DECLARATION
	Button b1;
	TextField t1 ;
	TextField t2 ;
	Choice c1 ;
    	Choice c2 ;
	
	//CONSTRUCTOR
	public LenCon(){
		this.setVisible(true);
		this.setTitle("Length Convertor");
        	this.setBounds(500, 250, 350, 280);
		this.setLayout(null);
		//WINDOW CLOSING
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		//CREATING CHOOICES	
		c1 = new Choice();
        	c1.setBounds( 50, 40,100, 30);
		c1.add("mile");
		c1.add("meter");
		c1.add("feet");
		c1.add("kilometer");
       	this.add(c1);

		//CREATING TEXTFIELD 1
		t1 = new TextField();
		t1.setBounds( 180, 40,100, 30);
            this.add(t1);

		//CREATING CHOOICE 2
		c2 = new Choice();
            c2.setBounds( 50, 100,100, 30);
		c2.add("mile");
		c2.add("meter");
		c2.add("feet");
		c2.add("kilometer");
            this.add(c2);
  		
		//CREATING TEXTFIELD 2
		t2 = new TextField();
       	t2.setBounds( 180, 100, 100, 30);
      	this.add(t2);

        	

        	//CREATING BUTTON
		b1 = new Button("Convert");
            b1.setBounds(120, 170, 100, 30);
            b1.addActionListener(new ConvertBtnListener());
		this.add(b1);
	}

	



class ConvertBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String Str = t1.getText();
            double km = Double.parseDouble(Str);
            double f = Double.parseDouble(Str);
            double mil = Double.parseDouble(Str);
            double m = Double.parseDouble(Str);
            if (c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("mile")){
                double mile = convertKmToMi(km);
                t2.setText("" + mile);
            }
            else if(c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("meter")){
                double meter = convertKmToMeter(km);
                t2.setText("" + meter);
            }
            else if(c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("feet")) {
                double feet = convertKmToFeet(km);
                t2.setText("" + feet);
            }
			else if(c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("kilometer"))
			{
                t2.setText("" + km);
            }
            else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("kilometer")) {
                double kilometer = convertMiToKm(mil);
                t2.setText("" + kilometer);
            }
			else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("mile"))
			{
                t2.setText("" + mil);
            }
            else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("meter")) {
                double meter = convertMiToMeter(mil);
                t2.setText("" + meter);
            }
            else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("feet")) {
                double feet = convertMiToFeet(mil);
                t2.setText("" + feet);
            }
            else if(c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("kilometer")) {
                double kilometer = convertFeetToKm(f);
                t2.setText("" + kilometer);
            }
			else if(c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("feet"))
			{
                t2.setText("" + f);
            }
            else if(c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("meter")) {
                double meter = convertFeetToMeter(f);
                t2.setText("" + meter);
            }
            else if (c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("mile")){
                double mile = convertFeetToMi(f);
                t2.setText("" + mile);
            }
            else if(c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("kilometer")) {
                double kilometer = convertMeterToKm(m);
                t2.setText("" + kilometer);
            }
            else if(c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("feet")) {
                double feet = convertMeterToFeet(m);
                t2.setText("" + feet);
            }
            else if (c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("mile")){
                double mile = convertMeterToMi(m);
                t2.setText("" + mile);
            }
			else if(c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("meter"))
			{
                t2.setText("" + m);
            }
			else;
				
        }
    }

    // CONVERSION OF KILOMETER
     static double convertKmToMi(double kilometer) {
        double mile = kilometer * 0.621;
        return mile;
    }
     static double convertKmToMeter(double kilometer) {
        double meter = kilometer * 1000;
        return meter;
    }
     static double convertKmToFeet(double kilometer) {
        double feet = kilometer * 3280.84;
        return feet;
    }

    // CONVERSION OF MILES
     static double convertMiToKm(double mile) {
        double kilometer = mile * 1.60934;
        return kilometer;
    }
     static double convertMiToMeter(double mile) {
        double meter = mile * 1609.34;
        return meter;
    }
    public static double convertMiToFeet(double mile) {
        double feet = mile * 5280;
        return feet;
    }

    // CONVERSION OF FOOT
    public static double convertFeetToKm(double feet) {
        double kilometer = feet * 0.0003048;
        return kilometer;
    }
    public static double convertFeetToMeter(double feet) {
        double meter = feet * 0.3048;
        return meter;
    }
    public static double convertFeetToMi(double feet) {
        double mile = feet * 0.000189394;
        return mile;
    }

    // CONVERSION OF METER
    public static double convertMeterToKm(double meter) {
        double kilometer = meter * 0.001;
        return kilometer;
    }
    public static double convertMeterToFeet(double meter) {
        double feet = meter * 3.28084;
        return feet;
    }
    public static double convertMeterToMi(double meter) {
        double mile = meter * 0.000621371;
        return mile;
    }

	public static void main(String ar[])
	{
		LenCon l = new LenCon();
	}
}