package com.nt.dao;



import java.util.List;

import com.nt.entity.SupplierEntity;



public interface SupplierDao {
	public int addSupplier(SupplierEntity supplierEntity);
	public SupplierEntity getSupplierById(long supplierId);
	public List<SupplierEntity> getAllSupplier();
	public void updateSupplier(SupplierEntity supplierEntity);
	public void deleteSupplier(long supplierId);
}
