package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC(); //vai expor um m�todo que retorna o tipo da interface mas que vai instanciar a implementa��o
	}
}
