package dispersion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author jefer
 */
public class Dispersion {

    private int nPrimo, primoDH, primoPC;
    private int pos;
    private int[] cabezaListas, valores, cabezaLineal;
    private int[][] matrizLin, matrizDH;
    private String[] letras, linealCabeza;

    private int[][] matriz;
    private String[][] matrizSalida, matrizCuad;
    ArrayList[] cabeza;

    public Dispersion(int nPrimo, int[] valores, String[] letras, int primoDH, int primoPC) {
        this.valores = valores;
        this.nPrimo = nPrimo;
        this.letras = letras;
        this.primoDH = primoDH;
        this.primoPC = primoPC;

        cabezaListas = new int[nPrimo];
        cabezaLineal = new int[nPrimo];
        for (int i = 0; i < nPrimo; i++) {
            cabezaListas[i] = -1;
            cabezaLineal[i] = -1;
        }
    }
//Llena cabezaListas

    public void llenar() {
        for (int i = 0; i < valores.length; i++) {
            if (cabezaListas[valores[i] % nPrimo] == -1) {
                cabezaListas[valores[i] % nPrimo] = i + 1;
            }
            if (cabezaLineal[valores[i] % nPrimo] == -1) {
                cabezaLineal[valores[i] % nPrimo] = i + 1;
            }
        }
        for (int i = 0; i < cabezaListas.length; i++) {
            System.out.print(cabezaListas[i] + " ");
        }
        System.out.println("");
        llenarLineal();
        llenarDobleHash();
        llenarCuadratica();
    }

    public void guardar() {
        cabeza = new ArrayList[cabezaListas.length];
        for (int i = 0; i < cabeza.length; i++) {
            cabeza[i] = new ArrayList();
        }
        for (int i = 0; i < valores.length; i++) {
            cabeza[valores[i] % nPrimo].add(valores[i]);
        }
    }

    public String[][] crearMatriz() {
        matrizSalida = new String[4][valores.length + 1];
        for (int i = 0; i < matrizSalida[0].length; i++) {
            matrizSalida[0][i] = (i + 1) + "";
            if (i + 1 > valores.length) {
                matrizSalida[1][i] = 0 + "";
                matrizSalida[2][i] = "";
            } else {
                matrizSalida[1][i] = valores[i] + "";
                matrizSalida[2][i] = letras[i];
            }
        }
        for (int i = 0; i < matriz[0].length; i++) {
            matrizSalida[3][i] = matriz[1][i] + "";
        }
        for (int i = 0; i < matrizSalida[0].length; i++) {
            if (matrizSalida[3][i] == null) {
                //matrizSalida[3][i] = (i + 2) + "";
            }
        }
        return matrizSalida;
    }

    public void llenarMatriz() {
        matriz = new int[2][valores.length + 1];
        for (int i = 0; i < valores.length + 1; i++) {
            matriz[1][i] = i + 2;
        }
        for (int i = 0; i < valores.length; i++) {
            matriz[0][i] = valores[i];
            for (int j = 0; j < cabeza[valores[i] % nPrimo].size(); j++) {
                if (valores[i] == (Integer) cabeza[valores[i] % nPrimo].get(j)) {
                    if (j + 1 >= cabeza[valores[i] % nPrimo].size()) {
                        matriz[1][i] = 0;
                    } else {
                        matriz[1][i] = buscar((Integer) cabeza[valores[i] % nPrimo].get(j + 1)) + 1;
                    }
                }
            }
        }
    }

