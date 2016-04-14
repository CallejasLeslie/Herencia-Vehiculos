/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_vehiculos;

/**
 *
 * @author Leslie Callejas
 */
public class Herencia_vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        System.out.println("Con mi vehiculo podemos " + miVehiculo.viajar());
        System.out.println("********************************");
        Acuatico miAcuatico = new Acuatico();
        System.out.println("Con mi vehiculo acuatico podemos " + miAcuatico.viajar());
        System.out.println("El vehiculo acuatico nos permite " + miAcuatico.navegar());
        System.out.println("********************************");
        Barcos miBarco = new Barcos();
        System.out.println("Con mi barco podemos " + miBarco.viajar());
        System.out.println("Barco nos permite " + miBarco.navegar());
        System.out.println("Barco nos permite " + miBarco.bajarAncla());
        System.out.println("********************************");
        Veleros miVelero = new Veleros();
        System.out.println("Con mi velero podemos " + miVelero.viajar());
        System.out.println("Velero nos permite " + miAcuatico.navegar());
        System.out.println("Velero nos permite " + miVelero.despeglarVela());
        System.out.println("********************************");
        Aereo miAereo = new Aereo();
        System.out.println("Con mi vehiculo aereo podemos " + miAereo.viajar());
        System.out.println("El vehiculo aereo nos permite " + miAereo.volar());
        System.out.println("********************************");
        Helicoptero miHelicoptero = new Helicoptero();
        System.out.println("Con mi helicoptero podemos " + miHelicoptero.viajar());
        System.out.println("Helicoptero nos permite " + miHelicoptero.volar());
        System.out.println("Helicoptero nos permite " + miHelicoptero.bajarescalera());
        System.out.println("********************************");
        Avion miAvion = new Avion();
        System.out.println("Con mi avion podemos " + miAvion.viajar());
        System.out.println("Avion nos permite " + miAvion.volar());
        System.out.println("Avion nos permite" + miAvion.bajarMascarillas());
    }
}
