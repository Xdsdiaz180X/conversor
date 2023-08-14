import javax.swing.JOptionPane;

public class ConvertirMonedas {
    

    public void convertirPesosADolares(double valor){
        double monedaDolar = valor / 4000.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaDolar+ "Dolares");
    }

    public void convertirPesosAEuros(double valor){
        double monedaEuro = valor / 4360.16;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaEuro+ "Euros");
    }

    public void convertirPesosALibras(double valor){
        double monedaLibra = valor / 5064.37;
        monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaLibra+ "Libras");
    }

    public void convertirPesosAYen(double valor){
        double monedaYen = valor / 27.53;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaYen+ "Yens");
    }

    public void convertirPesosAWon(double valor){
        double monedaWon = valor / 2.99;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaWon+ "Wones");
    }

    
}
