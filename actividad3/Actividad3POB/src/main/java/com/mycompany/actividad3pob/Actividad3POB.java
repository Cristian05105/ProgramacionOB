/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad3pob;

/**
 *
 * @author cristianV
 */
import java.util.Scanner;

public class Actividad3POB {
    public class Producto{
        private String Descripcion;
        private String Codigo;
        private String Tipo;
        private Double Costo;
        private Double Impuesto;
        
        
        //Getters
        public String getDescripcion() { return Descripcion; }
        public String getCodigo() { return Codigo; }
        public String getTipo() { return Tipo; }
        public Double getCosto() { return Costo; }
        public Double getImpuesto() { return Impuesto; }
        
        //sett
        public void setDescripcion(String Descripcion) { this.Descripcion = Descripcion; }
        public void setCodigo(String Codigo) { this.Codigo = Codigo; }
        public void setTipo(String Tipo) { this.Tipo = Tipo; }
        public void setCosto(Double Costo) { this.Costo = Costo; }
        public void setImpuesto(Double Impuesto) { this.Impuesto = Impuesto; }
        
        //metodo para mostrar detalles
        public void muestraProducto(){
        System.out.println("Descripcion: " + Descripcion);
        System.out.println("Codigo: " + Codigo);
        System.out.println("Tipo: " + Tipo);
        System.out.println("Costo: " + Costo);
        System.out.println("Impuesto: " + Impuesto + "%");
    }
        //metodo para calcular venta 
        public double calcularPrecio(double utilidad) {
        double precioAntesImpuestos = Costo + (Costo * (utilidad / 100));
        double precioFinal = precioAntesImpuestos + (precioAntesImpuestos * (Impuesto / 100));
        return precioFinal;
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Actividad3POB.Producto producto1 = new Actividad3POB().new Producto();
        Actividad3POB.Producto producto2 = new Actividad3POB().new Producto();
        
        try {
            System.out.println("Ingrese los datos del primer producto:");
            System.out.println("Descripcion: ");
            producto1.setDescripcion(scanner.nextLine());
            System.out.print("Código: ");
            producto1.setCodigo(scanner.nextLine());
            System.out.print("Tipo: ");
            producto1.setTipo(scanner.nextLine());
            System.out.print("Costo: ");
            producto1.setCosto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Impuesto (%): ");
            producto1.setImpuesto(Double.parseDouble(scanner.nextLine()));
            
            System.out.println("Ingrese los datos del segundo producto:");
            System.out.println("Descripcion: ");
            producto2.setDescripcion(scanner.nextLine());
            System.out.print("Código: ");
            producto2.setCodigo(scanner.nextLine());
            System.out.print("Tipo: ");
            producto2.setTipo(scanner.nextLine());
            System.out.print("Costo: ");
            producto2.setCosto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Impuesto (%): ");
            producto2.setImpuesto(Double.parseDouble(scanner.nextLine()));
            
        } catch (NumberFormatException e) {
            System.out.println("Error en la entrada de datos. Asegúrese de ingresar valores numéricos para costo e impuesto.");
            return;
        }
        
        System.out.println("\nDatos del primer producto:");
        producto1.muestraProducto();
        System.out.println("\nDatos del segundo producto:");
        producto2.muestraProducto();
        
        System.out.print("\nIngrese el porcentaje de utilidad para calcular el precio de venta: ");
        double utilidad = Double.parseDouble(scanner.nextLine());
        
        String resultado = compararProductos(producto1, producto2, utilidad);
        System.out.println("\nEl producto con el mayor precio de venta es: " + resultado);
    }

    public static String compararProductos(Producto p1, Producto p2, double utilidad) {
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);
        
        if (precio1 > precio2) {
            return p1.getCodigo() + " - " + p1.getTipo();
        } else if (precio2 > precio1) {
            return p2.getCodigo() + " - " + p2.getTipo();
        } else {
            return "Ambos productos tienen el mismo precio.";
        }
    }
}
