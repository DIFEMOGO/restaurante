package ui;

import MODELS.Client;
import MODELS.Product;
import MODELS.Recipe;
import MODELS.Table;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inició el programa");
		
		Client newClient = new Client ("Diego","Molina","1111111", false);
		
		System.out.println("El nuevo cliente es: " + newClient.getName()+ " "+ newClient.getSurName());
		
		newClient.setName("Andres");
		System.out.println("El nuevo cliente es: " + newClient.getName()+ " "+ newClient.getSurName());
	
		newClient.sethasChildren(true);
		System.out.println("El cliente tiene hijos (true/false): " + newClient.gethasChildren());
		
		Client newClient2 =  new Client ("Juan","Lopez","2222", false );
		System.out.println("\n El nuevo cliente 2 es: "+ newClient2.getName()+ " "+ newClient2.getSurName()+" "+ "Cedula:"+ newClient2.getDocumentClient() );
		
		Client newClient3 = new Client ("Fernando","Molina","3333", false);
		System.out.println("\n El nuevo cliente 3 es: "+ newClient3.getName()+ " "+ newClient3.getSurName()+" "+ "Cedula:"+ newClient3.getDocumentClient());
		
		System.out.println("\n Cambio de cedula del Cliente 2: ");
		newClient2.setDocumentClient("6666");
		System.out.println("\n El Cliente 2 es: "+ newClient2.getName()+ " "+ newClient2.getSurName()+" "+ "Cedula:"+ newClient2.getDocumentClient() );
		System.out.println("\n Cambio de cedula del Cliente 3: ");
		newClient3.setDocumentClient("9999");
		System.out.println("\n El Cliente 3 es: "+ newClient3.getName()+ " "+ newClient3.getSurName()+" "+ "Cedula:"+ newClient3.getDocumentClient() );
		
		Product newProduc = new Product("El mejor", "Frijol" ,  1400 , 9 );
		System.out.println("\n PRODUCTO 1" + "\n Marca: "+ newProduc.getBrand()+   "\n Tipo: " + newProduc.getName() + "\n Precio: " + newProduc.getPrice()+ " \n Cantidad: " + newProduc.getQuantity());		
		Product newProduc2 = new Product("Don pancho", "Avena" ,  1100 , 14 );
		System.out.println("\n PRODUCTO 2" + "\n Marca: "+ newProduc2.getBrand()+   "\n Tipo: " + newProduc2.getName() + "\n Precio: " + newProduc2.getPrice()+ " \n Cantidad: " + newProduc2.getQuantity());		
		Product newProduc3 = new Product("Gourmet", "Aceite" ,  15000 , 20 );
		System.out.println("\n PRODUCTO 3" + "\n Marca: "+ newProduc3.getBrand()+   "\n Tipo: " + newProduc3.getName() + "\n Precio: " + newProduc3.getPrice()+ " \n Cantidad: " + newProduc3.getQuantity());		
		
				
		Recipe newRecipe = new Recipe( "Punta de anca" , 28000 );
		System.out.println("\n Menu 1" + "\n Nombre: " + newRecipe.getName()+ "\n Precio: " + newRecipe.getPrice());
		Recipe newRecipe2 = new Recipe( "Ajiaco" , 18000 );
		System.out.println("\n Menu 2" + "\n Nombre: " + newRecipe2.getName()+ "\n Precio: " + newRecipe2.getPrice());
		Recipe newRecipe3 = new Recipe( "Salmon" , 38000 );
		System.out.println("\n Menu 3" + "\n Nombre: " + newRecipe3.getName()+ "\n Precio: " + newRecipe3.getPrice());
		
		System.out.println("\n Mesas: ");
		Table newTable = new Table("Mesa 1:", 2, "Esquina derecha entrada");
		System.out.println(newTable.getTableNumber()+ "\n Su capacidad es: " + newTable.getCapacity() + "\n La Zona es: " + newTable.getLocation());
		Table newTable2 = new Table("Mesa 2:", 4, "Esquina izquierda entrada");
		System.out.println(newTable2.getTableNumber()+ "\n Su capacidad es: " + newTable2.getCapacity() + "\n La Zona es: " + newTable2.getLocation());
		Table newTable3 = new Table("Mesa 3:", 11, "Fondo lado derecho");
		System.out.println(newTable3.getTableNumber()+ "\n Su capacidad es: " + newTable3.getCapacity() + "\n La Zona es: " + newTable3.getLocation());
		
		newProduc.setPrice(23000);
		System.out.println("\n CAMBIO PRODUCTO 3" + "\n Marca: "+ newProduc.getBrand()+   "\n Tipo: " + newProduc.getName() + "\n Precio: " + newProduc.getPrice()+ " \n Cantidad: " + newProduc.getQuantity());		
			
		newRecipe.setName("Trucha");
		System.out.println("\n Cambio Menu 3" + "\n Nombre: " + newRecipe.getName()+ "\n Precio: " + newRecipe.getPrice());
		
		System.out.println("\n Cambios En Las Mesas");
		newTable3.setCapacity(15);
		System.out.println(newTable3.getTableNumber()+ "\n Su capacidad es: " + newTable3.getCapacity() + "\n La Zona es: " + newTable3.getLocation());
		
	
	}

}
