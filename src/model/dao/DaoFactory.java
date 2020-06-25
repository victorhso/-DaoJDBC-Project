package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); //vai expor um método que retorna o tipo da interface mas que vai instanciar a implementação
	}
	
	public static DepartmentDAO createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
