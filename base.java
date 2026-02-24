import java.util.Scanner;

public class base {
    
    public objAlmacen [][] ingreseN (objAlmacen [][] m){
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < m.length; i++){
                for(int j = 0; j < m[i].length; j++){

                    System.out.println("Producto en posición [" + i + "][" + j + "]");

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Busqueda: ");
                    String busqueda = sc.nextLine();

                    System.out.print("Precio: ");
                    int precio = sc.nextInt();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine(); 

                     m[i][j] = new objAlmacen(nombre, busqueda, precio, cantidad);
            }
        }

        System.out.print("\nIngrese el nombre del producto a buscar: ");
        String nombreBuscar = sc.nextLine();

        int encontrado = 0;

            for(int i = 0; i < m.length; i++){
                for(int j = 0; j < m[i].length; j++){

                    if(m[i][j].getNombre().equalsIgnoreCase(nombreBuscar)){
                        System.out.println("Producto encontrado en:");
                        System.out.println("Posición [" + i + "][" + j + "]");
                        encontrado = 1;
                    }
                }
            }

            if(encontrado == 0){
                System.out.println("Producto no encontrado.");
            }

        return m; 
    }
}
