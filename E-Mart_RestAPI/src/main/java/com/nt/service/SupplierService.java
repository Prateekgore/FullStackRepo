package com.nt.service;



import java.util.List;

import com.nt.model.SupplierModel;





public interface SupplierService {
	public int addSupplier(SupplierModel supplierModel);
	public SupplierModel getSupplierById(long supplierId);
	public List<SupplierModel> getAllSuppliers();
	public void updateSupplier(SupplierModel supplierModel);
	public void deleteSupplier(long supplierId);
}
