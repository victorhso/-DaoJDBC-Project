package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();  
		
		System.out.println("===Teste 1: department findById===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n===Teste 2: Department findAll==");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===Teste 3: department Insert==");		
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		System.out.println("\n===Teste 4: Department Update==");
		Department department2 = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department2);
		System.out.println("Update completed!");
		
		System.out.println("\n===Teste 5: Department delete==");
		System.out.print("Digite um para teste de deletação: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completo!");
		sc.close();
	}
}
