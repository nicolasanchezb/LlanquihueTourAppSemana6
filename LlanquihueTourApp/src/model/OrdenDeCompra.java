package model;

import java.util.ArrayList;

public class OrdenDeCompra {

    private int numero;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public OrdenDeCompra(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {

        double total = 0;

        for (Producto p : productos) {
            total += p.getPrecio();
        }

        return total;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {

        return "Orden N° " + numero +
                "\nCliente: " + cliente.getNombre() +
                "\nProductos: " + productos +
                "\nTotal: $" + calcularTotal();

    }

}