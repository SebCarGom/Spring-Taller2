package com.nttdata.SCAGspringtaller2.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepositoryI extends JpaRepository<Delivery, Integer>{

}
