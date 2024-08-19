import edu.uca.Productos.Producto;
import edu.uca.Tienda;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void productToStringTest(){
        Producto producto = new Producto(1, "producto de prueba", 200);
        System.out.println(producto);
    }

    @Test
    public void tiendaAgregarProductoTest(){
        Tienda tienda = new Tienda();
        Producto producto = new Producto(1, "producto de prueba", 200);
        tienda.agregarProducto(producto);
        Assert.assertEquals(tienda.getSize(), 1);
    }

    @Test
    public void mostrarInventarioTest(){
        Tienda tienda = new Tienda();
        Producto producto = new Producto(1, "producto de prueba", 200);
        tienda.agregarProducto(producto);
        tienda.mostrarInventario();
    }
}
