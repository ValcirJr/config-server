package org.example.configerserver.repository;


import org.example.configerserver.model.MyConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ConfigurationRepository extends JpaRepository<MyConfiguration, Long> {
}
