package tp.rest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import tp.model.City;
import tp.model.CityManagerService;

public class MyClient {

	private static final QName SERVICE_NAME= new QName("http://model.tp/", "CityManagerService");
	private static final QName PORT_NAME= new QName("http://model.tp/", "CityManagerPort");

	public static void main(String args[]) throws MalformedURLException {
		URL wsdlURL = new URL("http://127.0.0.1:8084/citymanager?wsdl");
		Service service = Service.create(wsdlURL, SERVICE_NAME);
		CityManagerService cityManager = service.getPort(PORT_NAME, CityManagerService.class);

		System.out.println(cityManager.getCities());
		City c = new City("Zanarkand", 16,64, "Hyrule");
		cityManager.addCity(c);

		System.out.println("city à supprimer : "+c.hashCode());

		cityManager.removeCity(c);

		System.out.println(cityManager.getCities());


	}
}
