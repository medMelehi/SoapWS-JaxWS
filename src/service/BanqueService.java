package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(name="BanqueWS")
public class BanqueService {
	@WebMethod(operationName = "ConversionEuroToDh")
public double conversion(@WebParam(name = "montant")double mt) {
	return mt*11.3;
}
	@WebMethod
public Compte getCompte(@WebParam(name = "code")Long code) {
	return new Compte(code,Math.random()*80000,new Date());
}
	
	@WebMethod
public List<Compte> getComtes(){
List<Compte> cpts = new ArrayList<>();
cpts.add(new Compte(1L,Math.random()*80000,new Date()));
cpts.add(new Compte(2L,Math.random()*80000,new Date()));
cpts.add(new Compte(3L,Math.random()*80000,new Date()));
return cpts;
}
}

