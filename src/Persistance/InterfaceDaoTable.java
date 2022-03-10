package Persistance;
import java.util.ArrayList;

import Metier.*;

public interface InterfaceDaoTable<Table> {
   
	    boolean add (Table table);
	    public boolean delete(Table table);
	    public boolean isExiste(Table table);
	    public Table searchById(String id);
	    public ArrayList<Table> getAll();
	    public Boolean update(Table table);
	
}
