package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;


@Service
public class InsuranceServiceImpl implements IInsuranceService{

	@Autowired
private IInsuranceRepository insuranceRepository;
	
	
	@Override
	public void addInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		insuranceRepository.addInsurance(insurance);
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		// TODO Auto-generated method stub
		insuranceRepository.updateInsurance(insuranceId, premium);
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		// TODO Auto-generated method stub
		insuranceRepository.deleteInsurance(insuranceId);
	}

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		List<Insurance> insurances = insuranceRepository.findAll();
		if(insurances.isEmpty())
			throw new InsuranceNotFoundException("Insurance not found");
		return insurances;
	}

	@Override
	public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		List<Insurance> insurances = insuranceRepository.findByBrand(brand);
		if(insurances.isEmpty())
			throw new InsuranceNotFoundException("Insurance not found");
		return insurances;
	}

	@Override
	public List<Insurance> getByBrandAndType(String brand, String type) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		List<Insurance> insurances = insuranceRepository.findByBrandAndType(brand, type);
		if(insurances.isEmpty())
			throw new InsuranceNotFoundException("Insurance not found");
		return insurances;
	}

	@Override
	public List<Insurance> getByTypeAndLesserPremium(String type, double premium) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		List<Insurance> insurances = insuranceRepository.findByTypeAndLesserPremium(type, premium);
		if(insurances.isEmpty())
			throw new InsuranceNotFoundException("Insurance not found");
		return insurances;
	}

	@Override
	public Insurance getById(int insuranceId) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		Insurance insurance =insuranceRepository.findById(insuranceId);
		if(insurance==null)
			throw new InsuranceNotFoundException();
		return  insurance;
	}

	

	

}
