import javax.swing.JOptionPane;

public class function {
    

    ConvertirMonedas monedas = new ConvertirMonedas();

    ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();


    public void ConvertirMonedas(double Minput){
        String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De pesos a Dolar", "De pesos a Euro", "De pesos a libras", "De pesos a Yen", "De pesos a Won"}, "Seleccion")).toString();

        switch(opcion){

            case "De pesos a Dolar":
                monedas.convertirPesosADolares(Minput);
                break;
            case "De pesos a Euro":
                monedas.convertirPesosAEuros(Minput);
                break;
            case "De pesos a libras":
                monedas.convertirPesosALibras(Minput);
                break;
            case "De pesos a Yen":
                monedas.convertirPesosAYen(Minput);
                break;
            case "De pesos a Won":
                monedas.convertirPesosAWon(Minput);
                break;  
                case "De Dólar a Pesos":
                pesos.ConvertirDolaresAPesos(Minput);
                break;
            case "De Euro a Pesos":
                pesos.ConvertirEurosAPesos(Minput);
                break;
            case "De Libras a Pesos":
                pesos.ConvertirLibrasAPesos(Minput);
                break;
            case "De Yen a Pesos":
                pesos.ConvertirYenAPesos(Minput);
                break;
            case "De Won Coreano a Pesos":
                pesos.ConvertirWonAPesos(Minput);
                break;              
        }
    }
}
