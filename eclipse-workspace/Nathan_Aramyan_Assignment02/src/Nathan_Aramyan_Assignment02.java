import javax.swing.JOptionPane;

public class Nathan_Aramyan_Assignment02 {
	
    public static void main(String[] args) {
        String firstName, lastName;
        char middleInitial;
        int age;
        double grossAnnualPay, taxRate, netAnnualPay;

        firstName = JOptionPane.showInputDialog("Enter your first name:");
        

        String middleInitialInput = JOptionPane.showInputDialog("Enter your middle initial:");
        middleInitial = middleInitialInput.charAt(0);
        
        lastName = JOptionPane.showInputDialog("Enter your last name:");
        
        String ageInput = JOptionPane.showInputDialog("Enter your age:");
        age = Integer.parseInt(ageInput);
        
        String grossAnnualPayInput = JOptionPane.showInputDialog("Enter your annual gross pay:");
        grossAnnualPay = Double.parseDouble(grossAnnualPayInput);
        
        String taxRateInput = JOptionPane.showInputDialog("Enter your tax rate (as a decimal):");
        taxRate = Double.parseDouble(taxRateInput);
        
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        String outputMessage = String.format(
            "Hello " +firstName + " " + middleInitial + ". " + lastName + ", \n" +
            "You are " + age + " years old now.\n" +
            "It is amazing that you made " + grossAnnualPay + " this year. With the tax\n" +
            "rate of " + taxRate + ", you can take home $" + netAnnualPay);

        JOptionPane.showMessageDialog(null, outputMessage);
    }
}