    public int buscar(int valor) {
        int pos = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                pos = i;
            }
        }
        return pos;
    }

    int buscarC(int a, JTable tListaCabezas) {
        int pos = 0;
        String c = "";
        for (int j = 0; j < tListaCabezas.getRowCount(); j++) {
            for (int i = 0; i < hacerSplit(String.valueOf(tListaCabezas.getValueAt(j, 2))).length; i++) {
                c = hacerSplit(String.valueOf(tListaCabezas.getValueAt(j, 2)))[i];
                if (c.equals(String.valueOf(a))) {
                    pos = j;
                    break;
                }
            }
        }
        return pos;
    }

    public void borrar(int llave) {
        System.out.println("llave: " + llave);
        int pos_temp = pos;
        System.out.println("pos = " + pos);
        int posicion = 0;
        boolean encontro = false;
        for (int i = 0; i < matrizSalida[0].length; i++) {
            if (llave == Integer.parseInt(matrizSalida[1][i])) {
                System.out.println(matrizSalida[1][i]);
                posicion = i;
                encontro = true;
                System.out.println("Llave encontrada ");
            }
        }
        for (int i = 0; i < matrizDH[0].length; i++) {
            if (llave == matrizDH[0][i]) {
                matrizDH[0][i] = 0;
            }
        }
        for (int i = 0; i < matrizCuad[0].length; i++) {
            if (llave == Integer.parseInt(matrizCuad[0][i])) {
                matrizCuad[1][i] = "";
                matrizCuad[0][i] = "0";
            }
        }

        if (encontro) {
            int padre = Integer.parseInt(matrizSalida[3][posicion]);
            if (padre == 0) {
                for (int i = 0; i < matrizSalida[0].length; i++) {
                    if (matrizSalida[1][i].equals("0")) {
                        matrizSalida[3][posicion] = matrizSalida[0][i];
                        break;
                    }
                }
                matrizSalida[1][posicion] = 0 + "";
                matrizSalida[2][posicion] = "";
            } else {
                for (int i = 0; i < matrizSalida[0].length; i++) {
                    if (posicion + 1 == Integer.parseInt(matrizSalida[3][i])) {
                        matrizSalida[3][i] = String.valueOf(padre);
                    }
                }
                for (int i = 0; i < matrizSalida[0].length; i++) {
                    if (matrizSalida[1][i].equals("0")) {
                        matrizSalida[3][posicion] = matrizSalida[0][i];
                        break;
                    }
                }
                matrizSalida[1][posicion] = 0 + "";
                matrizSalida[2][posicion] = "";
            }
            pos = posicion;
            for (int i = 0; i < cabeza[llave % nPrimo].size(); i++) {
                if (cabeza[llave % nPrimo].get(i).equals(llave)) {
                    posicion = i;
                }
            }
            cabeza[llave % nPrimo].remove(posicion);
        } else {
            if (pos == 0) {
                this.pos = matrizSalida[0].length - 1;
            }
            JOptionPane.showMessageDialog(null, "El elemento no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println("pos" + pos);
        }
    }

    public String[][] matrizCabeza() {
        for (int i = 0; i < cabezaListas.length; i++) {
            if (cabeza[i].isEmpty()) {
                cabezaListas[i] = -1;
            }
        }
        int red = 0;
        for (int i = 0; i < cabezaListas.length; i++) {
            if (cabezaListas[i] == -1) {
                red += 1;
            }
        }
        String[][] matrizCab = new String[cabezaListas.length - red][3];
        red = 0;
        for (int i = 0; i < cabezaListas.length; i++) {
            if (cabezaListas[i] != -1) {
                matrizCab[red][0] = i + ": ";
                matrizCab[red][1] = cabezaListas[i] + ": ";
                matrizCab[red][2] = "";
                for (int j = 0; j < cabeza[i].size(); j++) {
                    matrizCab[red][2] += cabeza[i].get(j) + " -> ";
                }
                matrizCab[red][2] = matrizCab[red][2].substring(0, matrizCab[red][2].length() - 4);
                red += 1;
            }
        }
        return matrizCab;
    }

    /**
     * @return the matrizSalida
     */
    public String[][] getMatriz() {
        return matrizSalida;
    }

    public int getPosicion() {
        return pos;
    }

    public void imprimirCabezas() {
        for (int i = 0; i < matrizCabeza().length; i++) {
            for (int j = 0; j < matrizCabeza()[0].length; j++) {
                System.out.println(matrizCabeza()[i][j]);
            }
        }
    }

    private String[] hacerSplit(String cadena) {
        String[] partes = cadena.split(" -> ");
        return partes;
    }

    public void llenarLineal() {
        matrizLin = new int[2][nPrimo];
        linealCabeza = new String[nPrimo + 1];
        linealCabeza[0] = "Cabezas";
        int j = -1, puntero = nPrimo - 1;
        for (int i = 0; i < nPrimo; i++) {
            matrizLin[0][i] = -1;
            matrizLin[1][i] = 0;
            linealCabeza[i + 1] = "-1";
        }

        boolean encontrado;
        for (int i = 0; i < valores.length; i++) {
            encontrado = false;
            if (matrizLin[1][valores[i] % nPrimo] == 0) {
                encontrado = true;
                matrizLin[1][valores[i] % nPrimo] = valores[i];
            } else {
                puntero = nPrimo - 1;
                j = valores[i] % nPrimo;
                while (matrizLin[0][j] != -1) {
                    j = matrizLin[0][j];
                    puntero = j;
                    System.out.println("a");
                }
            }
            while (!encontrado) {
                if (matrizLin[1][puntero] == 0) {
                    matrizLin[1][puntero] = valores[i];
                    encontrado = true;
                    if (valores[i] % nPrimo == matrizLin[1][j] % nPrimo) {
                        matrizLin[0][j] = puntero;
                    }
                }
                puntero--;
            }
            if (linealCabeza[valores[i] % nPrimo + 1].equals("-1")) {
                linealCabeza[valores[i] % nPrimo + 1] = String.valueOf(buscarNumero(matrizLin[1], valores[i]));
            }
        }
        System.out.println("hola");
        for (int i = 0; i < 2; i++) {
            String out = "";
            for (int k = 0; k < nPrimo; k++) {
                out += matrizLin[i][k];
                out += " ";
            }
            System.out.println(out);
        }
    }

    public void llenarDobleHash() {
        matrizDH = new int[1][primoDH];
        if (primoDH <= valores.length) {
            return;
        }
        boolean yaEx;
        for (int i = 0; i < primoDH; i++) {
            matrizDH[0][i] = 0;
        }
        for (int i = 0; i < valores.length; i++) {
            yaEx = false;
            int h = valores[i] % primoDH;
            int fijo = 1 + valores[i] % (primoDH - 2);
            while (matrizDH[0][h] != 0) {
                if (matrizDH[0][h] != valores[i]) {
                    h = (h + fijo) % primoDH;
                } else {
                    yaEx = true;
                    break;
                }
            }
            if (!yaEx) {
                matrizDH[0][h] = valores[i];
            }
        }
        String out = "";
        for (int i = 0; i < primoDH; i++) {
            out += matrizDH[0][i];
            out += " ";
        }
        System.out.println(out);
    }

    public void llenarCuadratica() {
        matrizCuad = new String[2][primoPC];
        if (primoPC <= valores.length) {
            return;
        }
        for (int i = 0; i < primoPC; i++) {
            matrizCuad[0][i] = "0";
            matrizCuad[1][i] = "";
        }
        for (int i = 0; i < valores.length; i++) {
            if ("0".equals(matrizCuad[0][valores[i] % primoPC])) {
                matrizCuad[0][valores[i] % primoPC] = String.valueOf(valores[i]);
                matrizCuad[1][valores[i] % primoPC] = letras[i];
            } else {
                int prueba = (primoPC + 1) / 2;
                int h = valores[i] % primoPC;
                int j = 1;
                int k = h;
                while (!matrizCuad[0][h].equals("0") && j < prueba) {
                    h = (k + j * j) % primoPC;
                    j++;
                }
                if (j == prueba) {
                    System.out.println("Es necesario un reHash");
                    matrizCuad = new String[2][primoPC];
                    return;
                } else {
                    matrizCuad[0][h] = String.valueOf(valores[i]);
                    matrizCuad[1][h] = letras[i];
                }
            }
        }
        String out = "PruebaC\n";
        String out2 = "";
        for (int i = 0; i < primoPC; i++) {
            out += matrizCuad[0][i];
            out += " ";
            out2 += matrizCuad[1][i];
            out2 += " ";
        }
        System.out.println(out);
        System.out.println(out2);
    }

    public String[][] matrizLineal() {
        String[][] retorno = new String[2][matrizLin[0].length + 1];
        retorno[0][0] = "Apuntadores";
        retorno[1][0] = "Llaves";
        for (int i = 1; i < retorno[0].length; i++) {
            retorno[0][i] = String.valueOf(matrizLin[0][i - 1]);
            retorno[1][i] = String.valueOf(matrizLin[1][i - 1]);
        }
        return retorno;
    }

    public String[][] matrizDH() {
        String[][] retorno = new String[1][matrizDH[0].length];
        for (int i = 0; i < retorno[0].length; i++) {
            retorno[0][i] = String.valueOf(matrizDH[0][i]);
        }
        return retorno;
    }

    public String[][] matrizPC() {
        return matrizCuad;
    }

    public String[][] cabezasLineal() {
        String[][] retorno = new String[1][linealCabeza.length];
        retorno[0] = linealCabeza;
        return retorno;
    }

    private int buscarNumero(int[] matriz, int num) {
        int busqueda = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == num) {
                return i;
            }
        }
        return 0;
    }

    public void textoLineal(JTextArea textArea) {
        textArea.setText("");
        for (int i = 0; i < nPrimo; i++) {
            textArea.setText(textArea.getText() + String.valueOf(i) + ": ");
            for (int j = 0; j < valores.length; j++) {
                if (valores[j] % nPrimo == i) {
                    textArea.setText(textArea.getText() + String.valueOf(valores[j]) + "\t");
                }
            }
            textArea.setText(textArea.getText() + "\n");
        }
    }
}
