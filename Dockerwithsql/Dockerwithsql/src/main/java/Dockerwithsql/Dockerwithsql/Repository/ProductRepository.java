package Dockerwithsql.Dockerwithsql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dockerwithsql.Dockerwithsql.Entity.Product;

public interface ProductRepository extends JpaRepository<Product , Integer>{
	
}
