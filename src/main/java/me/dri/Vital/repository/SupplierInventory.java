package me.dri.Vital.repository;

import me.dri.Vital.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierInventory extends JpaRepository<Supplier, Long> {
}
