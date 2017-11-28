/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_2;

/**
 *
 * @author lk
 */
public class Normalverteilung {

    double function;
    double tmp;

    public double function(double u, double o, double x) {
        tmp = Math.exp(-0.5 * (Math.pow(((x - u) / o), 2)));
        function = (tmp / (o * (Math.sqrt(2 * Math.PI))));
        return function;
    }
}
