import connection.Database;
import uwu.Worker;
import uwu.Costumer;
import uwu.Item;

public class main{
	public static void main(String [] args){
		System.out.println("This is Main Program");
		Database.hubungkan();
		Worker.tampilanInfo();
		Costumer.tampilanInfo();
		Item.tampilanInfo();
	}
}