package com.address.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.address.app.entity.Address;


public interface AddressRepo extends JpaRepository<Address, Integer>
{
        //address based on an employeeid
        @Query(nativeQuery = true, value = "SELECT addr.id, addr.lane1, addr.lane2, addr.state, addr.zip FROM address addr join employee e on (e.id=addr.id) where e.id = ?1")
        Address findAddressByEmployeeId(@Param("id") Integer id);
}
